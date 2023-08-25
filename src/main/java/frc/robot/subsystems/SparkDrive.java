package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Robot;
import frc.robot.hardware.Constantes;



public class SparkDrive {
    public CANSparkMax DriveR1 = new CANSparkMax(3, MotorType.kBrushless);
    public CANSparkMax DriveR2 = new CANSparkMax(4, MotorType.kBrushless);
    public CANSparkMax DriveL1 = new CANSparkMax(1, MotorType.kBrushless);
    public CANSparkMax DriveL2 = new CANSparkMax(2, MotorType.kBrushless);
   
    public double treshold = 0;
    public Timer timer;
      RelativeEncoder EncoderL = DriveL1.getEncoder();
      RelativeEncoder EncoderR = DriveR1.getEncoder();
      RelativeEncoder EncoderL2 = DriveL2.getEncoder();
      RelativeEncoder EncoderR2 = DriveR2.getEncoder();

    // Utils
    boolean switcher = true;
    double encoderConversionMeters = Constantes.encoderChasisMetros;
    double encoderConversionGiro = Constantes.encoderChasisGrados;
    public double nerf = Constantes.nerfVelocidad; //velocidad

    public void encoderReset(){
        DriveL1.restoreFactoryDefaults();
        DriveR1.restoreFactoryDefaults();
        DriveL2.restoreFactoryDefaults();
        DriveR2.restoreFactoryDefaults();
    }

    public void drive(){

        if ((Robot.control.readPS4Buttons(8)) ) {
            switcher = false;
            System.out.print("cambio de modo de conducción a lento");
        }
        else if (Robot.control.readPS4Buttons(7)){
            switcher = true;
            System.out.print("cambio de modo de conducción a ràpido :)");
        }
      


        if (switcher){
            test();
        }
        else {
            UlisesDrive();
        }

        if(Robot.control.readPS4Buttons(Constantes.XB_B_A)){
            DriveL1.set(0);
            DriveL2.set(0);
            DriveR1.set(0);
            DriveR2.set(0);
        }
    }

    public void test(){
       
        double drive =  Robot.control.readPS4Axis(Constantes.XB_LJ_Y);
        double turn  =  -(Robot.control.readPS4Axis (Constantes.XB_RJ_X) * Constantes.nerfGiro);

        double rightPower = drive - turn;
        double leftPower  = drive + turn;

        DriveL1.set(-leftPower *nerf);
        DriveL2.set(-leftPower *nerf);
        DriveR1.set(rightPower * nerf * Constantes.correcionDireccion);
        DriveR2.set(-rightPower *nerf * Constantes.correcionDireccion);   
    

        
        // System.out.println("X: " + positionX + " - Y: " + positionY + " - A: " + angle);
      //  System.out.println("leftL: " + left + "  rightR: " + right + "  angle: " + angle);
    }

    public void UlisesDrive(){
        
        double sensitivity = 1;
       
        double drive2 =  Robot.control.readPS4Axis(Constantes.XB_LJ_Y);
        double turn2  =  -(Robot.control.readPS4Axis (Constantes.XB_RJ_X) * Constantes.nerfGiro);

        double rightPower2 = drive2 -  turn2;
        double leftPower2  = drive2 +  turn2;

        DriveL1.set(- Constantes.modoDos * (Sensitivity( leftPower2, sensitivity)));
        DriveL2.set(- Constantes.modoDos * (Sensitivity( leftPower2, sensitivity)));
        DriveR1.set(- Constantes.modoDos * (Sensitivity( -rightPower2, sensitivity)));
        DriveR2.set(- Constantes.modoDos * (Sensitivity( rightPower2, sensitivity)));   //GERA SI PUEDES IMPLEMENTAR ESTE 

       
    }
    
    public double Sensitivity(double X, double a){
       double Power = a*(X*X*X*X*X)+(1-a)*X;

       return (Power);
    }

    public void LimpiarEncoder(){
     EncoderL.setPosition(0);
     EncoderR.setPosition(0);
     EncoderL2.setPosition(0);
     EncoderR2.setPosition(0);
   }

