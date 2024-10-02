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

        public void runToPosition(int pos){

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

}
