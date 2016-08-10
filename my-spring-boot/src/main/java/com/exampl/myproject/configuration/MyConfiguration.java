package com.exampl.myproject.configuration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfiguration
{
	@Value("${name}")
	private String name;

	@Value("${my.secret}")
	private String secret;

	@Value("${my.number}")
	private String number;

	@Value("${my.bignumber}")
	private String bignumber;

	@Value("${my.number.less.than.ten}")
	private int ten;

	@Value("${my.number.in.range}")
	private int range;

	@PostConstruct
	public void showName()
	{
		System.out.println(name);// liwen
		System.out.println(secret);// 49ddae63d9b1abbbddb356db46b0c416
		System.out.println(number);// 1554194674
		System.out.println(bignumber);// 65780518132205106
		System.out.println(ten);// 6
		System.out.println(range);// 10343
	}
}
