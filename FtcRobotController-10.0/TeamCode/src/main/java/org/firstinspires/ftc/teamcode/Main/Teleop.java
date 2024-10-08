package org.firstinspires.ftc.teamcode.Main;

//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.internal.system.AppUtil;
import org.firstinspires.ftc.teamcode.Subsystems.Claw;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Hinge;
import org.firstinspires.ftc.teamcode.Subsystems.Lift;
import com.qualcomm.robotcore.hardware.CRServo;

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
        telemetry.addData("Robot Mode: ", mode);
        telemetry.update();

        double y = -gamepad1.left_stick_y;
        double x = -gamepad1.left_stick_x * 1.1;
        double rx = gamepad1.right_stick_x;

        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double frontLeftPower = (y + x + rx) / denominator; //TODO: Change the x back to pos and make these a coord plane type thing
        double backLeftPower = (y - x + rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;

        drivetrain.setPowers(frontLeftPower,frontRightPower,backLeftPower,backRightPower);

        if(gamepad1.a){
          claw.suck();
        }

        else if(gamepad1.b){
          claw.spit();
        }

        else {
          claw.stop();
        }

        if (gamepad1.y){

         lift.ascend()
        }

        else if (gamepad1.x){

            lift.descend()
        }

        lift.runToPosition();
    }

    @Override
    public void stop() {
    mode = Robot_Mode.DISABLED;
    }

}

