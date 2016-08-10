package com.exampl.myproject.bean;

public class ErrorInfo<T>
{

	public static final Integer OK = 0;

	public static final Integer ERROR = 100;

	private Integer code;

	private String message;

	private String url;

	private T data;

	/**  
	 * 获取code  
	 * @return code code  
	 */
	public Integer getCode()
	{
		return code;
	}

	/**  
	 * 设置code  
	 * @param code code  
	 */
	public void setCode(Integer code)
	{
		this.code = code;
	}

	/**  
	 * 获取message  
	 * @return message message  
	 */
	public String getMessage()
	{
		return message;
	}

	/**  
	 * 设置message  
	 * @param message message  
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/**  
	 * 获取url  
	 * @return url url  
	 */
	public String getUrl()
	{
		return url;
	}

	/**  
	 * 设置url  
	 * @param url url  
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}

	/**  
	 * 获取data  
	 * @return data data  
	 */
	public T getData()
	{
		return data;
	}

	/**  
	 * 设置data  
	 * @param data data  
	 */
	public void setData(T data)
	{
		this.data = data;
	}

	/**  
	 * 获取oK  
	 * @return oK oK  
	 */
	public static Integer getOk()
	{
		return OK;
	}

	/**  
	 * 获取eRROR  
	 * @return eRROR eRROR  
	 */
	public static Integer getError()
	{
		return ERROR;
	}

}