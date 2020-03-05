package com.evotingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidates")
public class Candidate {

	public Candidate() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="vin")
	private int vin;
	@Column(name="city")
	private String city;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="partyname")
	private String partyname;
	@Column(name="password")
	private String password;
	@Column(name="votecount")
	private int votecount;
	@Column(name="flag")
	private int flag;
	public int getVotecount() {
		return votecount;
	}
	public void setVotecount(int votecount) {
		this.votecount = votecount;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Candidate(Long id, String name, int vin, String city, int age, String gender, String partyname,
			String password, int votecount, int flag) {
		super();
		this.id = id;
		this.name = name;
		this.vin = vin;
		this.city = city;
		this.age = age;
		this.gender = gender;
		this.partyname = partyname;
		this.password = password;
		this.votecount = votecount;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", vin=" + vin + ", city=" + city + ", age=" + age
				+ ", gender=" + gender + ", partyname=" + partyname + ", password=" + password + ", votecount="
				+ votecount + ", flag=" + flag + "]";
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
}
