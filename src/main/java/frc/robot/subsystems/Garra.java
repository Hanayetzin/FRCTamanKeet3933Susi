
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
    public CANSparkMax DriveUp = new CANSparkMax(6, MotorType.kBrushless);// esto no es vdd
    public CANSparkMax DriveDown = new CANSparkMax(7, MotorType.kBrushless);

    RelativeEncoder EncoderUp = DriveUp.getEncoder();
    RelativeEncoder EncoderDown = DriveDown.getEncoder();

    public void Cadena(){
        if(Robot.control.readJoystickButtons(4)){
            DriveDown.set(0.5);
            // cuando presionas Y la cadena sube

        }
        else if(Robot.control.readJoystickButtons(1)){
            DriveDown.set(-0.5);
            // cuando presionas A la cadena baja

        }
    }
    public void Intake(){
        if(Robot.control.readJoystickButtons(3)){
            DriveUp.set(0.5);
            // cuando presionas X la garra absorbe

        }
        else if(Robot.control.readJoystickButtons(2)){
            DriveUp.set(-0.5);
            // Cuando presionas B la garra lanza

        }

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


