package com.exampl.myproject.DisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class MyDisposableBean implements DisposableBean
{
	@Override
	public void destroy() throws Exception
	{
		System.out.println("销毁");
	}
}
