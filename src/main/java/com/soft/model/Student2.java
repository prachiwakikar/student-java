package com.soft.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student2")
public class Student2 {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sRollno;
	@Override
	public String toString() {
		return "Student2 [sRollno=" + sRollno + ", sName=" + sName + ", sFees=" + sFees + "]";
	}
	private String sName;
	private float sFees;
	
	
	
	public int getsRollno() {
		return sRollno;
	}
	public void setsRollno(int sRollno) {
		this.sRollno = sRollno;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public float getsFees() {
		return sFees;
	}
	public void setsFees(float sFees) {
		this.sFees = sFees;
	}
	
	

}
