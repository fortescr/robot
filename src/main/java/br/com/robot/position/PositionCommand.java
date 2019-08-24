package br.com.robot.position;

import br.com.robot.action.Command;
import br.com.robot.service.Robot;

public class PositionCommand implements Command{

	private Robot robot;
	private Position position;
	private PositionReturn positionReturn;

	public PositionCommand(Robot robot, PositionReturn positionReturn ){
		this.robot = robot;
		this.positionReturn = positionReturn;
		this.position = new PositionImpl();
	}
	
	@Override
	public void execute() {
		position.calcPosition(robot, positionReturn);
	}

}
