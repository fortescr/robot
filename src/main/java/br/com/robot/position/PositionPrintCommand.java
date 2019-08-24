package br.com.robot.position;

import br.com.robot.action.Command;
import br.com.robot.service.Robot;

public class PositionPrintCommand implements Command {

	private Robot robot;
	private PositionPrint positionReturn;
	
	public PositionPrintCommand(Robot robot) {
		this.robot = robot;
		this.positionReturn = new PositionPrint();
	}
	
	@Override
	public void execute() {
		positionReturn.print(robot);		
	}

}
