package frc.robot.hardware;


public class Constantes {
//CONSTANTES DE TELEOPERADO, DIVIDIDAS POR SUB SISTEMA:

//  ______   ______     __         ______     ______     ______  
  // /\__  _\ /\  ___\   /\ \       /\  ___\   /\  __ \   /\  == \ 
  // \/_/\ \/ \ \  __\   \ \ \____  \ \  __\   \ \ \/\ \  \ \  _-/ 
  //    \ \_\  \ \_____\  \ \_____\  \ \_____\  \ \_____\  \ \_\   
  //     \/_/   \/_____/   \/_____/   \/_____/   \/_____/   \/_/   
//MOVIMIETO DEL CHASIS
public static final double nerfVelocidad = 0.6; //Un nerf para la velocidad del chasis, puede ir de 0 a 1. 1 es lo más rapido y 0 lo para por completo. 
public static final double correcionDireccion = 0.95; //Un nerf para el lado izquierdo del chasis y que avance en linea recta
public static final double nerfGiro = 0.65; // Un nerf especifico para que el giro no sea tan rápido
public static final double modoDos = 0.3; //Un nerf a la velocidad cuando se entra al modo 2 de conducción lenta, 1 es muy rapido y 0 es stop
//MOVIMIENTO DEL BRAZO
public static final double potenciaBrazo = 0.5;
public static final double potenciaCadena = 0.5;
   /*
    //  ______           __                                                                 
    // /\  _  \         /\ \__                                                              
    // \ \ \L\ \  __  __\ \ ,_\   ___     ___     ___     ___ ___     ___   __  __    ____  
    //  \ \  __ \/\ \/\ \\ \ \/  / __`\ /' _ `\  / __`\ /' __` __`\  / __`\/\ \/\ \  /',__\ 
    //   \ \ \/\ \ \ \_\ \\ \ \_/\ \L\ \/\ \/\ \/\ \L\ \/\ \/\ \/\ \/\ \L\ \ \ \_\ \/\__, `\
    //    \ \_\ \_\ \____/ \ \__\ \____/\ \_\ \_\ \____/\ \_\ \_\ \_\ \____/\ \____/\/\____/
    //     \/_/\/_/\/___/   \/__/\/___/  \/_/\/_/\/___/  \/_/\/_/\/_/\/___/  \/___/  \/___/                                                                                    
   */
//MOVIMIETO DEL CHASIS
public static final double encoderChasisMetros = 0.04517; // Factor de conversion de la posición del encoder a metros, si lo suben el robot se mueve menos en autonomo, si lo bajan se mueve mas
public static final double encoderChasisGrados = 8.6; // Factor de conversion de la posición del encoder a grados en la funcion giro, si lo suben el robot se mueve menos en autonomo, si lo bajan se mueve mas
public static final double encoderBrazoGrados = 1.5; 




    // conecciones de controles -----------------------------------------------------------------------------------------------------------
//      _____                      _                         _____       _           _   
//     / ____|                    (_)                       |  __ \     | |         | |  
//    | |     ___  _ __   _____  ___  ___  _ __   ___  ___  | |__) |___ | |__   ___ | |_ 
//    | |    / _ \| '_ \ / _ \ \/ / |/ _ \| '_ \ / _ \/ __| |  _  // _ \| '_ \ / _ \| __|
//    | |___| (_) | | | |  __/>  <| | (_) | | | |  __/\__ \ | | \ \ (_) | |_) | (_) | |_ 
//     \_____\___/|_| |_|\___/_/\_\_|\___/|_| |_|\___||___/ |_|  \_\___/|_.__/ \___/ \__|          
    
    //limit switch   LM = limit switch    I = izquierda  D = derecha   1 = frente  2 = atrás
    // Alex was here

//-----------------------------------------------------
//      _____            _             _            
//     / ____|          | |           | |           
//    | |     ___  _ __ | |_ _ __ ___ | | ___  ___  
//    | |    / _ \| '_ \| __| '__/ _ \| |/ _ \/ __| 
//    | |___| (_) | | | | |_| | | (_) | |  __/\__ \ 
//     \_____\___/|_| |_|\__|_|  \___/|_|\___||___/ 

public static final int puertoXbox = 0; //no tiene marca roja de TK, controla el chasis
public static final int puertoJoystick = 1; //controla la garra

//-----------------------------------------------------
//    __   __           ____            
//    \ \ / /          |  _ \           
//     \ V /   ______  | |_) | _____  __
//      > <   |______| |  _ < / _ \ \/ /
//     / . \           | |_) | (_) >  < 
//    /_/ \_\          |____/ \___/_/\_\
                                  
// XB stands for X-Box
// B standsFor Button
// L/R Left and Right
// J joystick
// T Trigger

public static final int XB_B_A = 1;
public static final int XB_B_B = 2;
public static final int XB_B_X = 3;
public static final int XB_B_Y = 4;
// botón de torreta

public static final int XB_B_LB = 5;
public static final int XB_B_RB = 6;

public static final int XB_B_Back = 7;
public static final int XB_B_Start = 8;

public static final int XB_B_JL = 9;
public static final int XB_B_JR = 10;

public static final int XB_LJ_X = 0; //0    0
public static final int XB_LJ_Y = 1; //1    1
public static final int XB_RJ_X = 4; //4    3
public static final int XB_RJ_Y = 5; //5    4
  
public static final int XB_LT = 2;
public static final int XB_RT = 3;

//-----------------------------------------------------
//        _                 _   _      _    
//       | |               | | (_)    | |   
//       | | ___  _   _ ___| |_ _  ___| | __
//   _   | |/ _ \| | | / __| __| |/ __| |/ /
//  | |__| | (_) | |_| \__ \ |_| | (__|   < 
//   \____/ \___/ \__, |___/\__|_|\___|_|\_\
//                 __/ |                    
//                |___/  

// LG stands for Logitech
// X,Y,Z Joystick

public static final int LG_XJ = 0;
public static final int LG_YJ = 1;
public static final int LG_ZJ = 2;
public static final int LG_Slider = 3;


//Verifica en DriveTSpark, Elevador, Torreta, e Intake cada boton
public static final int LG_B_Reverse = 11; //DEFINIR UNO

public static final int LG_B1 = 1; //Disparar
public static final int LG_B2 = 2; // Intake
public static final int LG_B3 = 3; // Disco
public static final int LG_B4 = 4;
public static final int LG_B5 = 5; //Secuencia disparar
public static final int LG_B6 = 6; //Secuencia intake
public static final int LG_B7 = 7; //Preparar disparo
public static final int LG_B8 = 8; // Acercar
public static final int LG_B9 = 9; //Intake en el limno
public static final int LG_B10 = 10;
public static final int LG_B11 = 11; //NO se puede ocupar
public static final int LG_B12 = 12; //Destravarse




public static final int Solenoide_Cubo_Deploy = 0;
public static final int Solenoide_Cubo_React = 1;

public static final int Solenoide_Cono_Deploy = 2;
public static final int Solenoide_Cnoo_React = 3;
}