package com.abhi.pattern.builderpattern.builder;

public class ComputerBuilderDirector {
	
	public Computer getBasicComputer() {
		return new Computer.ComputerBuider("2GB", "500GB", "2.5GHz").build();
	}
	
	public Computer getGraphicCardEnabledComputer() {
		return new Computer.ComputerBuider("2GB", "500GB", "2.5GHz").setGraphirCardEnabled(true).build();
	}
	
}
