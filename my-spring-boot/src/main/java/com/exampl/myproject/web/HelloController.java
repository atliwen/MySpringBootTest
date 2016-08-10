package com.exampl.myproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("td")
public class HelloController
{
	@RequestMapping(method = RequestMethod.GET)
	public String index()
	{
		System.out.println("111111111111111111111");
		// 加入一个属性，用来在模板中读取
		/* map.addAttribute("host", "http://blog.didispace.com"); */
		// return模板文件的名称，对应src/main/resources/templates/index.html
		return "1";
	}
}
