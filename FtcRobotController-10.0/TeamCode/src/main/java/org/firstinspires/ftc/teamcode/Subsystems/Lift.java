package org.firstinspires.ftc.teamcode.Subsystems;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Main.Constants;


public class Lift {

    private DcMotor slideLeft = null;
    private DcMotor slideRight = null;


    Telemetry telemetry;

    public Lift(HardwareMap hardwareMap, Telemetry tele)
    {
        telemetry = tele;

      //  slideLeft = hardwareMap.get(DcMotorEx.class, "slideLeft");
       // slideRight = hardwareMap.get(DcMotorEx.class, "slideRight");

        //The left slide of the lift will drive in reverse:
       // slideLeft.setDirection(DcMotor.Direction.REVERSE);

    }

    public void setPowers(double pfl, double pfr)
    {
        slideLeft.setPower(pfl);
        slideRight.setPower(pfr);




    }

}
