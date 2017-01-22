package org.usfirst.frc.team1305.robot.triggers;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class ReverseControl extends Trigger {

	public static boolean rev = false;
	
    public boolean get() {
        return rev;
    }
    
    public void set(){
    	if(rev){
    		rev = false;
    	}else{
    		rev = true;
    	}
    }
}
