package br.com.robot.position;

import br.com.robot.service.Robot;

@FunctionalInterface
public interface Position {

	void calcPosition(Robot robot, PositionReturn positionReturn);

}
