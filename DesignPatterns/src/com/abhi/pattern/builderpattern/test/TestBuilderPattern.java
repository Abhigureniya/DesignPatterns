package com.abhi.pattern.builderpattern.test;

import com.abhi.pattern.builderpattern.builder.Computer;

public class TestBuilderPattern {
	
	public static void main(String[] args) {
		Computer cp1 = new Computer.ComputerBuider("2GB", "500GB", "2.9GHz").build();
		Computer cp2 = new Computer.ComputerBuider("2GB", "500GB", "2.9GHz").setBluetoothEnabled(true).build();
		Computer cp3 = new Computer.ComputerBuider("2GB", "500GB", "2.9GHz")
						.setBluetoothEnabled(true)
						.setGraphirCardEnabled(true)
						.build();
		
		System.out.println(cp1);
		System.out.println(cp2);
		System.out.println(cp3);
		
	}
	
}
