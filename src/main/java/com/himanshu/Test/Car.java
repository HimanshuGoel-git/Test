package com.himanshu.Test;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	public void drive()
	{
		System.out.print("car drive on road");
	}
}
