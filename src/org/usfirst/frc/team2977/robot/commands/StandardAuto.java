package org.usfirst.frc.team2977.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class StandardAuto extends CommandGroup {
    
    public  StandardAuto() {
    	addSequential(new GyroCommand(5, 0));
    	addSequential(new GyroCommand(20, 0, 30));
    	addSequential(new GyroTurn(-21));
    	addSequential(new GyroCommand(2, 0));
    	addSequential(new OuttakeCommand(2));
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
