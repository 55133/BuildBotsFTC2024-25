package org.firstinspires.ftc.teamcode.Subsystems;


import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    Servo snappy;
private boolean isOpen;
public Claw(HardwareMap hardwareMap)
{
    snappy = hardwareMap.get(Servo.class, "snappy");
    isOpen = false;
}

}