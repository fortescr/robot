package br.com.robot.coordinates;

import br.com.robot.exception.MovingInvalidException;
import br.com.robot.service.Robot;

public class MoveNorth {

	public MoveNorth(Robot robot) {
		
 		if( robot.getPosition().getY() == (robot.getArea().getY()-1) ){
			throw new MovingInvalidException();
		}
		
		robot.getPosition().addY();
	}

}
