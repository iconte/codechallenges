package br.com.icc.challenges.patterns.singleton;

public class SingletonSimple {
	
	private static final SingletonSimple instance = new SingletonSimple();
	
	
	//construtor privado
	private SingletonSimple() {
	}
	
	public static SingletonSimple getInstance() {
		return instance;
	}
	
}
	

