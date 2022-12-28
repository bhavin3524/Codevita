package com.peerbits.customannotation;

public class CustomAnnoMain {
	
	public static void main(String[] args) {
		DemoAnnotation demoAnnotation = new DemoAnnotation();
		
		Class<? extends DemoAnnotation> demoAnnotationClassObject = demoAnnotation.getClass();
		
		System.out.println(demoAnnotationClassObject.getName());
		
		
		CustomAnnotation annotation = demoAnnotationClassObject.getAnnotation(CustomAnnotation.class);
		
		System.out.println(annotation.city());
		System.out.println(annotation.name());
		System.out.println(annotation.myValue());
	}

}
