package br.com.robot.service.impl;

import br.com.robot.coordinates.MoveEast;
import br.com.robot.coordinates.MoveNorth;
import br.com.robot.coordinates.MoveSouth;
import br.com.robot.coordinates.MoveWest;
import br.com.robot.enumeration.Coordinates;
import br.com.robot.service.Move;
import br.com.robot.service.Robot;

public class MoveImpl implements Move {

	@Override
	public void moving(Robot robot) {
		
		if( robot.getDirection() == Coordinates.NORTH ){
			new MoveNorth(robot);
		} else if( robot.getDirection() == Coordinates.EAST ){
			new MoveEast(robot);
		} else if( robot.getDirection() == Coordinates.SOUTH ){
			new MoveSouth(robot);
		} else if( robot.getDirection() == Coordinates.WEST ){
			new MoveWest(robot);
		}
		
	}

}
