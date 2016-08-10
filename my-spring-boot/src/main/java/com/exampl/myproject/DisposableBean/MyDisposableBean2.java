package com.exampl.myproject.DisposableBean;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class MyDisposableBean2
{
	@PreDestroy
	public void destroy()
	{
		System.out.println("销毁");
	}
}
