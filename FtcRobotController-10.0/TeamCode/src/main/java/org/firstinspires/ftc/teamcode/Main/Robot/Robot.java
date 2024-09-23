package org.firstinspires.ftc.teamcode.Main.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Main.System;
import org.firstinspires.ftc.teamcode.Subsystems.Claw;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Hinge;
import org.firstinspires.ftc.teamcode.Subsystems.Lift;

public class Robot {
    public Claw claw;
    public Drivetrain drivetrain;
    public Hinge hinge;
    public Lift lift;
    public System system;

    public Robot(HardwareMap hardwareMap, Telemetry tele){
        claw = new Claw(hardwareMap);
        drivetrain = new Drivetrain(hardwareMap, telemetry);
        hinge = new Hinge(hardwareMap);
        lift = new Lift(hardwareMap, telemetry);
        system = new System(telemetry);
    }

    /* public void disable(){
        intake.disable();
        arm.disable();
        driveBase.disable();


    }
     */

    public Claw getClaw(){
        return Claw;
    }
    public Drivetrain getDrivetrain(){
        return Drivetrain;
    }
    public Hinge getHinge(){
        return Hinge;
    }
    public Lift getLift(){
        return Lift;
    }
    public System getSystem(){
        return System;
    }
}