package com.exampl.myproject.configuration;

import java.net.InetAddress;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "connection", locations = "classpath:test.yml")
public class ConnectionSettings
{
	private String username;

	private InetAddress remoteAddress;

	@PostConstruct
	public void showName()
	{
		System.out.println(11111);
		System.out.println(getUsername());
		System.out.println(getRemoteAddress());
		System.out.println(11111);
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public InetAddress getRemoteAddress()
	{
		return remoteAddress;
	}

	public void setRemoteAddress(InetAddress remoteAddress)
	{
		this.remoteAddress = remoteAddress;
	}

}
