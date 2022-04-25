package com.springcore.springcoreproject;

public class Students {
	
	private int StudentId;
	private String StudentName;
	private String StudentAddress;
	
	public int getStudentId() {
		return StudentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentId(int studentId) {
		System.out.println("Seeting Student Id ");
		this.StudentId = studentId;
	}
	public void setStudentName(String studentName) {
		System.out.println("Seeting Student Name ");
		this.StudentName = studentName;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Seeting Student Address ");
		this.StudentAddress = studentAddress;
	}
	
	public Students(int studentId, String studentName, String studentAddress) {
		super();
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.StudentAddress = studentAddress;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Students [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress="
				+ StudentAddress + "]";
	} 
	

}
