package com.wallace.motan;

public class EmployeeServiceImpl implements EmployeeService {
	
	public String hello(String name) {
        System.out.println(name + " invoked employee service");
        return "Hello " + name + ", it's greeting from employee service (group v2)";
    }
}
