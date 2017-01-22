package org.usfirst.frc.team1305.robot.subsystems;

import org.usfirst.frc.team1305.robot.OI;
import org.usfirst.frc.team1305.robot.RobotMap;
import org.usfirst.frc.team1305.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {

	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static RobotDrive driveBase = new RobotDrive(RobotMap.PWM_LEFT_FRONT_DRIVE_MOTOR, RobotMap.PWM_LEFT_REAR_DRIVE_MOTOR,
			RobotMap.PWM_RIGHT_FRONT_DRIVE_MOTOR, RobotMap.PWM_RIGHT_REAR_DRIVE_MOTOR);
	
	public static void drive(){
		
		driveBase.arcadeDrive(-OI.getDriveaxisY(), OI.getDriveaxisX());
	}
	
	public static void fullStop(){
		driveBase.arcadeDrive(0, 0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
}

