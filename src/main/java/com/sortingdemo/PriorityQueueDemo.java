package com.sortingdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;


class Student implements Comparable<Student>
{
	
	private int studentId;
	private int studentMarks;
	private String studentName;
	
	

	public Student(int studentId, int studentMarks, String studentName) {
		super();
		this.studentId = studentId;
		this.studentMarks = studentMarks;
		this.studentName = studentName;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public int getStudentMarks() {
		return studentMarks;
	}



	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentMarks=" + studentMarks + ", studentName=" + studentName
				+ "]";
	}



	@Override
	public int compareTo(Student s) {
		return this.studentName.compareTo(s.getStudentName());
	}
	
}

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		
		pq.add(new Student(12,32, "Abhishek"));
		pq.add(new Student(14,45, "Bob"));
		pq.add(new Student(23,35, "Aryan"));
		pq.add(new Student(32,67, "Peter"));
		pq.add(new Student(43,65, "John"));
		
		Iterator<Student> itr = pq.iterator();
		
		HashMap<Integer, Boolean> hMap=new HashMap<Integer, Boolean>();
		
		
		while(itr.hasNext()) {
			System.out.println(pq.poll().toString());
		}
		

	}
}
