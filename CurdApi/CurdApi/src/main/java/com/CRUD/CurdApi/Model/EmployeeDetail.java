package com.CRUD.CurdApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetail {
	@Id
	private String id;
	private String name;
	public EmployeeDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetail(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeDetail [id=" + id + ", name=" + name + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
