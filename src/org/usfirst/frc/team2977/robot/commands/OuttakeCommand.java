package org.usfirst.frc.team2977.robot.commands;

import org.usfirst.frc.team2977.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OuttakeCommand extends Command {
	
    public OuttakeCommand() {
    	requires(Robot.ioSubsystem);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    public OuttakeCommand(double duration) {
    	setTimeout(duration);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.ioSubsystem.Outtake();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ioSubsystem.Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.ioSubsystem.Stop();

    }
}
