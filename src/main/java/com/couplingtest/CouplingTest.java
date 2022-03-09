package com.couplingtest;



class Subject
{
	Topic t=new Topic();
	public void startReading()
	{
//		t.understand();
		t.gotIt();
	}
}

class Topic
{
	public void gotIt()
	{
		System.out.println("Tight coupling concept.....");
	}
}

public class CouplingTest {
	public static void main(String[] args) {
		Subject s = new Subject();
		s.startReading();
	}
}
