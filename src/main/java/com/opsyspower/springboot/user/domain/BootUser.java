package com.opsyspower.springboot.user.domain;

import java.io.Serializable;

//@Entity
//@Table(name = "springboot_user")
public class BootUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BootUser() {

	}

	public BootUser(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	private String name;

	private int age;

	private String id;

	//@Column(name = "name_")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@Column(name = "age_")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//@Id
	//@GeneratedValue(generator = "system-uuid")
	//@GenericGenerator(name = "system-uuid", strategy = "uuid")
	//@Column(name = "id_")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
