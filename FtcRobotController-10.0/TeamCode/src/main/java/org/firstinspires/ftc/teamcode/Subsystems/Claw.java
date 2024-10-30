package org.firstinspires.ftc.teamcode.Subsystems;


import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    private CRServo servo1;
    private CRServo servo2;
    private CRServo hinge;

    private boolean isOpen;
    public Claw(HardwareMap hardwareMap)
    {
        isOpen = false;

        servo1 = hardwareMap.crservo.get("servo1");
        servo2 = hardwareMap.crservo.get("servo2");
        hinge = hardwareMap.crservo.get("hinge");
    }

    public void suck(double pow){

        servo1.setPower(-pow);
        servo2.setPower(pow);


    }
    public void spit(double pow){

        servo1.setPower(pow);
        servo2.setPower(-pow);


    }

    public void stop(){
        servo1.setPower(0);
        servo2.setPower(0);
    }

    public void raise(double pos, double pow) {
        hinge.setPower(pow);
    }

    public void lower(double pos, double pow) {
        hinge.setPower(-pow);
    }

    public void hingeStop() {
        hinge.setPower(0);
    }

}