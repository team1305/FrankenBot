package org.usfirst.frc.team1305.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1305.robot.Robot;
import org.usfirst.frc.team1305.robot.subsystems.DriveBase;

/**
 *
 */
public class Drive extends Command {
	public Drive() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.base);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		DriveBase.drive();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		DriveBase.fullStop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		DriveBase.fullStop();
	}
}
