package org.firstinspires.ftc.teamcode.Main;

//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.internal.system.AppUtil;
import org.firstinspires.ftc.teamcode.Subsystems.Claw;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Hinge;
import org.firstinspires.ftc.teamcode.Subsystems.Lift;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Hey, remember to rename Teleop.java to TeleOp.java if anything gets weird

@TeleOp
public class Teleop extends OpMode
{
    Claw claw;
    Drivetrain drivetrain;
    Hinge hinge;
    Lift lift;
    System system;

    Robot_Mode mode;

    @Override
    public void init()
    {
    claw = new Claw(hardwareMap);
    drivetrain = new Drivetrain(hardwareMap, telemetry);
    hinge = new Hinge(hardwareMap);
    lift = new Lift(hardwareMap, telemetry);
    system = new System(telemetry);

    mode = Robot_Mode.TELEOP_STARTING;
        telemetry.addData("Status: ", "Initialized");
        telemetry.addData("Robot Mode: ", mode);
    }
    @Override
    public void loop()
    {
        mode = Robot_Mode.TELEOP_RUNNING;
        telemetry.update();
    }
}