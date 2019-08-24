package br.com.receive;

import java.util.Arrays;

import br.com.robot.command.CommandCore;
import br.com.robot.enumeration.Commands;
import br.com.robot.exception.InvalidCommandReceiveException;
import br.com.robot.service.Robot;

public class Receive {

	public void receive(Robot robot, String commandReceive) {
		Commands[] commandConverted = new Commands[commandReceive.length()];
		for(int loop=0; loop < commandReceive.length(); loop++){
			Character item = commandReceive.charAt(loop);
		
			boolean result = Arrays.asList(Commands.values()).toString().indexOf(item) >= 0;
			if (!result ){
				throw new InvalidCommandReceiveException();
			}
			
			commandConverted[loop] = Commands.valueOf(item.toString());
		}
		
		for (Commands command : commandConverted) {
			new CommandCore(robot, command).execute();
		}
	}

}
