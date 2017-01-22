package org.usfirst.frc.team1305.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// Can devices
	public static int CAN_DEVICE_PDP = 0;
	
	// Drive Motors
	public static int PWM_LEFT_FRONT_DRIVE_MOTOR = 0;
	public static int PWM_RIGHT_FRONT_DRIVE_MOTOR = 2;
	public static int PWM_LEFT_REAR_DRIVE_MOTOR = 1;
	public static int PWM_RIGHT_REAR_DRIVE_MOTOR = 3;
	
	// Payload Motors
	public static int PWM_INTAKE_MOTOR = 4;
	public static int PWM_HOPPER_MOTOR = 5;
	public static int PWM_SHOOTER_MOTOR = 6;
	public static int PWM_LIFT_MOTOR = 7;
	
}
