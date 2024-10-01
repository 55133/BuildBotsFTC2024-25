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

        
    }

    public void setPower(double pfl)
    {
        slider.setPower(pfl);





    }

}
