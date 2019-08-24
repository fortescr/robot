package br.com.robot.service.impl;

import br.com.robot.enumeration.Coordinates;
import br.com.robot.position.PositionPrintCommand;
import br.com.robot.service.Area;
import br.com.robot.service.Point;
import br.com.robot.service.Robot;

public class RobotImpl implements Robot {

	private Point position = new PointImpl();
	private Coordinates direction = Coordinates.NORTH;	
	private Area area = new AreaImpl();
	
	public RobotImpl() {
		new PositionPrintCommand(this).execute();
	}
	
	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public Area getArea() {
		return area;
	}	

	@Override
	public Coordinates getDirection() {
		return direction;
	}

	@Override
	public void newDirection(Coordinates direction) {
		this.direction = direction;
	}
}
