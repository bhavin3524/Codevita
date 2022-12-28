package com.java8.gennieswami;


@FunctionalInterface
interface Inter
{
	public abstract int sum(int a,int b);
	
}
interface Test
{
	public abstract int sum2(int a,int b,int c);
}
interface Intera
{
	public abstract void m1();
}
class B
{
	public void show()
	{
		int x=1000;
		Intera intera=()->{
			System.out.println(x);
			
		};
		intera.m1();
	}
}

public class Test6 {
	public static void main(String[] args) {
		Inter i = (a, b) -> {
			return a + b;
		};

		System.out.println(i.sum(5, 8));
		
//		B b = new B();
//		b.show();
	}
	
//	There are certain protocol we need to followed by lambda expression
	
//	Protocols:
//	---------
	
	/**
	 * 1.If an interface extend Functional interface and child interface doesn't contain any abstract method 
	 * then child interface is also functional interface
	 * 
	 * 
	 * 2.In child interface we can define same method(No CE:)
	 * 
	 * 3.In the child interface we can't define any new abstract if
	 * we want to make it FI[Functional interface]
	 * 
	 */
	
//	Examples ------->
	
	/**
	 * 1.inside lambda expressions we can't declare instance variables
	 * 
	 * 2.whatever the variables declare inside lambda expressions are simply act as local variable 
	 * 
	 * 3.The local variable referenced from lambda expressions are implicitly final and hence we 
	 * can't perform reassignment for those local variable.
	 */
}
