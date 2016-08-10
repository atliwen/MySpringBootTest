package com.springboot.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exampl.myproject.Application;
import com.exampl.myproject.mongodb.User;
import com.exampl.myproject.mongodb.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTestsmongodb
{

	@Autowired
	private UserRepository userRepository;

	@Before
	public void setUp()
	{
		// userRepository.deleteAll();
	}

	@Test
	public void test() throws Exception
	{

		// 创建三个User，并验证User总数
		userRepository.save(new User(1L, "didi", 30));
		userRepository.save(new User(2L, "mama", 40));
		userRepository.save(new User(3L, "kaka", 50));

		User user = userRepository.findOne(1L);

		Assert.assertEquals(3, userRepository.findAll().size());

		// 删除一个User，再验证User总数
		User u = userRepository.findOne(1L);
		userRepository.delete(u);
		Assert.assertEquals(2, userRepository.findAll().size());

		// 删除一个User，再验证User总数
		u = userRepository.findByUsername("mama");
		userRepository.delete(u);
		Assert.assertEquals(1, userRepository.findAll().size());

	}

}