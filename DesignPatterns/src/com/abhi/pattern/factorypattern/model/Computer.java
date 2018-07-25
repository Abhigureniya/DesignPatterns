package com.abhi.pattern.factorypattern.model;

public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD= " + this.getHDD() + ", CPU= " + this.getCPU();
	}
}
/*
Factory Pattern is one of the Creational Design pattern and it’s 
widely used in JDK as well as frameworks like Spring and Struts.

>Factory Design Pattern

Factory design pattern is used when we have a super class with multiple sub-classes and based
 on input, we need to return one of the sub-class.This pattern take out the responsibility 
 of instantiation of a class from client program to the factory class.

Some important points about Factory Design Pattern method are;

We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
Notice that based on the input parameter, different subclass is created and returned. 
getComputer is the factory method.

>Factory Design Pattern Advantages
Factory design pattern provides approach to code for interface rather than implementation.
Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.

>Factory Design Pattern Examples in JDK
java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
valueOf() method in wrapper classes like Boolean, Integer etc.


*/