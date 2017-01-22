package org.usfirst.frc.team1305.robot.subsystems;

import org.usfirst.frc.team1305.robot.OI;
import org.usfirst.frc.team1305.robot.Robot;
import org.usfirst.frc.team1305.robot.RobotMap;
import org.usfirst.frc.team1305.robot.commands.RunBallFeedLift;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static final Talon liftTalon = new Talon(RobotMap.PWM_LIFT_MOTOR);
	
	public static void runLift(){
		if(OI.getLiftButton() == true){
			liftTalon.setSpeed(1.0);
		}
		else if(OI.getLiftButton() && OI.cRevers.get()){
			liftTalon.setSpeed(-1.0);
		}
		else{
			liftTalon.setSpeed(0.0);
		}
	}
	
	public static void fullStopLift(){
		liftTalon.setSpeed(0.0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new RunBallFeedLift());
	}
}
