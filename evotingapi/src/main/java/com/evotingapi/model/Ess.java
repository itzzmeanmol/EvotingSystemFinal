package com.evotingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="essflag")
public class Ess {
	public Ess() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="ess")
	int ess;

	public int getEss() {
		return ess;
	}

	public void setEss(int ess) {
		this.ess = ess;
	}

	public Ess( int id,int ess) {
		super();
		this.id = id;
		this.ess = ess;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
