package br.com.robot.position;

import br.com.robot.service.Point;
import br.com.robot.service.Robot;

public class PositionImpl implements Position {

	@Override
	public void calcPosition(Robot robot, PositionReturn positionReturn) {
		Point position = robot.getPosition();
		positionReturn.set(position);
		positionReturn.setDirection(robot.getDirection());
	}

}
