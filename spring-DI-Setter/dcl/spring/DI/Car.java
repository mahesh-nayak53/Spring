package org.dcl.spring.DI;

public class Car {
	Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}
}
