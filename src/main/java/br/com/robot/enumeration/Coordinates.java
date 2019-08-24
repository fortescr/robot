package br.com.robot.enumeration;

public enum Coordinates {

	NORTH("N"), 
	SOUTH("S"), 
	EAST("E"),
	WEST("W");
	
	private String value;
	
	private Coordinates(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
