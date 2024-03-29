package unit5;

class Book {
	boolean checkedOut = false;
	Book(boolean checkOut){
		this.checkedOut = checkOut;
	}
	void checkIn(){
		this.checkedOut = false;
	}
	@Override
	protected void finalize(){
		if(checkedOut){
			System.out.println("Error: checked out");
//			super.finalize();
		}
	}
}

public class TerminationContition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}

}
