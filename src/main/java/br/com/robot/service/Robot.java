package br.com.robot.service;

import br.com.robot.enumeration.Coordinates;

public interface Robot {

	Coordinates getDirection();

	void newDirection(Coordinates direction);

	Point getPosition();

	Area getArea();

	
}
