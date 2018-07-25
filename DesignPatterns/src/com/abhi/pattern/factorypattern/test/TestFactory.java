package com.abhi.pattern.factorypattern.test;

import com.abhi.pattern.factorypattern.factory.ComputerFactory;
import com.abhi.pattern.factorypattern.model.Computer;

public class TestFactory {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("Server", "16 GB", " 2 TB", " 2.9 GHz");
		
		System.out.println("Factory PC config :: " + pc);
		System.out.println("Factory Server config :: " + server);
	}
	
}
