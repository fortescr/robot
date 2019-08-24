package br.com.robot.coordinates;

import br.com.robot.exception.MovingInvalidException;
import br.com.robot.service.Robot;

public class MoveEast {

	public MoveEast(Robot robot) {

		if (robot.getPosition().getX() == (robot.getArea().getX()-1) ) {
			throw new MovingInvalidException();
		}

		robot.getPosition().addX();
	}

}
