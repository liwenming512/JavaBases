package unit5;

public class Flower {
	
	int petalCount = 0;
	String s = "inital value";
	Flower(int petals){
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
	}
	Flower(String ss){
		System.out.println("Constructor w/ String arg only,  s = " + ss);
		s = ss;
	}
	Flower(String s, int petals){
		this(petals);
//		this(s);
		this.s = s;
		System.out.println("String & int args");
	}
	Flower(){
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}
	void printPetalCount(){
		System.out.println("petalCount = " + petalCount + ", s = " + s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f = new Flower();
		f.printPetalCount();
	}

}
