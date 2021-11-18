package unit7;

public class SpaceShip extends SpaceShipControls {
	
	private String name;
	
	public SpaceShip(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.forward(100);
	}

}
