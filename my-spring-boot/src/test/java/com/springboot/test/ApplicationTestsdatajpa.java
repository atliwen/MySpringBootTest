package com.springboot.test;

//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Application.class)
//public class ApplicationTestsdatajpa
//{
//	// Jpa 是 spring data 默认支持事物
//	// 即所有的查询均声明为只读事务，对于持久化，更新与删除对象声明为有事务
//	@Autowired
//	private UserRepository userRepository;
//
//	@Test
//	public void test() throws Exception
//	{
//
//		// 创建10条记录
//		userRepository.save(new Usertest("AAA", 10));
//		userRepository.save(new Usertest("BBB", 20));
//		userRepository.save(new Usertest("CCC", 30));
//		userRepository.save(new Usertest("DDD", 40));
//		userRepository.save(new Usertest("EEE", 50));
//		userRepository.save(new Usertest("FFF", 60));
//		userRepository.save(new Usertest("GGGGGGGGG", 70));
//		userRepository.save(new Usertest("HHH", 80));
//		userRepository.save(new Usertest("III", 90));
//		userRepository.save(new Usertest("JJJ", 100));
//
//		System.out.println(111);
//		int size = userRepository.findAll().size();
//
//		// 测试findAll, 查询所有记录
//		Assert.assertEquals(10, userRepository.findAll().size());
//
//		// 测试findByName, 查询姓名为FFF的User
//		Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());
//
//		// 测试findUser, 查询姓名为FFF的User
//		Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());
//
//		// 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
//		Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());
//
//		// 测试删除姓名为AAA的User
//		userRepository.delete(userRepository.findByName("AAA"));
//
//		// 测试findAll, 查询所有记录, 验证上面的删除是否成功
//		Assert.assertEquals(9, userRepository.findAll().size());
//
//	}
//}

