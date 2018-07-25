package com.abhi.pattern.prototypepattern.test;

import java.util.List;

import com.abhi.pattern.prototypepattern.prototype.Employees;

public class PrototypePatternTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		Employees empsNew = (Employees)emps.clone();
		Employees empsNew1 = (Employees)emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("E");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("D");
		System.out.println("emps list : " + emps.getEmpList());
		System.out.println("empsNew list : " + list);
		System.out.println("empsNew1 list : " + list1);
	}
	
}
