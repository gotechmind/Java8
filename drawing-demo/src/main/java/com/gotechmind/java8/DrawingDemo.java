package com.gotechmind.java8;

public class DrawingDemo {
	public static void main(String args[]) {
		ObjectEnum[] objects = new ObjectEnum[] { ObjectEnum.CIRCLE
				, ObjectEnum.PARALELLOGRAM
				, ObjectEnum.RECTANGLE };

		for(ObjectEnum objectEnum : objects) {
			objectEnum.getDisplayFunction().accept(objectEnum.getEdges());
		}

	}
}