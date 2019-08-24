package br.com.robot.service;

import br.com.robot.enumeration.Commands;

@FunctionalInterface
public interface Rotation {

	void toTurn(Robot robot, Commands command);

}
