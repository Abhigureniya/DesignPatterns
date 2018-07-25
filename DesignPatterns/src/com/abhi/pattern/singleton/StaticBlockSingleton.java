package com.abhi.pattern.singleton;

public class StaticBlockSingleton{
	private static final StaticBlockSingleton STATIC_BLOCK_SINGLETON;
	
	static {
		try {
			STATIC_BLOCK_SINGLETON = new StaticBlockSingleton();
		} catch (Exception exception) {
			throw new RuntimeException("Error occured in creating singleton instance.");
		}
	}
	
	private StaticBlockSingleton() {
	}
	
	public static StaticBlockSingleton getInstance() {
		return STATIC_BLOCK_SINGLETON;
	}
}
