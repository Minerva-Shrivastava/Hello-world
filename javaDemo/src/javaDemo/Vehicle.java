package javaDemo;

public class Vehicle {

	private Engine engine; //Composition Association
	
	public Vehicle(Engine engine) {
		this.engine = engine;
	}
	
	public void operateEngine() {
		engine.StartEngine();
	}
	
	public void StopEngine() {
		System.out.println("Engine Stoping ...");
	}
	
	public void accelerte() {
		System.out.println("Car accelerating...");
	}
}
