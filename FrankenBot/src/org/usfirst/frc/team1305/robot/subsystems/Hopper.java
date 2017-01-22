package org.usfirst.frc.team1305.robot.subsystems;

import org.usfirst.frc.team1305.robot.OI;
import org.usfirst.frc.team1305.robot.Robot;
import org.usfirst.frc.team1305.robot.RobotMap;
import org.usfirst.frc.team1305.robot.commands.SpinHopperTable;
import org.usfirst.frc.team1305.robot.triggers.ReverseControl;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Hopper extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static Talon hopperMotors = new Talon(RobotMap.PWM_HOPPER_MOTOR);
	
	public static void spinHopperFeed(){
		if(OI.getHopperButton()){
			hopperMotors.setSpeed(1.0);
		}else if(OI.getHopperButton() && OI.cRevers.get()){
			hopperMotors.setSpeed(-1.0);
		}
		else{
			hopperMotors.setSpeed(0.0);
		}
	}
	
	public static void fullStopHopper(){
		hopperMotors.setSpeed(0.0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new SpinHopperTable());
	}
}
