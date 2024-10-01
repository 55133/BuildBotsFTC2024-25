package org.firstinspires.ftc.teamcode.Subsystems;


import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    private CRServo servo1;
    private CRServo servo2;

private boolean isOpen;
public Claw(HardwareMap hardwareMap)
{
    isOpen = false;

    servo1 = hardwareMap.crservo.get("servo1");
    servo2 = hardwareMap.crservo.get("servo2");
}

public void suck(double pow){

    servo1.setPower(pow);
    servo2.setPower(-pow);


}
public void spit(double pow){

    servo1.setPower(-pow);
    servo2.setPower(pow);


    }

}