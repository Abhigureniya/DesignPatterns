package com.abhi.pattern.factorypattern.factory;

import com.abhi.pattern.factorypattern.model.Computer;
import com.abhi.pattern.factorypattern.model.PC;
import com.abhi.pattern.factorypattern.model.Server;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		if(type.equalsIgnoreCase("PC")) {
			return new PC(ram, hdd, cpu);
		}else if(type.equalsIgnoreCase("Server")) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}
	
}
