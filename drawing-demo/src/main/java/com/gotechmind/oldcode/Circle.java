package com.gotechmind.oldcode;

public class Circle implements IObject{

	private int edges;
	
	public Circle(int edges) {
		this.edges = edges;
	}
	
	@Override
	public void display() {
		System.out.println("I am a Circle number of edges=" + edges);
	}

}