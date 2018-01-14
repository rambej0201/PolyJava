class pelli {
	final void laggam(){
		System.out.println("Enduku laggam");
	}
}
	//this is an example of final method can not be overriden 
class marriage extends pelli{
	void laggam(){
		System.out.println("Marriage enduku");
	}
	public static void main(String [] argv){
		new marriage().laggam();
		new pelli().laggam();
	}
}