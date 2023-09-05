/*----------------------------------------------------------------------------*/
/* Tamán Keet 3933 PrepaTec CSF                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
//import frc.robot.hardware.Constantes;
import frc.robot.hardware.Controles;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;


// un motor más 
   


public class Robot extends TimedRobot {

  public static Controles control;
 // public static PnuematicArm Pne;
  public static Garra GarraS;
  public static SparkDrive SparkDT;
  public static Marco MarcoS;
  //public static GiroscopioRobot GirosRo;
  //public static Brazo BrazoS;
  public static ADXRS450_Gyro gyro = new ADXRS450_Gyro();
  

  

  @Override// :)
  public void robotInit() {
   
  //Pne = new PnuematicArm();
    control = new Controles();
   GarraS = new Garra();
   SparkDT = new SparkDrive();
   MarcoS = new Marco();
  // BrazoS = new Brazo();
   CameraServer.startAutomaticCapture();
   CameraServer.startAutomaticCapture(1);
   gyro.calibrate();
  

  

  



   //Pne.PSet();
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

    
  }


   /*
    //  ______           __                                                                 
    // /\  _  \         /\ \__                                                              
    // \ \ \L\ \  __  __\ \ ,_\   ___     ___     ___     ___ ___     ___   __  __    ____  
    //  \ \  __ \/\ \/\ \\ \ \/  / __`\ /' _ `\  / __`\ /' __` __`\  / __`\/\ \/\ \  /',__\ 
    //   \ \ \/\ \ \ \_\ \\ \ \_/\ \L\ \/\ \/\ \/\ \L\ \/\ \/\ \/\ \/\ \L\ \ \ \_\ \/\__, `\
    //    \ \_\ \_\ \____/ \ \__\ \____/\ \_\ \_\ \____/\ \_\ \_\ \_\ \____/\ \____/\/\____/
    //     \/_/\/_/\/___/   \/__/\/___/  \/_/\/_/\/___/  \/_/\/_/\/_/\/___/  \/___/  \/___/                                                                                    
   */
  public void prueba(){
    SparkDT.LimpiarEncoder();
    Timer.delay(3);
    SparkDT.Mover(3, 0.1);
    Timer.delay(1);
    SparkDT.Girar(90,0.2);
  }
  public void centro (){
    SparkDT.LimpiarEncoder();
    GarraS.PistonMarcoAbrir();
    Timer.delay(0.2);
    SparkDT.Mover(0.5, 0.2);   //acerarce para cubo
    Timer.delay(0.1);
    GarraS.LiftAutonomo(-0.8);            //subir elevador
    Timer.delay(1);
    GarraS.GarraAutonomo(-0.5);           //soltar cubo
    Timer.delay(0.1);
    GarraS.LiftAutonomo(0.8);      //bajar elevador
    Timer.delay(1);
    SparkDT.Mover(0.6, -0.25); //chocar rampa
    Timer.delay(1);
    SparkDT.Mover(1.4, -0.1); //subir rampa 
  }

  public void lejos (){
    SparkDT.LimpiarEncoder();
    GarraS.PistonMarcoAbrir();
    Timer.delay(0.2);
    SparkDT.Mover(0.9, 0.2);   //acerarce para cubo
    Timer.delay(0.1);
    GarraS.LiftAutonomo(-0.8);
    Timer.delay(1);
    GarraS.GarraAutonomo(-0.5);
    Timer.delay(0.1);
    GarraS.LiftAutonomo(0.8);
    Timer.delay(1);
    SparkDT.Mover(3.5, -0.3);
  }
  public void cerca (){
    SparkDT.LimpiarEncoder();
    GarraS.PistonMarcoAbrir();
    Timer.delay(0.2);
    SparkDT.Mover(0.9, 0.2);   //acerarce para cubo
    Timer.delay(0.1);
    GarraS.LiftAutonomo(-0.8);
    Timer.delay(1);
    GarraS.GarraAutonomo(-0.5);
    Timer.delay(1);
    GarraS.LiftAutonomo(0.8);
    Timer.delay(1);
    SparkDT.Mover(2, -0.3);
  }

  @Override
  public void autonomousInit() {
   //double gradosAlto = 150;
    //cubo mayor lejos (hasta la derecha de la cancha)

    /* 
    MarcoS.BrazoAutonomo(105, 0.2);
    Timer.delay(0.5);
    SparkDT.Mover(0.62, -0.1);
    Timer.delay(0.2);
    GarraS.Abrir();
    Timer.delay(0.2);
    SparkDT.Mover(0.62, 0.1); //ajuste
    Timer.delay(0.2);
    GarraS.CerrarCono();
    Timer.delay(0.2);
    MarcoS.BrazoAutonomo(15, -0.2);
    Timer.delay(0.3);
    SparkDT.Mover(3.2, 0.32);*/



   prueba();
    //MarcoS.BrazoAutonomo(155, 0.4);
   // Timer.delay(1);
   // MarcoS.BrazoAutonomo(155, -0.2); 

   //lejos();
   //centro();
   //cerca();
    
    



    
    //SparkDT.Girar(90,0.1);
    //SparkDT.Mover(1,-0.1);
    //SparkDT.Mover(1,0.1);
  }
 
  @Override

  public void autonomousPeriodic() {

  }

  
  //  ______   ______     __         ______     ______     ______  
  // /\__  _\ /\  ___\   /\ \       /\  ___\   /\  __ \   /\  == \ 
  // \/_/\ \/ \ \  __\   \ \ \____  \ \  __\   \ \ \/\ \  \ \  _-/ 
  //    \ \_\  \ \_____\  \ \_____\  \ \_____\  \ \_____\  \ \_\   
  //     \/_/   \/_____/   \/_____/   \/_____/   \/_____/   \/_/   
  
  @Override
  public void teleopPeriodic() {
    //Aqui el codigo donde vamos a poner toda la estructura del robot
    GarraS.Intake();
    GarraS.PistonMarco();
    GarraS.Cadena();
    SparkDT.drive();
    //MarcoS.Marcomover();
   // MarcoS.BrazoMover();
    //Pne.Control();
   // GarraS.Cono();
  //GarraS.Cubo();
    double angulo = gyro.getAngle();
    System.out.println("angulo " + angulo);
  

  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
 
}
