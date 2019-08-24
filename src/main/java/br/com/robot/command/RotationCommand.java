package br.com.robot.command;

import br.com.robot.action.Command;
import br.com.robot.enumeration.Commands;
import br.com.robot.service.Robot;
import br.com.robot.service.Rotation;
import br.com.robot.service.impl.RotationImpl;

public class RotationCommand implements Command {

	private Robot robot;
	private Commands command;
	private Rotation rotation;
	
	public RotationCommand(Robot robot, Commands command) {
		this.robot = robot;
		this.command = command;
		this.rotation = new RotationImpl();
	}
	
	@Override
	public void execute() {
		rotation.toTurn(robot, command);
	}

}
