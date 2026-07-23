package com.employee;


public class EmployeeProcessor {
	
	
	public static void main (String[] args) {
		Employee e=new Employee(10,"bob","Developer",50000,5);
		System.out.println("Before Promotion");
		System.out.println("Employee Id:"+ e.getEmp_id1());
		System.out.println("Employee name:"+ e.getEmp_name());
		System.out.println("Designation:"+e.getDesignation());
		System.out.println("Salary:"+"$"+ e.getsalary());
		System.out.println("Performance:"+ e.getperformance_rating());
		e.promoteEmployee("Senior Developer");
	}

}
