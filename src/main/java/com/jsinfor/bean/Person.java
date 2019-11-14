package com.jsinfor.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Person 实体bean 
 * 映射表 t_person  
 * @author ZhuangWJ 
 *
 */
public class Person implements Serializable{
    private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private Integer age;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

    
    
   
    
}