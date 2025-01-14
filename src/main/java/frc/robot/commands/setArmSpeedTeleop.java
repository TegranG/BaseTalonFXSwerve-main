package frc.robot.commands;

import frc.robot.subsystems.ArmSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class setArmSpeedTeleop extends Command {
    private final ArmSubsystem armSubsystem;
    private final double speed;

    public setArmSpeedTeleop(ArmSubsystem armSubsystem, double speed) {
        this.armSubsystem = armSubsystem;
        this.speed = speed;
        addRequirements(armSubsystem);
    }

    @Override
    public void execute() {
        armSubsystem.setSpeed(speed);
    }

    @Override
    public void end(boolean interrupted) {
        armSubsystem.stopArm();
    }
}
