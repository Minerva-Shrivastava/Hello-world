package javaDemo;

public class Startup {

	public static void main(String[] args) {
		
		Engine marutiEngine = new Engine();
		Vehicle myCar = new Vehicle(marutiEngine);
		Driver ramesh = new Driver();
		ramesh.drive(myCar);
		
	}
}
