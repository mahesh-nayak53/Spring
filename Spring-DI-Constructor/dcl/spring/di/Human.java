package org.dcl.spring.di;

public class Human {
	Brain brain;

	Human(Brain brain){
	this.brain = brain;
	}

	public Brain getBrain(){
	return brain;
	}
}
