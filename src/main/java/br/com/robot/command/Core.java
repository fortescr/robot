package br.com.robot.command;

import br.com.robot.enumeration.Commands;
import br.com.robot.move.MoveCommand;
import br.com.robot.service.Robot;

public class Core {

	public void process(Robot robot, Commands command) {

		if( command == Commands.L || command == Commands.R ){
			new RotationCommand(robot, command).execute();
		}else if( command == Commands.M  ){
			new MoveCommand(robot).execute();
		}

	}

}
