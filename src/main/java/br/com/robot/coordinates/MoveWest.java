package br.com.robot.coordinates;

import br.com.robot.exception.MovingInvalidException;
import br.com.robot.service.Robot;

public class MoveWest {

	public MoveWest(Robot robot) {

		if (robot.getPosition().getX() == robot.getArea().getInitX() ) {
			throw new MovingInvalidException();
		}

		robot.getPosition().decreaseX();
	}

}
