package br.com.robot.move;

import br.com.robot.action.Command;
import br.com.robot.position.PositionPrintCommand;
import br.com.robot.service.Move;
import br.com.robot.service.Robot;
import br.com.robot.service.impl.MoveImpl;

public class MoveCommand implements Command {

	private Robot robot;
	private Move move;
	
	public MoveCommand(Robot robot) {
		this.robot = robot;
		this.move = new MoveImpl();
	}
	
	@Override
	public void execute() {
		move.moving(robot);
		new PositionPrintCommand(robot).execute();
	}

}
