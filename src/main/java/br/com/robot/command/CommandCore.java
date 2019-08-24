package br.com.robot.command;

import br.com.robot.action.Command;
import br.com.robot.enumeration.Commands;
import br.com.robot.service.Robot;

public class CommandCore implements Command {

	private Robot robot;
	private Commands commands;
	private Core core;

	public CommandCore(Robot robot, Commands commands) {
		this.robot = robot;
		this.commands = commands;
		this.core = new Core();
	}
	
	@Override
	public void execute() {
		core.process(robot, commands);
	}

}
