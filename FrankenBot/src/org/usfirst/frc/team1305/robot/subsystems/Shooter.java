package org.usfirst.frc.team1305.robot.subsystems;

import org.usfirst.frc.team1305.robot.OI;
import org.usfirst.frc.team1305.robot.RobotMap;
import org.usfirst.frc.team1305.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static final Talon shooterTalon = new Talon(RobotMap.PWM_SHOOTER_MOTOR);
	
	public static void runShoot(){
		if(OI.getShooterButton() == true){
			shooterTalon.setSpeed(1.0);
		}else{
			shooterTalon.setSpeed(0.0);
		}
	}
	
	public static void fullStopShoot(){
		shooterTalon.setSpeed(0.0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new Shoot());
	}
}
