
package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Timer;


import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


import frc.robot.Robot;
import frc.robot.hardware.Constantes;


public class Marco {

    
    public Timer timer;
    public double encoderConversionBrazo = Constantes.encoderBrazoGrados; 
  
    //public CANSparkMax motorBrazo = new CANSparkMax(5, MotorType.kBrushless);
    
    //RelativeEncoder EncoderBrazo = motorBrazo.getEncoder();
    
    /* 
    public void BrazoMover(){
        double potencia = Constantes.potenciaBrazo;

        double sensivilidad = 1; 
        motorBrazo.setSmartCurrentLimit(150);
        motorBrazo.setClosedLoopRampRate(0.5);

        motorBrazo.set(-Sensitivity(Robot.control.readJoystickAxis(Constantes.XB_LJ_X), sensivilidad)* potencia);
       
        if (Robot.control.readJoystickButtons(4)){
            motorBrazo.set(0);

        }

    }
*/
    public double Sensitivity(double X, double a){
        double Power = a*(X*X*X)+(1-a)*X;
 
        return Power;
     }
    

public void BrazoAutonomo(double Angulo,double velocidad){
        System.out.println("Comienza Mover Brazo");
          int i=24000;
          
          //double pBrazo = EncoderBrazo.getPosition() * encoderConversionBrazo; 
          
         // double pBrazo0 = EncoderBrazo.getPosition() * encoderConversionBrazo;
          //System.out.println("  right "+ pBrazo);
         // System.out.println("  EncoderR "+ EncoderBrazo.getPosition());
     /* 
          while( (pBrazo0 - Angulo) < pBrazo && 0 < velocidad ){
            if(i==24000){
              System.out.println("  pBrazo "+ pBrazo);
              System.out.println("  EncoderR "+ EncoderBrazo.getPosition());
              i=0;
            }
           motorBrazo.set(-velocidad);
            pBrazo = EncoderBrazo.getPosition() * encoderConversionBrazo; 
            i=i+1;
          }
  
          while(  pBrazo < (Angulo + pBrazo0)  &&   velocidad < 0){
            if(i==24000){
              System.out.println("  right " + pBrazo);
              System.out.println("  EncoderR "+EncoderBrazo.getPosition());
              i=0;
            }
            motorBrazo.set(-velocidad);
           
            
            pBrazo = EncoderBrazo.getPosition() * encoderConversionBrazo; 
            i=i+1;
          }
  
          motorBrazo.set(0);
       
          System.out.println("  right "+ pBrazo);
          System.out.println("  EncoderR "+ EncoderBrazo.getPosition());
        
          // System.out.println("X: " + positionX + " - Y: " + positionY + " - A: " + angle);
        //  System.out.println("leftL: " + left + "  rightR: " + right + "  angle: " + angle);
      }
   */
}
}


