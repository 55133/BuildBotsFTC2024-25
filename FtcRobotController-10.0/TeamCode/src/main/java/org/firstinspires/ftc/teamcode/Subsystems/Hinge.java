package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hinge {

    Servo coral;
    private boolean isDown;
    public Hinge(HardwareMap hardwareMap)
    {
      //  coral = hardwareMap.get(Servo.class, "coral");
        isDown = false;
    }

}