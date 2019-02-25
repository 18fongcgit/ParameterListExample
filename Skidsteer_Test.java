package org.firstinspires.ftc.teamcode.skidsteer_base;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.framework.opModes.AbstractTeleop;
import org.firstinspires.ftc.teamcode.framework.userHardware.RoundNumber;
import org.firstinspires.ftc.teamcode.framework.userHardware.inputs.sensors.DistanceSensor2m;
import org.firstinspires.ftc.teamcode.framework.userHardware.inputs.sensors.SonarMB1240;
import org.firstinspires.ftc.teamcode.skidsteer_base.hardware.Robot;

@TeleOp(name="SkidSteer_Test", group="New")
//@Disabled

public class Skidsteer_Test extends AbstractTeleop {


    RobotParameterList robotparams;



    @Override
    public void RegisterEvents() {


    }

    @Override
    public void UpdateEvents()
    {

    }

    @Override
    public void Init() {
       robotparams = new RobotParameterList();
    }

    @Override
    public void Loop() {

        telemetry.addData(" parameter ARM_DUMP_POSITION = ",
                robotparams.getParamValueInt("ARM_DUMP_POSITION"));

        telemetry.addData(" parameter UP_SPEEDUP_SLOW = ",
                robotparams.getParamValueDouble("UP_SPEEDUP_SLOW"));

        telemetry.addData(" parameter POSITION = ",
                robotparams.getParamValueInt("POSITION"));

        telemetry.addData(" parameter ANGLE = " +
                robotparams.getParamValueDouble("ANGLE") );


        telemetry.addData("hello");
        telemetry.addData("hello1");
        telemetry.addData("hello2");
        telemetry.addData("hello3");
        telemetry.update();
    }

    @Override
    public void Stop() {

    }


}