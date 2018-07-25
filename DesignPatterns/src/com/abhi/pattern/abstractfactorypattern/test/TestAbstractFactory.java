package com.abhi.pattern.abstractfactorypattern.test;

import com.abhi.pattern.abstractfactorypattern.abstractfactory.ComputerFactory;
import com.abhi.pattern.abstractfactorypattern.abstractfactory.PCFactory;
import com.abhi.pattern.abstractfactorypattern.abstractfactory.ServerFactory;
import com.abhi.pattern.abstractfactorypattern.model.Computer;

public class TestAbstractFactory {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","2 TB","2.9 GHz"));
		System.out.println("Abstract PC Config : " + pc);
		System.out.println("Abstract Server Config : " + server);
	}
	
}
