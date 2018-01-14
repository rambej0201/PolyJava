class TestOne{

	//method overloading
	void m1(int a){
	System.out.println("int m1 method");
	}
	
	void m1(int x, int y){
	System.out.println("int m1, int m1 method");
	}
	
	void m1(char s){
	System.out.println("char m1 method");
	}
	
	public static void main(String[] argv){
		TestOne t1 = new TestOne();
		t1.m1(5);
		t1.m1(5,10);
		t1.m1('r');
	}
	
}