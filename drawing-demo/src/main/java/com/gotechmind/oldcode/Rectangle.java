package com.gotechmind.oldcode;

public class Rectangle implements IObject{

	private int edges;
	
	public Rectangle(int edges) {
		this.edges = edges;
	}
	
	@Override
	public void display() {
		System.out.println("I am a Rectangle number of edges=" + edges);
	}

}