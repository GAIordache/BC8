package mc;

public class Main {
	private static int staticIntField;
	private static void m1() {
		
	}
	
	int instanceIntField;
	
	// private ???
	public static class InnerStatic {
		void m() {
			staticIntField = 1;
			m1();
		}
	}
	

	public static void main(String[] args) {
		InnerStatic is = new InnerStatic();
	}

}

class A {
	static {
		//Main.m1();
	}
}

class B {
	
}

class C {
	
}
