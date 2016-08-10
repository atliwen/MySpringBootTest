package com.exampl.myproject.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(0)
@Component
public class Mybean2 implements CommandLineRunner
{
	/**
	 * 将在Spring 启动的时候  调用该方法
	 */
	@Override
	public void run(String... arg0) throws Exception
	{
		System.out.println("启动1");
		for (String string : arg0)
		{
			System.out.println(string);
		}
	}
}
