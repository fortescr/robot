package br.com.robot.coordinates;

import br.com.robot.exception.MovingInvalidException;
import br.com.robot.service.Robot;

public class MoveSouth {

	public MoveSouth(Robot robot) {

		if( robot.getPosition().getY() == (robot.getArea().getInitY()) ){
			throw new MovingInvalidException();
		}
		
		robot.getPosition().decreaseY();
	}

}
