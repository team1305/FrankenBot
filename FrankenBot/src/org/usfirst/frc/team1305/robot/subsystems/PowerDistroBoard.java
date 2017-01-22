package org.usfirst.frc.team1305.robot.subsystems;

import org.usfirst.frc.team1305.robot.RobotMap;
import org.usfirst.frc.team1305.robot.commands.pdpDataOut;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PowerDistroBoard extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public static final PowerDistributionPanel PDP = new PowerDistributionPanel(RobotMap.CAN_DEVICE_PDP);
	
	public static final void clearfault(){
		PDP.clearStickyFaults();
	}
	
	public static void powerDataOut(){
		SmartDashboard.putNumber("PDP Power", PDP.getTotalPower());
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new pdpDataOut());
	}
}
