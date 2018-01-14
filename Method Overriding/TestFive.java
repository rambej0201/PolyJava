class parent {
	void m1(){
		System.out.println("parent m1 method");
	}
}

class child extends parent{
	void m1(){
		System.out.println("child m1 method");
	}
	void m2(){
		System.out.println("child m2 method");
	}
	
	public static void main(String[] argv) {
		parent p1 = new child();
		p1.m1(); // compile:parent, runtime: child
		/*p1.m2(); // compile:parent, compile error to over come this issue
		we should use typecasting */
		child c = (child)p1;
		c.m2();
		
	}
}