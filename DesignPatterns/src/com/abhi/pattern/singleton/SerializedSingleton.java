package com.abhi.pattern.singleton;

import java.io.Serializable;


public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -6955558232836022326L;
	
	private SerializedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	private static class SingletonHelper{
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve() {
		System.out.println("ReadResolve");
		return getInstance();

	}
	
}
