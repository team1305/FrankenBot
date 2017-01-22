package org.usfirst.frc.team1305.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1305.robot.Robot;
import org.usfirst.frc.team1305.robot.subsystems.Lift;

/**
 *
 */
public class RunBallFeedLift extends Command {
	public RunBallFeedLift() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.ballLift);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Lift.runLift();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Lift.fullStopLift();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Lift.fullStopLift();
	}
}
