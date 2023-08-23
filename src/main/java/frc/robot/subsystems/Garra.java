
package frc.robot.subsystems;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/* 
public class Garra {
    DoubleSolenoid SCono= new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
    DoubleSolenoid SCubo= new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 2, 3);
    DoubleSolenoid SMarco= new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
    
    public void Cono(){

        if((Robot.control.readJoystickAxis(3) == 1)){
            SCono.set(Value.kReverse);
            SCubo.set(Value.kReverse);
        }
        else if (Robot.control.readJoystickButtons(3)){
            SCono.set(Value.kForward);
        }
        else{
           
            SCono.set(Value.kOff);
        }
    }
    public void Cubo(){

        if(Robot.control.readJoystickAxis(2) == 1){
                SCubo.set(Value.kReverse);         
         }
        else if (Robot.control.readJoystickButtons(3) ){
            SCubo.set(Value.kForward);
            }
        else{        
            SCubo.set(Value.kOff);
            }
        }

        public void CerrarCubo(){
            SCono.set(Value.kForward);
            SCubo.set(Value.kReverse);
            }

        public void CerrarCono(){
                SCono.set(Value.kReverse);
                SCubo.set(Value.kReverse);
                }

        public void Abrir(){
                SCono.set(Value.kForward);
                SCubo.set(Value.kForward);
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
                

*/