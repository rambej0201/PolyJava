class TestTwo{
	
	TestTwo(int a){
		System.out.println("int 1-arg constructor");
	}
	TestTwo(int x, int y){
		System.out.println("int 2-arg construcotr");
	}
	TestTwo(char b){
		System.out.println("char 1-arg construcotr");
	}
	
	public static void main(String[] argv){
		new TestTwo(5);
		new TestTwo(4,8);
		new TestTwo('d');
	}
	
}