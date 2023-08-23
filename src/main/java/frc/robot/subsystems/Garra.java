
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
    DoubleSolenoid SCono= new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
    DoubleSolenoid SCubo= new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 2, 3);
    DoubleSolenoid SMarco= new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
    

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
*/

