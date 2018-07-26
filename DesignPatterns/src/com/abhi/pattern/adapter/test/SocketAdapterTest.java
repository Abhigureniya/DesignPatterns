package com.abhi.pattern.adapter.test;

import com.abhi.pattern.adapter.SocketAdapter;
import com.abhi.pattern.adapter.SocketClassAdapterImpl;
import com.abhi.pattern.adapter.SocketObjectAdapterImpl;
import com.abhi.pattern.adapter.Volt;

public class SocketAdapterTest {
	
	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}
	
	public static void testClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);
		System.out.println("v3 volts using class adapter = " + v3.getVolts());
		System.out.println("v12 volts using class adapter = " + v12.getVolts());
		System.out.println("v120 volts using class adapter = " + v120.getVolts());
	}
	
	public static void testObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);
		System.out.println("v3 volts using object adapter = " + v3.getVolts());
		System.out.println("v12 volts using object adapter = " + v12.getVolts());
		System.out.println("v120 volts using object adapter = " + v120.getVolts());
	}
	
	public static Volt getVolt(SocketAdapter socketAdapter, int i) {
		
		switch (i) {
		case 3: return socketAdapter.get3Volt();
		case 12: return socketAdapter.get12Volt();
		case 120: return socketAdapter.get120Volt();
		default: return socketAdapter.get120Volt();
		}
		
	}
	
}
