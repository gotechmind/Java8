package com.gotechmind.oldcode;

public class DrawingDemo {
	public static void main(String args[]) {
		IObject[] objects = new IObject[] {	new Circle(0),
				new ParalelloGram(4),
				new Rectangle(4)
		};

		for(IObject object : objects) {
			object.display();
		}

	}
}