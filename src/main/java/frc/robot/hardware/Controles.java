package frc.robot.hardware;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DigitalInput;

public class Controles {

    public static Joystick ControlXbox;
    public Joystick ControlPiloto;

    // _____ _ _ _ _ _
    // |_ _| (_) (_) | (_) (_)
    //  | | _ __ _ ___ _ __ _| |_ ______ _ ___ _ ___ _ __
    //  | | | '_ \| | / __| |/ _` | | |_ / _` |/ __| |/ _ \| '_ \
    // _| |_| | | | |  (__| | (_| | | |/ / (_| | (__| | (_) | | | |
    // |_____|_| |_|_|\___|_|\__,_|_|_/___\__,_|\___|_|\___/|_| |_|

    public Controles() {
        ControlXbox = new Joystick(Constantes.puertoXbox);
        ControlPiloto = new Joystick(Constantes.puertoJoystick); 
    }

    // -----------------------------------------------------
    // _ _ _ _
    // | | | | (_) | |
    // | | ___ _ _ ___| |_ _ ___| | __
    // _ | |/ _ \| | | / __| __| |/ __| |/ /
    // | |__| | (_) | |_| \__ \ |_| | (__| <
    // \____/ \___/ \__, |___/\__|_|\___|_|\_\
    // __/ |
    // |___/

    public boolean readJoystickButtons(int id) {
        return (ControlPiloto.getRawButton(id));
    }

    public double readJoystickAxis(int axis) {
        return (ControlPiloto.getRawAxis(axis));
    }


    public int readJoystickDPad() { // obtiene el dpad, conocido tambien como pov
        return (ControlPiloto.getPOV());
    }
    
    // -----------------------------------------------------
    // __ __ ____
    // \ \ / / | _ \
    // \ V / ______ | |_) | _____ __
    // > < |______| | _ < / _ \ \/ /
    // / . \ | |_) | (_) > <
    // /_/ \_\ |____/ \___/_/\_\
    public boolean readPS4Buttons(int id) {
        return (ControlXbox.getRawButton(id));
    }

    public double readPS4Axis(int axis){
        return(ControlXbox.getRawAxis(axis));
    }
    
    public int readPS4DPad() { // obtiene el dpad, conocido tambien como pov
        return (ControlXbox.getPOV());
    }
/*  __ _           _ _                  _ _       _     
  / /(_)_ __ ___ (_) |_   _____      _(_) |_ ___| |__  
 / / | | '_ ` _ \| | __| / __\ \ /\ / / | __/ __| '_ \ 
/ /__| | | | | | | | |_  \__ \\ V  V /| | || (__| | | |
\____/_|_| |_| |_|_|\__| |___/ \_/\_/ |_|\__\___|_| |_| */

    public DigitalInput LMI1 = new DigitalInput(1);
    //public DigitalInput LMI2 = new DigitalInput(2);
    public DigitalInput LMD1 = new DigitalInput(2);
    //public DigitalInput LMD2 = new DigitalInput(3);
    
    // R = READ
    public boolean RLMI1 = LMI1.get();
    //public boolean RLMI2 = LMI2.get();
    public boolean RLMD1 = LMD1.get();
    //public boolean RLMD2 = LMD2.get();



}