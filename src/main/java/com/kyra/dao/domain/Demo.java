package com.kyra.dao.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Demo {
	
	private int id;
	private String username;
	private String password;
	private Byte isdeleted;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createtime;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updatetime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Byte getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Byte isdeleted) {
		this.isdeleted = isdeleted;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
