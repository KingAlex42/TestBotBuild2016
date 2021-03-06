package org.usfirst.frc.team2977.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *	Shoots for the High Goal then turns around to reach and breach a defense
 *	This Command is meant for when there is a Terrain Barrier in the 3rd Defense Slot
 */
public class Auto3MidHigh extends CommandGroup {
	//	Timer autoTimer = new Timer();
    public Auto3MidHigh() {
    	addSequential(new MedGyroCommand(5,0));
    	addParallel(new RunKicker());
    	addSequential(new GyroTurn(21));
    	addSequential(new GyroCommand(20, 0, 60));
    	addSequential(new GyroTurn(-21));
    	addSequential(new MedGyroCommand(20, 0, 16));
    	addSequential(new Shoot());
    	addSequential(new RunKicker());
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
