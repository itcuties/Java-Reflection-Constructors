package com.itcuties.java.reflection.constructors.data;

public class ClassWithSeveralPrivateConstructors {
	private ClassWithSeveralPrivateConstructors() {
		System.out.println(ClassWithSeveralPrivateConstructors.class.getName() + ".ClassWithSeveralConstructors()");
	}
	
	private ClassWithSeveralPrivateConstructors(int param1) {
		System.out.println(ClassWithSeveralPrivateConstructors.class.getName() + ".ClassWithSeveralConstructors(int)");
	}
	
	private ClassWithSeveralPrivateConstructors(Object param1) {
		System.out.println(ClassWithSeveralPrivateConstructors.class.getName() + ".ClassWithSeveralConstructors(Object)");
	}
	
	private ClassWithSeveralPrivateConstructors(boolean booleanParam, byte byteParam, short shortParam, int intParam, long longParam) {
		System.out.println(ClassWithSeveralPrivateConstructors.class.getName() + ".ClassWithSeveralConstructors([with primitves])");
	}
	
	private ClassWithSeveralPrivateConstructors(Boolean booleanParam, Byte byteParam, Short shortParam, Integer intParam, Long longParam) {
		System.out.println(ClassWithSeveralPrivateConstructors.class.getName() + ".ClassWithSeveralConstructors([with objects])");
	}
	
	@Override
	public String toString() {
		return "*" + this.getClass().getName() + "*";
	}
}
