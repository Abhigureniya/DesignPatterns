package com.abhi.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest{
	
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