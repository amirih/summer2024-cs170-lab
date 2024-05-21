package Lab_01;

import libs.*;

/*

discussion notes/ group contributions go here

*/

public class Step08TurtleUseCase {
	public static void drawStar(Turtle t, int steps) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			t.forward(steps);
			t.right(144); // 180 - 36 = 144
		}
	}

	public static void reset(Turtle t, int steps) {
		t.penup();
		t.forward(steps + 100);
		t.pendown();
	}

	public static void main(String[] args) throws InterruptedException {
		Turtle t = new Turtle(new TurtleWorld(2000, 1000));
		// t.delay(2000);
		for (int steps = 50; steps <= 100; steps += 10) {
			drawStar(t, steps);
			reset(t, steps);
		}
	}
}
