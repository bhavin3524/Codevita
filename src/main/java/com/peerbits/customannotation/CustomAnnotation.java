package com.peerbits.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Bhavin
 * 
 * You can not use throws keyword
 * 
 * method should be return value
 *
 *  --basically @Target annotation is 
 *  used for 
 *  
 *  which place you want to use
 *  such as on class,method,constructor,field
 *  
 *  this annotation is used on class,interface as well as Enumeration
 */

// ElementType.METHOD if you want to use this annotation 
//	then set @Target(ElementType.METHOD) on top of the 

/**
 * 
 * @author Bhavin
 *
 *	@Retention annotation is used
 *
 *this custom annotation is avail on which level
 *such as on source,class or runtime
 */


@Target({ElementType.TYPE}) //this annotation is used on class,interface as well as Enumeration
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
	
	int myValue() default 0;

	String name() default "peerbits";

	String city() default "Ahmedabad";
	

}
