package org.usfirst.frc.team1305.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1305.robot.Robot;
import org.usfirst.frc.team1305.robot.subsystems.Hopper;

/**
 *
 */
public class SpinHopperTable extends Command {
	public SpinHopperTable() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.hopper);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Hopper.spinHopperFeed();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Hopper.fullStopHopper();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Hopper.fullStopHopper();
	}
}
