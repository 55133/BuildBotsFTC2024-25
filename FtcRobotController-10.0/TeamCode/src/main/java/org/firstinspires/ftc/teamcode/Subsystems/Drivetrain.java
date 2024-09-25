package org.firstinspires.ftc.teamcode.Subsystems;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Main.Constants;


public class Drivetrain {

private DcMotor frontLeft = null;
private DcMotor frontRight = null;
private DcMotor backLeft = null;
private DcMotor backRight = null;

Telemetry telemetry;

public Drivetrain(HardwareMap hardwareMap, Telemetry tele)
 {
     telemetry = tele;

     frontLeft = hardwareMap.get(DcMotorEx.class, "frontLeft");
     frontRight = hardwareMap.get(DcMotorEx.class, "frontRight");
     backLeft = hardwareMap.get(DcMotorEx.class, "backLeft");
     backRight = hardwareMap.get(DcMotorEx.class, "backRight");

     //The left side of the robot (frontLeft and backLeft) will drive in reverse, so double check this code:
     backRight.setDirection(DcMotor.Direction.REVERSE);
     backLeft.setDirection(DcMotor.Direction.REVERSE);
 }

 public void setPowers(double pfl, double pfr, double pbl, double pbr)
 {
     frontLeft.setPower(pfl);
     frontRight.setPower(pfr);
     backLeft.setPower(pbl);
     backRight.setPower(pbr);



 }

}