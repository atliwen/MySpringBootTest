package com.exampl.myproject.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exampl.myproject.exceptionhandler.MyException;

@RestController
@RequestMapping("/")
public class MyTest
{

	@RequestMapping(method = RequestMethod.GET)
	public String greeting() throws Exception
	{
		throw new Exception("出错啦");
		// return "Hello World!";
	}

	@RequestMapping("/json")
	public String json() throws MyException
	{
		throw new MyException("发生错误2");
	}
}
