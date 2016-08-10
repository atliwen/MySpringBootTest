package com.exampl.myproject.jdbctemplate;

//
//@Service
//public class UserServiceImpl implements UserService
//{
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Override
//	public void create(String name, Integer age)
//	{
//		jdbcTemplate.update("insert into USERS(NAME, AGE) values(?, ?)", name, age);
//	}
//
//	@Override
//	public void deleteByName(String name)
//	{
//		jdbcTemplate.update("delete from USERS where NAME = ?", name);
//	}
//
//	@Override
//	public Integer getAllUsers()
//	{
//		return jdbcTemplate.queryForObject("select count(1) from USERS", Integer.class);
//	}
//
//	@Override
//	public void deleteAllUsers()
//	{
//		jdbcTemplate.update("delete from USERS");
//	}
// }
