package com.exampl.myproject.commandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class Mybean implements CommandLineRunner
{

	private static final Logger log = LoggerFactory.getLogger(Mybean.class);

	/**
	 * 将在Spring 启动的时候  调用该方法
	 */
	@Override
	public void run(String... arg0) throws Exception
	{
		System.out.println("启动0");

		/*
		 * for (int i = 0; i < 100000; i++) { log.info("111"); }
		 */

		for (String string : arg0)
		{
			System.out.println(string);
		}
	}
}
