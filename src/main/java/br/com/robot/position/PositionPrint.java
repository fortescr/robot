package br.com.robot.position;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import br.com.robot.enumeration.Coordinates;
import br.com.robot.service.Robot;

public class PositionPrint {

	private static final EnumMap<Coordinates, String> SIMBOLS = new EnumMap<>(Coordinates.class);
	private static final Map<Integer, Integer> POS_INVERT = new HashMap();
	
	static {
		SIMBOLS.put(Coordinates.NORTH, "^");
		SIMBOLS.put(Coordinates.EAST, ">");
		SIMBOLS.put(Coordinates.SOUTH, "$");
		SIMBOLS.put(Coordinates.WEST, "<");
		
		POS_INVERT.put(0, 4);
		POS_INVERT.put(1, 3);
		POS_INVERT.put(2, 2);
		POS_INVERT.put(3, 1);
		POS_INVERT.put(4, 0);
	}
	
	public void print(Robot robot) {

		PositionReturn positionReturn = new PositionReturn();
		new PositionCommand(robot, positionReturn).execute();

		for( int top=robot.getArea().getInitX(); top < robot.getArea().getX(); top++) {
			System.out.print("--");
		}
		
		System.out.println("");
		
		for( int line=robot.getArea().getInitX(); line < robot.getArea().getX(); line++) {
			
			for( int cols=robot.getArea().getInitY(); cols < robot.getArea().getY(); cols++) {
				
				int lineCorrectPositionY = POS_INVERT.get(positionReturn.getPosition().getY());
				
				if( cols == positionReturn.getPosition().getX() && line == lineCorrectPositionY ){
					System.out.print("|"+ SIMBOLS.get(robot.getDirection()) );
				}else{
					System.out.print("| ");
				}
			}
			
			System.out.print("| ");
			System.out.println("");
			
		}
		
		for( int botton=robot.getArea().getInitX(); botton < robot.getArea().getX(); botton++) {
			System.out.print("--");
		}
	}

}
