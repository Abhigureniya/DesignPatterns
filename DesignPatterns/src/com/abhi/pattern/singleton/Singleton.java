package com.abhi.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		enumSingleton.doSomething();
		
		
		/*EnumSingleton es1 = EnumSingleton.INSTANCE;
		EnumSingleton es2 = null;
		for(Constructor c : EnumSingleton.class.getDeclaredConstructors()) {
			c.setAccessible(true);
			es2 = (EnumSingleton)c.newInstance();
		}
		System.out.println(es1 == es2);*/
	}
	
}

class EagerInitializedSingleton{
	
	private static final EagerInitializedSingleton EAGER_INITIALIZED_SINGLETON = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {	
	}
	
	public static EagerInitializedSingleton getInstance() {
		return EAGER_INITIALIZED_SINGLETON;
	}
	
}

class StaticBlockSingleton{
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

class LazyInitializedSingleton{
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {
		
	}
	
	public static LazyInitializedSingleton getInstance() {
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}

class ThreadSafeSingleton{
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
	
}

class BillPughSingleton{
	
	private BillPughSingleton() {
		
	}
	
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}

class ReflectionSingletonTest{
	
	public static void main(String[] args) {
		
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		
		try {
			
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton)constructor.newInstance();
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
	
}

enum EnumSingleton{
	
	INSTANCE;
	
	public static void doSomething() {
		System.out.println("Some Action");
	}
	
}

class SerializedSingleton implements Serializable {

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

class SingletonSerializedTest{
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
		oos.writeObject(instanceOne);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton)ois.readObject();
		ois.close();
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
	}
	
}

/**
 * Notes:-
 >Java Singleton
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
The singleton class must provide a global access point to get the instance of the class.
Singleton pattern is used for logging, drivers objects, caching and thread pool.
Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.

>Java Singleton Pattern
To implement Singleton pattern, we have different approaches but all of them have following common concepts.

Private constructor to restrict instantiation of the class from other classes.
Private static variable of the same class that is the only instance of the class.
Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.

In further sections, we will learn different approaches of Singleton pattern implementation and design concerns with the implementation.

1. Eager initialization
2. Static block initialization
3. Lazy Initialization
4. Thread Safe Singleton
5. Bill Pugh Singleton Implementation
6. Using Reflection to destroy Singleton Pattern
7. Enum Singleton
8. Serialization and Singleton
 * */
