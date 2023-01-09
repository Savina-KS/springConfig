package com.example.labour.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="labor")
public class Labourer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String name;
	@Size(min = 12, message = "Aadhar should be of length 12")
	private String aadhar;
	@NotNull
	private String skill;
	@NotNull
	private String location;
	@Size(min = 10, message = "Phone number should be of length 10")
	private String fonNumber;
	@NotNull
	private int experience;

	
	public Labourer() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFonNumber() {
		return fonNumber;
	}

	public void setFonNumber(String fonNumber) {
		this.fonNumber = fonNumber;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Labourer(int id, String name, String aadhar, String skill, String location, String fonNumber,
			int experience) {
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
		this.skill = skill;
		this.location = location;
		this.fonNumber = fonNumber;
		this.experience = experience;
	}

}