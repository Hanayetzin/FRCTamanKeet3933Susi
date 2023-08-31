
package frc.robot.subsystems;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Timer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.hardware.Constantes;



public class Garra {
    DoubleSolenoid SMarco= new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
    public CANSparkMax DriveUp = new CANSparkMax(5, MotorType.kBrushless);// esto no es vdd
    public CANSparkMax DriveDown = new CANSparkMax(6, MotorType.kBrushless);

    RelativeEncoder EncoderUp = DriveUp.getEncoder();
    RelativeEncoder EncoderDown = DriveDown.getEncoder();

    public void Cadena(){
        double potencia = Constantes.potenciaCadena;

      double sensivilidad = 1; 
      DriveDown.setSmartCurrentLimit(150);
      DriveDown.setClosedLoopRampRate(0.5);

      DriveDown.set(-Sensitivity(Robot.control.readJoystickAxis(Constantes.XB_RJ_X), sensivilidad)* potencia);
     
        if(Robot.control.readJoystickButtons(4)){
            DriveDown.set(-0.8);
            // cuando presionas Y la cadena sube

        }
        if(Robot.control.readJoystickButtons(1)){
            DriveDown.set(0.8);
            // cuando presionas A la cadena baja

        }
        

    }
    public double Sensitivity(double X, double a){
        double Power = a*(X*X*X)+(1-a)*X;
 
        return Power;
     }
    public void Intake(){
        double potencia = Constantes.potenciaBrazo;

        double sensivilidad = 1; 
        DriveUp.setSmartCurrentLimit(150);
        DriveUp.setClosedLoopRampRate(0.3);

        DriveUp.set(-Sensitivity(Robot.control.readJoystickAxis(1), sensivilidad)* potencia);
       
        if(Robot.control.readJoystickButtons(3)){
            DriveUp.set(0.5);
            // cuando presionas X la garra absorbe

        }
        if(Robot.control.readJoystickButtons(2)){
            DriveUp.set(-0.5);
            // cuando presionas B la garra lanza

        }
    }
    public void GarraAutonomo(double speed){
        DriveUp.set(speed);
    }
    public void LiftAutonomo(double speed){
        DriveDown.set(speed);
    }
    public void PistonMarco(){
                    if( Robot.control.readJoystickButtons(7)){
                        SMarco.set(Value.kReverse);         
                    }
                    else if (Robot.control.readJoystickButtons(8)){
                        SMarco.set(Value.kForward);
                    }
                    else{
                        SMarco.set(Value.kOff);
                    }
                }

    public void PistonMarcoAbrir(){
                        SMarco.set(Value.kReverse);              
                    }
    public void PistonMarcoCerrar(){
                        SMarco.set(Value.kForward);              
                    }
    public void PistonMarcoOff(){
                        SMarco.set(Value.kOff);              
                    }

    
                }


