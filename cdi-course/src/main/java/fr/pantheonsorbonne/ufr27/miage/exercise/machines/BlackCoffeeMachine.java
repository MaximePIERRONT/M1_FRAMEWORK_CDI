package fr.pantheonsorbonne.ufr27.miage.exercise.machines;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;


public class BlackCoffeeMachine implements CoffeeMachine {
	@Override
	public BlackCoffee getCoffee() {
		return new BlackCoffee();
	}
}