    public void Mover(double distancia,double velocidad){
      System.out.println("Comienza Mover");
        int i=2400;
        

        double right = EncoderR.getPosition() * encoderConversionMeters; 
        
        double rightzero = EncoderR.getPosition() * encoderConversionMeters;
        System.out.println("  right "+ right);
        System.out.println("  EncoderR "+ EncoderR.getPosition());
        System.out.println("  rightzero "+ rightzero);
        System.out.println("  EncoderR "+ EncoderR.getPosition());
        while( (rightzero - distancia) < right && 0 < velocidad ){
          if(i==2400){
            System.out.println("  right "+ right);
            System.out.println("  EncoderR "+ EncoderR.getPosition());
            i=0;
          }
          DriveL1.set(velocidad);
          DriveR1.set(-velocidad * Constantes.correcionDireccion); 
          DriveL2.set(velocidad);
          DriveR2.set(velocidad * Constantes.correcionDireccion);
        
          right = EncoderR.getPosition() * encoderConversionMeters; 
          i=i+1;
        }

        while(  right < (distancia + rightzero) &&   velocidad < 0){
          if(i==2400){
            System.out.println("  right "+ right);
            System.out.println("  EncoderR "+ EncoderR.getPosition());
            i=0;
          }
          DriveL1.set(velocidad);
          DriveR1.set(-velocidad * Constantes.correcionDireccion); 
          DriveL2.set(velocidad);
          DriveR2.set(velocidad * Constantes.correcionDireccion);
          
          right = EncoderR.getPosition() * encoderConversionMeters; 
          i=i+1;
        }

        DriveL1.set(0);
        DriveR1.set(0); 
        DriveL2.set(0);
        DriveR2.set(0);
        System.out.println("  right "+ right);
        System.out.println("  EncoderR "+ EncoderR.getPosition());
        i=2400;
        // System.out.println("X: " + positionX + " - Y: " + positionY + " - A: " + angle);
      //  System.out.println("leftL: " + left + "  rightR: " + right + "  angle: " + angle);
    }

    public void Girar(double angulo,double speed){
      System.out.println("Comienza Mover");
        int i=2400;
        
        double right = EncoderR.getPosition() * encoderConversionGiro; 
        
        double rightzero = EncoderR.getPosition() * encoderConversionGiro;
        System.out.println("  right "+ right);
        System.out.println("  EncoderR "+ EncoderR.getPosition());
        System.out.println("  rightzero "+ rightzero);
        System.out.println("  EncoderR "+ EncoderR.getPosition());
        while((rightzero - angulo) < right && 0 < speed ){
          if(i==2400){
            System.out.println("  right "+right);
            System.out.println("  EncoderR "+EncoderR.getPosition());
            i=0;
          }
          DriveL1.set(-speed);
          DriveR1.set(-speed * Constantes.correcionDireccion); 
          DriveL2.set(-speed);
          DriveR2.set(speed * Constantes.correcionDireccion);
        
          right = EncoderR.getPosition() * encoderConversionGiro; 
          i=i+1;
        }

        while( right < (angulo + rightzero)  &&   speed < 0){
          if(i==2400){
            System.out.println("  right "+ right);
            System.out.println("  EncoderR "+ EncoderR.getPosition());
            i=0;
          }
          DriveL1.set(-speed);
          DriveR1.set(-speed * Constantes.correcionDireccion); 
          DriveL2.set(-speed);
          DriveR2.set(speed * Constantes.correcionDireccion);
          
          right = EncoderR.getPosition() * encoderConversionGiro; 
          i=i+1;
        }

        DriveL1.set(0);
        DriveR1.set(0); 
        DriveL2.set(0);
        DriveR2.set(0);
        System.out.println("  right "+right);
        System.out.println("  EncoderR "+EncoderR.getPosition());
        i=2400;
        // System.out.println("X: " + positionX + " - Y: " + positionY + " - A: " + angle);
      //  System.out.println("leftL: " + left + "  rightR: " + right + "  angle: " + angle);
    }
    

    }




