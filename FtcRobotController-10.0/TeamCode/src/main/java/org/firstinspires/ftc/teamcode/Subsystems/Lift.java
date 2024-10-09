package org.firstinspires.ftc.teamcode.Subsystems;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Main.Constants;


public class Lift {

    private DcMotor slider;

    // "0" is a placeholder--don't get confused Katriel!
    private double Kp = 0;
    private double Ki = 0;
    private double Kd = 0;

    private int reference = 0;
    private int integralSum = 0;
    private int lastError = 0;
    private int penguin = 0;
    private int pos = 0;

    private static ElapsedTime timer = new ElapsedTime();


    Telemetry telemetry;

        public Lift(HardwareMap hardwareMap, Telemetry tele)
    {
        telemetry = tele;

        slider.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        slider.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

      slider = hardwareMap.get(DcMotorEx.class, "slider");


        //The left slide of the lift will drive in reverse:
       // slideLeft.setDirection(DcMotor.Direction.REVERSE);

    }

        public void runToPosition(){

        timer.reset();
        //slider.setTargetPosition(pos);
        //slider.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        reference = pos
        encoderPosition = slider.getPosition();
        error = reference - encoderPosition;

        derivative = (error - lastError) / timer.seconds();
        integralSum = integralSum + (error * timer.seconds());

        out = (Kp * error) + (Ki * integralSum) + (Kd * derivative);

        setPower(out);

        lastError = error;

        timer.reset();
    }

        public void setPower(double pfl)
    {
        slider.setPower(pfl);





    }

    public int ascend() {

        if (penguin = 0) {

            penguin = 1;
            pos = 1;
        }
        else if (penguin = 1) {


            penguin = 2;
            pos = 2;
        }
        return penguin;
    }
    public int descend() {

        if (penguin = 1) {

            penguin = 0;
            pos = 0;
        }

        else if (penguin = 2){

        penguin = 0;
        pos = 0;

        }
        return penguin;
    }


}




// Broken? Operator Slide Code
      if (gamepad2.right_bumper && flibble) {
flibble = false;
        if (slideStop == 1) {
slide_pos = 0;
slide_pos_2 = 0;
        slide_leftAsDcMotor.setTargetPosition(slide_pos);
          slide_rightAsDcMotor.setTargetPosition(slide_pos_2);
          slide_leftAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
          slide_rightAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
slideStop = 0;
        } else if (slideStop == 2) {
slide_pos = -1107;
slide_pos_2 = 1104;
        slide_leftAsDcMotor.setTargetPosition(slide_pos);
          slide_rightAsDcMotor.setTargetPosition(slide_pos_2);
          slide_leftAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
          slide_rightAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
slideStop = 1;
        }
        } else {
        }
        if (gamepad2.left_bumper && flibble) {
flibble = false;
        if (slideStop == 0) {
slide_pos = -1107;
slide_pos_2 = 1104;
        slide_leftAsDcMotor.setTargetPosition(slide_pos);
          slide_rightAsDcMotor.setTargetPosition(slide_pos_2);
          slide_leftAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
          slide_rightAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
slideStop = 1;
        } else if (slideStop == 1) {
slide_pos = -2000;
slide_pos_2 = 2006;
        slide_leftAsDcMotor.setTargetPosition(slide_pos);
          slide_rightAsDcMotor.setTargetPosition(slide_pos_2);
          slide_leftAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
          slide_rightAsDcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
slideStop = 2;
        }
        }