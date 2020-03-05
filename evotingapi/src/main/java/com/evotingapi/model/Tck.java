package com.evotingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tck")
public class Tck {
	public Tck() {
		// TODO Auto-generated constructor stub
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "tck")
	private String tck;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTck() {
		return tck;
	}

	public void setTck(String tck) {
		this.tck = tck;
	}

	public Tck(long id, String tck) {
		super();
		this.id = id;
		this.tck = tck;
	}

}
