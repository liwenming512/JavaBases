package unit7;

class Engine{
	public void start(){};
	public void rev(){};
	public void stop(){};
}

class Wheel{
	public void inflate(int psi){};
}

class Window{
	public void rollup(){};
	public void rolldown(){};
}

class Door{
	public Window window = new Window();
	public void open(){};
	public void close(){};
}

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheels = new Wheel[4];
	public Door 
		left = new Door(),
		right = new Door();
	public Car(){
		for(int i = 0; i < wheels.length; i++){
			wheels[i] = new Wheel();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.left.window.rollup();
		car.wheels[0].inflate(72);
	}

}
