package br.com.robot.builder;

import br.com.robot.enumeration.Coordinates;
import br.com.robot.service.Robot;
import br.com.robot.service.impl.RobotImpl;

public class RobotBuilder {

	private Integer y;
	private Integer x;
	private Coordinates direct;

	public RobotBuilder position(Integer x, Integer y){
		this.x = x;
		this.y = y;
		return this;
	}
	
	public RobotBuilder direction(Coordinates direct){
		this.direct = direct;
		return this;
	}
	
	public Robot build(){
		Robot robot = new RobotImpl();
		
		if( direct != null ){
			robot.newDirection(direct);
		}
		
		if(x != null ){
			robot.getPosition().setX(x);
		}
		
		if(y != null ){
			robot.getPosition().setY(y);
		}
		
		return robot;
	}
}
