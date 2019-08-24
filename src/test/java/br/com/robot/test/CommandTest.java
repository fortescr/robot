package br.com.robot.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.receive.ReceiveCommand;
import br.com.robot.builder.RobotBuilder;
import br.com.robot.enumeration.Coordinates;
import br.com.robot.exception.InvalidCommandReceiveException;
import br.com.robot.exception.MovingInvalidException;
import br.com.robot.position.PositionReturn;
import br.com.robot.service.Robot;

public class CommandTest {

	@Test
	public void
	testMMRMMRMM(){		
		Robot robot = new RobotBuilder().build();
		String commandReceive = "MMRMMRMM";
		
		PositionReturn positionReturn = new PositionReturn();
		new ReceiveCommand(robot, commandReceive, positionReturn).execute();
		
		Assert.assertEquals(2, positionReturn.getPosition().getX());
		Assert.assertEquals(0, positionReturn.getPosition().getY());
		Assert.assertEquals(Coordinates.SOUTH, positionReturn.getDirection());
		Assert.assertEquals("(2, 0, S)", positionReturn.toString());
	}
	
	@Test
	public void
	testMML(){
		
		Robot robot = new RobotBuilder().build();
		String commandReceive = "MML";
		
		PositionReturn positionReturn = new PositionReturn();
		
		new ReceiveCommand(robot, commandReceive, positionReturn).execute();
		
		Assert.assertEquals(0, positionReturn.getPosition().getX());
		Assert.assertEquals(2, positionReturn.getPosition().getY());
		Assert.assertEquals(Coordinates.WEST, positionReturn.getDirection());
		Assert.assertEquals("(0, 2, W)", positionReturn.toString());
	}
	
	@Test(expected=InvalidCommandReceiveException.class)
	public void
	testInvalidA(){
		Robot robot = new RobotBuilder().build();
		String commandReceive = "AAA";
		new ReceiveCommand(robot, commandReceive, new PositionReturn()).execute();
	}
	
	@Test(expected=MovingInvalidException.class)
	public void
	testInvalidM(){
		Robot robot = new RobotBuilder().build();
		String commandReceive = "MMMMMMMMMMMMMMMMMMMMMMMM";
		new ReceiveCommand(robot, commandReceive, new PositionReturn()).execute();
	}	
}
