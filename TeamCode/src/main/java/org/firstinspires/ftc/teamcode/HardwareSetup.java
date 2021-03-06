
package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * Created by TeameurekaRobotics on 12/30/2016
 *
 * This file contains an example Hardware Setup Class.
 *
 * It can be customized to match the configuration of your Bot by adding/removing hardware, and then used to instantiate
 * your bot hardware configuration in all your OpModes. This will clean up OpMode code by putting all
 * the configuration here, needing only a single instantiation inside your OpModes and avoid having to change configuration
 * in all OpModes when hardware is changed on robot.
 *
 * Use Android Studio to Copy this Class, and Paste it into your team's code folder with a new name.
 *
 */

public class HardwareSetup {

   /* Declare Public OpMode members.
    *these are the null statements to make sure nothing is stored in the variables.
    */

    //motors
    public DcMotor motorRight = null;
    public DcMotor motorLeft = null;


    //servos


    //sensors


    /* local OpMode members. */
    HardwareMap hwMap        = null;

    //Create and set default servo positions & MOTOR STOP variables.
    //Possible servo values: 0.0 - 1.0  For CRServo 0.5=stop greater or less than will spin in that direction
    final static double CLOSED = 0.2;
    final static double OPEN = 0.8;
    final static double MOTOR_STOP = 0.0; // sets motor power to zero
    //CR servo variables
    double SpinLeft = 0.1;
    double SpinRight = 0.6;
    double STOP = 0.5;

   /* Constructor   // this is not required as JAVA does it for you, but useful if you want to add
    * function to this method when called in OpModes.
    */
    public HardwareSetup() {
    }

    //Initialize standard Hardware interfaces
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        /************************************************************
         * MOTOR SECTION
         ************************************************************/
        // Define Motors to match Robot Configuration File
        motorRight = hwMap.dcMotor.get("motorRight");
        motorLeft = hwMap.dcMotor.get("motorLeft");


        // Set the drive motor directions:
        motorRight.setDirection(DcMotor.Direction.FORWARD);
        motorLeft.setDirection(DcMotor.Direction.FORWARD);


        //Keep the motors from moving during initialize.
        motorRight.setPower(MOTOR_STOP);
        motorLeft.setPower(MOTOR_STOP);



        // Set motors to run USING or WITHOUT encoders
        // Depending upon your configuration and use
        motorRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);



        /************************************************************
         * SERVO SECTION
         ************************************************************/
        // Define Motors to match Robot Configuration File



        //Set servo hand grippers to open position.





        /************************************************************
         * SENSOR SECTION
         ************************************************************/
        //Define sensors

   }

}

