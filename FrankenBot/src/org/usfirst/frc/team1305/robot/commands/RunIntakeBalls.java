package org.usfirst.frc.team1305.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1305.robot.Robot;
import org.usfirst.frc.team1305.robot.subsystems.Intake;

/**
 *
 */
public class RunIntakeBalls extends Command {
	public RunIntakeBalls() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.intake);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Intake.runIntake();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Intake.fullStopIntake();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Intake.fullStopIntake();
	}
}
