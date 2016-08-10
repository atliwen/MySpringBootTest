package com.exampl.myproject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usertest
{

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false, length = 6)
	private String name;

	@Column(nullable = false)
	private Integer age;

	/**  
	 * 获取id  
	 * @return id id  
	 */
	public Long getId()
	{
		return id;
	}

	/**  
	 * 设置id  
	 * @param id id  
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**  
	 * 获取name  
	 * @return name name  
	 */
	public String getName()
	{
		return name;
	}

	/**  
	 * 设置name  
	 * @param name name  
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**  
	 * 获取age  
	 * @return age age  
	 */
	public Integer getAge()
	{
		return age;
	}

	/**  
	 * 设置age  
	 * @param age age  
	 */
	public void setAge(Integer age)
	{
		this.age = age;
	}

	public Usertest(String name, Integer age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public Usertest(Long id, String name, Integer age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Usertest()
	{
	}

}
