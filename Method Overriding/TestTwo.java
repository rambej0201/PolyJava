class peddha {
	int anke(){
		System.out.println("anke from peddha class");
		return 5;
	}	
}

class chinna extends peddha{
	int anke(){
		System.out.println("anke from chinna class");
		return 10;
	}
	
	public static void main(String [] argv){
		//new peddha().anke();
		new chinna().anke();
	}

}
