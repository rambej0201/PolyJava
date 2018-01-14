class Animal{}

class Kukka extends Animal{}

class Pelli {
	Animal laggam(){
			System.out.println("jaldhi laggam");
			return new Animal();
	}
}

		//this method overriding is called co-variant return type method overriding
		//parent class return type is parent and child class return type is child
		//co-variant method got introduced in java 1.5 version

class Malla extends Pelli{
	Kukka laggam(){
		System.out.println("late laggam");
		return new Kukka();
	}
	public static void main(String [] argv){
		new Malla().laggam();
		new Pelli().laggam();
	}
}