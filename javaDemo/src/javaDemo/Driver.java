package javaDemo;

public class Driver {

	public void drive(Vehicle vehicle) { // Dependency Association
		vehicle.operateEngine();
		vehicle.accelerte();
	}
	
}
