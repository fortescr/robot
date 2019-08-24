package br.com.robot.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.receive.ReceiveCommand;
import br.com.robot.builder.RobotBuilder;
import br.com.robot.position.PositionReturn;
import br.com.robot.service.Robot;

@RestController
public class RobotRest {

	@RequestMapping(value="/rest/mars/{command}", method=RequestMethod.POST)
	@ResponseBody
    public String marks(@PathVariable(value="command", required=true) String commands) {
		Robot robot = new RobotBuilder().build();
		PositionReturn positionReturn = new PositionReturn();
		new ReceiveCommand(robot, commands, positionReturn).execute();
		return positionReturn.toString();
    }
	
}
