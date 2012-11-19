package com.itcuties.java.reflection.constructors.data;

public class ClassWithSeveralVariousAccessConstructors {
	private ClassWithSeveralVariousAccessConstructors() {
		System.out.println(ClassWithSeveralVariousAccessConstructors.class.getName() + ".ClassWithSeveralConstructors()");
	}
	
	@SuppressWarnings("all")
	public ClassWithSeveralVariousAccessConstructors(int param1) throws Exception {
		System.out.println(ClassWithSeveralVariousAccessConstructors.class.getName() + ".ClassWithSeveralConstructors(int)");
	}
	
	/*package*/ ClassWithSeveralVariousAccessConstructors(Object param1) {
		System.out.println(ClassWithSeveralVariousAccessConstructors.class.getName() + ".ClassWithSeveralConstructors(Object)");
	}
	
	protected ClassWithSeveralVariousAccessConstructors(boolean booleanParam, byte byteParam, short shortParam, int intParam, long longParam) {
		System.out.println(ClassWithSeveralVariousAccessConstructors.class.getName() + ".ClassWithSeveralConstructors([with primitves])");
	}
	
	@Override
	public String toString() {
		return "*" + this.getClass().getName() + "*";
	}
}
