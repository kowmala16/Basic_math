package com.employee;

public class Employee {
	int Emp_id;
	String Emp_name;
	String Designation;
	double salary;
	int performance_rating;
	
	public Employee(int Emp_id,String Emp_name,String Designation,double salary,int performance_rating) {
		this.Emp_id=Emp_id;
		this.Emp_name=Emp_name;
		this.Designation=Designation;
		this.salary=salary;
		this.performance_rating=performance_rating;
	}
	
	public int getEmp_id1() {
		return Emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public String getDesignation() {
		return Designation;
	}
	public double getsalary() {
		
		return salary;
	}
	public int getperformance_rating() {
		
		return performance_rating;
	}
	
	
	public void setDesignation(String senior) {
		this.Designation=Designation;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public void promoteEmployee(String senior) {
		if(performance_rating>=4) {
			salary=salary*1.20;
		this.Designation=senior;
		
	System.out.println("After Promotion:");
	System.out.println("New Designation:"+ senior);
	System.out.println("Updated Salary:"+"$"+salary);
		}
		else {
			System.out.println("no promotion");
		}
		
	}
	
}
