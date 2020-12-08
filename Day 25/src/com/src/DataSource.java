package com.src;

public class DataSource {

	private String driverclass;
	private String url;
	private String password;
	private String username;
	
	public DataSource()
	{
		
	}
	
	public DataSource(String driverclass, String url, String password, String username) {
	
		this.driverclass = driverclass;
		this.url = url;
		this.password = password;
		this.username = username;
	}
	public String getDriverclass() {
		return driverclass;
	}
	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
