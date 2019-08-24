package br.com.robot.position;

import br.com.robot.enumeration.Coordinates;
import br.com.robot.service.Point;

public class PositionReturn {

	private Point position;
	private Coordinates direction;
	
	
	public Coordinates getDirection() {
		return direction;
	}

	void setDirection(Coordinates direction) {
		this.direction = direction;
	}

	void set(Point position) {
		this.position = position;
	}

	public Point getPosition() {
		return position;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(position.getX());
		sb.append(", ");
		sb.append(position.getY());
		sb.append(", ");
		sb.append(direction.getValue());
		sb.append(")");
		
		return sb.toString();
	}
}
