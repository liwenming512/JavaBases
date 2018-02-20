package unit7;

class Game{
	Game(int i){
		System.out.println("Game Constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame Constructor");
	}
}

public class Chess extends BoardGame {

	Chess() {
		super(11);
		System.out.println("Chess Constructor");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess x = new Chess();
	}

}
