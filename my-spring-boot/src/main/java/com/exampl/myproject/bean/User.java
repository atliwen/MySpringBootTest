package com.exampl.myproject.bean;

import java.io.Serializable;

/**
* <p>Title: User </p>
* <p>@Description:   </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年7月28日 下午2:06:05 
*/
public class User implements Serializable
{
	private Long id;

	private String name;

	private String age;

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
	public String getAge()
	{
		return age;
	}

	/**  
	 * 设置age  
	 * @param age age  
	 */
	public void setAge(String age)
	{
		this.age = age;
	}

	public User(String name, String age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public User()
	{
	}

}
