package br.com.receive;

import br.com.robot.action.Command;
import br.com.robot.position.PositionCommand;
import br.com.robot.position.PositionReturn;
import br.com.robot.service.Robot;

public class ReceiveCommand implements Command {

	private Robot robot;
	private String commandReceive;
	private Receive receive;
	private PositionReturn positionReturn;

	public ReceiveCommand(Robot robot, String commandReceive, PositionReturn positionReturn) {
		this.robot = robot;
		this.commandReceive = commandReceive;
		this.positionReturn = positionReturn;
		this.receive = new Receive();
	}

	@Override
	public void execute() {
		receive.receive(robot, commandReceive);
		new PositionCommand(robot, positionReturn).execute();
	}

}
