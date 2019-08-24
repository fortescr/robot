package br.com.robot.service.impl;

import br.com.robot.enumeration.Commands;
import br.com.robot.enumeration.Coordinates;
import br.com.robot.service.Robot;
import br.com.robot.service.Rotation;

public class RotationImpl implements Rotation {

	private static final int FIRST_POSITION = 0;
	private static final int LAST_POSITION = 3;
	private static final Coordinates[] DIRETIONS = {Coordinates.NORTH, Coordinates.EAST, Coordinates.SOUTH, Coordinates.WEST}; 
	
	@Override
	public void toTurn(Robot robot, Commands command) {
		int myDirection = discoveryMyDirection(robot);
		int newMyDirection = newDiretion(myDirection, command);
		robot.newDirection(DIRETIONS[newMyDirection]);
	}

	private int newDiretion(int myDirection, Commands command) {
		
		if(Commands.R == command && myDirection < LAST_POSITION){
			return myDirection +1;
		}else if(Commands.R == command && myDirection == LAST_POSITION){
			return FIRST_POSITION;
		}else if(Commands.L == command && myDirection > FIRST_POSITION){
			return myDirection -1;
		}else if(Commands.L == command && myDirection == FIRST_POSITION){
			return LAST_POSITION;
		}
		
		return myDirection;
	}

	private int discoveryMyDirection(Robot robot) {
		int pos = 0;
		for (Coordinates direction : DIRETIONS) {
			if( robot.getDirection() == direction ){
				return pos;
			}
			pos++;
		}
		return pos;
	}

}
