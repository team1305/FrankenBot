package org.usfirst.frc.team1305.robot.subsystems;

import org.usfirst.frc.team1305.robot.OI;
import org.usfirst.frc.team1305.robot.Robot;
import org.usfirst.frc.team1305.robot.RobotMap;
import org.usfirst.frc.team1305.robot.commands.RunIntakeBalls;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static final Talon intakeTalon = new Talon(RobotMap.PWM_INTAKE_MOTOR);
	
	public static void runIntake(){
		if(OI.getIntakeButton() == true){
			intakeTalon.setSpeed(1.0);
		}else if(OI.getIntakeButton() && OI.cRevers.get()){
			intakeTalon.setSpeed(-1.0);
		}else{
			intakeTalon.setSpeed(0.0);
		}
	}
	
	public static void fullStopIntake(){
		intakeTalon.setSpeed(0.0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new RunIntakeBalls());
	}
}
