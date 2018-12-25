package com.gotechmind.java8;

import java.util.function.Consumer;

public enum ObjectEnum {
	
	RECTANGLE(4,ObjectEnum::displayRectangle),
	PARALELLOGRAM(4,ObjectEnum::displayParalellogram),
	CIRCLE(0,ObjectEnum::displayCircle);

	public static void displayRectangle(Integer edges) {
		System.out.println("I am a Rectangle number of edges=" + edges);
	}
	
	public static void displayParalellogram(Integer edges) {
		System.out.println("I am a Paralellogram number of edges=" + edges);
	}
	
	public static void displayCircle(Integer edges) {
		System.out.println("I am a Circle number of edges=" + edges);
	}
	
	private Integer edges;
	private Consumer<Integer> displayFunction;
	
	private ObjectEnum(Integer edges, Consumer<Integer> displayFunction) {
		this.setEdges(edges);
		this.setDisplayFunction(displayFunction);
	}

	public Consumer<Integer> getDisplayFunction() {
		return displayFunction;
	}

	public void setDisplayFunction(Consumer<Integer> displayFunction) {
		this.displayFunction = displayFunction;
	}

	public Integer getEdges() {
		return edges;
	}

	public void setEdges(Integer edges) {
		this.edges = edges;
	}
	
}
