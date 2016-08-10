package com.exampl.myproject.mongodb;

import javax.persistence.Id;

public class User
{

	@Id
	private Long id;

	private String username;

	private Integer age;

	public User(Long id, String username, Integer age)
	{
		this.id = id;
		this.username = username;
		this.age = age;
	}

	// 省略getter和setter

}