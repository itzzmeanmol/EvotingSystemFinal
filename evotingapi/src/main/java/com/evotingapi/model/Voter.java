package com.evotingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voters")
public class Voter {
	public Voter() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	@Column(name="vin")
	private int vin;
	@Column(name="city")
	private String city;
	@Column(name="castvote")
	private int castvote;
	public int getCastvote() {
		return castvote;
	}

	public void setCastvote(int castvote) {
		this.castvote = castvote;
	}

	@Column(name="password")
	private String password;
	@Column(name="flag")
	private String flag;
	public Voter(Long id, String name, int vin, String city, String password, String flag, int castvote) {
		super();
		this.id = id;
		this.name = name;
		this.vin = vin;
		this.city = city;
		this.password = password;
		this.flag = flag;
		this.castvote = castvote;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}
