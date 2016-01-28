package org.usfirst.frc.team2977.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2977.robot.commands.GyroCommand;
import org.usfirst.frc.team2977.robot.commands.LifterForward;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	Joystick stick = new Joystick(1);
	Button A = new JoystickButton(stick, 1);
	Button B = new JoystickButton(stick, 2);
	
	public double getLeftY() {
		if (stick.getRawAxis(1) < -.15 | stick.getRawAxis(1)> .15){
			return -stick.getRawAxis(1);
		}
		else {
		return 0;
		}
	}
	
	public double getRightY() { 
		if (stick.getRawAxis(5) < -.15 | stick.getRawAxis(5) > .15) {
			return stick.getRawAxis(5);
					
		}
		else {
			return 0;
		}
		
	}
	public OI() {
		A.whileHeld(new LifterForward());  //Runs the lifter up
		B.whileHeld(new GyroCommand());
	}
			
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

