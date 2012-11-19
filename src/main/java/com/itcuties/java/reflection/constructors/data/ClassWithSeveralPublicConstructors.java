package com.itcuties.java.reflection.constructors.data;

public class ClassWithSeveralPublicConstructors {
	public ClassWithSeveralPublicConstructors() {
		System.out.println(ClassWithSeveralPublicConstructors.class.getName() + ".ClassWithSeveralConstructors()");
	}
	
	public ClassWithSeveralPublicConstructors(int param1) {
		System.out.println(ClassWithSeveralPublicConstructors.class.getName() + ".ClassWithSeveralConstructors(int)");
	}
	
	public ClassWithSeveralPublicConstructors(Object param1) {
		System.out.println(ClassWithSeveralPublicConstructors.class.getName() + ".ClassWithSeveralConstructors(Object)");
	}
	
	public ClassWithSeveralPublicConstructors(boolean booleanParam, byte byteParam, short shortParam, int intParam, long longParam) {
		System.out.println(ClassWithSeveralPublicConstructors.class.getName() + ".ClassWithSeveralConstructors([with primitves])");
	}
	
	public ClassWithSeveralPublicConstructors(Boolean booleanParam, Byte byteParam, Short shortParam, Integer intParam, Long longParam) {
		System.out.println(ClassWithSeveralPublicConstructors.class.getName() + ".ClassWithSeveralConstructors([with objects])");
	}
	
	@Override
	public String toString() {
		return "*" + this.getClass().getName() + "*";
	}
}
