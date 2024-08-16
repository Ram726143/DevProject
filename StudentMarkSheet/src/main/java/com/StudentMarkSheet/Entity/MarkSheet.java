package com.StudentMarkSheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="mark_sheet")
@Entity
public class MarkSheet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int rollNumber;
	private int sem1Theory;
	private int sem1practicals;
	private int sem2Theory;
	private int sem2Practicals;
	private int sem1Total;
	private int sem2Total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getSem1Theory() {
		return sem1Theory;
	}
	public void setSem1Theory(int sem1Theory) {
		this.sem1Theory = sem1Theory;
	}
	public int getSem1practicals() {
		return sem1practicals;
	}
	public void setSem1practicals(int sem1practicals) {
		this.sem1practicals = sem1practicals;
	}
	public int getSem2Theory() {
		return sem2Theory;
	}
	public void setSem2Theory(int sem2Theory) {
		this.sem2Theory = sem2Theory;
	}
	public int getSem2Practicals() {
		return sem2Practicals;
	}
	public void setSem2Practicals(int sem2Practicals) {
		this.sem2Practicals = sem2Practicals;
	}
	public int getSem1Total() {
		return sem1Total;
	}
	public void setSem1Total(int sem1Total) {
		this.sem1Total = sem1Total;
	}
	public int getSem2Total() {
		return sem2Total;
	}
	public void setSem2Total(int sem2Total) {
		this.sem2Total = sem2Total;
	}
	
	

}
