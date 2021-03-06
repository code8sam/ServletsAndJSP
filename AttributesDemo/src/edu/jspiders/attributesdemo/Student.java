package edu.jspiders.attributesdemo;


public class Student
{
	private int id;
	private String firstName;
	private String lastName;
	private double marks;
	private String email;
	private String password;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String firstName, String lastName, double marks, String email, String password)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
}

