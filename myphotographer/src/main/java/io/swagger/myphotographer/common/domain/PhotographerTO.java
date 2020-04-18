package io.swagger.myphotographer.common.domain;

import io.swagger.myphotographer.common.abstr.AbstractTO;
import io.swagger.myphotographer.common.enums.Area;


public class PhotographerTO extends AbstractTO{

	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phone;
	private String description;
	private Area area;
	
	public PhotographerTO() {
		
	}

	public PhotographerTO(String username, String firstName, String lastName, String email, String password,
			String phone, String description, Area area) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.description = description;
		this.area = area;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
}

