package com.itcuties.java.reflection.constructors;

import java.lang.reflect.Constructor;

import com.itcuties.java.reflection.constructors.data.ClassWithDefaultConstructor;
import com.itcuties.java.reflection.constructors.data.ClassWithSeveralPrivateConstructors;
import com.itcuties.java.reflection.constructors.data.ClassWithSeveralPublicConstructors;
import com.itcuties.java.reflection.constructors.data.ClassWithSeveralVariousAccessConstructors;

/**
 * This class is made to present how to use constrcutors with reflection mechanism.
 * The subjects are as follow:
 * <li> enlisting available constructors
 * <li> invoking public constructors
 * <li> invoking private constructors
 * <li> presenting situations where calling a constructor will always fail
 * 
 * @author itcuties
 */
public class ConstructorsMain {
	public static void main(String[] args) {
		ConstructorsMain.presentConstructorsEnlisting();
		
	}
	
	/**
	 * This method presents how to serialize and deserialize a simple object.
	 * Take notice that the method getConstructors() returns only public constructors while
	 * getDeclaredConstructors() returns all constructors declared in the class.
	 */
	private static void presentConstructorsEnlisting() {
		System.out.println("Enlisting public constructors of the class.");
		for(Constructor<?> constructor : ClassWithSeveralPublicConstructors.class.getConstructors()) {
			System.out.println("\t\t" + constructor);
		}
		
		System.out.println("Enlisting all constructors of the class.");
		for(Constructor<?> constructor : ClassWithSeveralPrivateConstructors.class.getDeclaredConstructors()) {
			System.out.println("\t\t" + constructor);
		}
		
		System.out.println("Enlisting visible constructors of the class.");
		for(Constructor<?> constructor : ClassWithSeveralVariousAccessConstructors.class.getConstructors()) {
			System.out.println("\t\t" + constructor);
		}
		
		System.out.println("Enlisting all constructors of the class.");
		for(Constructor<?> constructor : ClassWithSeveralVariousAccessConstructors.class.getDeclaredConstructors()) {
			System.out.println("\t\t" + constructor);
		}
		
		System.out.println("Enlisting all constructors of the class with no constructor explicitly declarated.");
		for(Constructor<?> constructor : ClassWithDefaultConstructor.class.getDeclaredConstructors()) {
			System.out.println("\t\t" + constructor);
		}
	}
	
}
