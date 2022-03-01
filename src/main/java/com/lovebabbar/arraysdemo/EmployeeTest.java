package com.lovebabbar.arraysdemo;



class Empolyee
{
	
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	
	
	public void EmployeeValues(int id,String n,int s)
	{
		System.out.println("three parameter called");
		this.employeeId=id;
		this.employeeName=n;
		this.employeeSalary=s;
	}
	
	public void EmployeeValues(int id,String n)
	{
		System.out.println("this two parameter called");
		this.employeeId=id;
		this.employeeName=n;
	}


	@Override
	public String toString() {
		return "Empolyee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	
	
}




public class EmployeeTest {
	public static void main(String[] args) {
		Empolyee e = new Empolyee();
		Empolyee e2 = new Empolyee();
		e.EmployeeValues(123, "vaibhavi", 2500);
		System.out.println(e); 
		System.out.println("============================");
		e2.EmployeeValues(55, "abhi");
		System.out.println(e2);
	}
}
