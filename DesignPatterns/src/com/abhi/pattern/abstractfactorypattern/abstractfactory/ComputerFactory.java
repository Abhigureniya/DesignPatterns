package com.abhi.pattern.abstractfactorypattern.abstractfactory;

import com.abhi.pattern.abstractfactorypattern.model.Computer;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
	
}
