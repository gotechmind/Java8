package com.gotechmind.oldcode;

public class ParalelloGram  implements IObject{

	private int edges;
	
	public ParalelloGram (int edges) {
		this.edges = edges;
	}
	
	@Override
	public void display() {
		System.out.println("I am a ParalelloGram number of edges=" + edges);
	}

}