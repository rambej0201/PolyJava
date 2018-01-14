class parent{
	void laggam(){
		System.out.println("jaldhi laggam");
	}
}
class child extends parent{
	void laggam(){
		System.out.println("late laggam");
	}
	public static void main(String[] argv){
		new child().laggam();
	}
}