package Lab_01;

import libs.*;

/*

discussion notes/ group contributions go here

*/

public class Step09TurtleUseCase {
	public static void letterA(Turtle t, int size) {
		System.err.println("letterA");
		t.left(70);
		t.forward(size);
		t.left(180 - 70 * 2);
		t.backward(size / 2);
		t.left(70);
		t.forward(size / 2 - 10);
		t.backward(size / 2 - 10);
		t.right(70);
		t.backward(size / 2);
	}

	public static void letterM(Turtle t, int size) {
		System.err.println("letterM");
		t.left(90);
		t.forward(size);
		t.left(30);
		t.backward(size);
		t.right(60);
		t.forward(size);
		t.left(30);
		t.backward(size);
	}

	public static void letterI(Turtle t, int size) {
		System.err.println("letterI");
		t.left(90);
		t.forward(size);
		t.backward(size);

	}

	public static void letterR(Turtle t, int size) {
		System.err.println("letterR");
		t.left(90);
		t.forward(size);
		t.right(90);
		t.forward(size / 2);
		t.right(90);
		t.forward(size / 2);
		t.right(90);
		t.forward(size / 2);
		t.left(135);
		t.forward(size / 2 * Math.sqrt(2));
	}

	public static void addSpace(Turtle t, double space) {
		double y = t.getY();
		double x = t.getX() + space;
		t.gotoXY(x, y);
		t.setDirection(0);
	}

	public static void main(String[] args) throws InterruptedException {
		double x = 100, y = 200;
		double space = 20;
		int size = 100;

		Turtle t = new Turtle(new TurtleWorld(2000, 1000));
		t.delay(100);
		t.gotoXY(x, y);

		letterA(t, size);
		addSpace(t, space);

		letterM(t, size);
		addSpace(t, space);

		letterI(t, size);
		addSpace(t, space);
		letterR(t, size);
		addSpace(t, space);

		letterI(t, size);
		addSpace(t, space);

		t.hideturtle();

	}
}
