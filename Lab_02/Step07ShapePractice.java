package Lab_02;

import libs.*;

public class Step07ShapePractice {

    public static void shape(Turtle t, double xCenter, double yCenter, double size, double space) {
        for (double x = (size + xCenter), y = yCenter; x >= xCenter && y <= (size + yCenter); x -= space, y += space) {
            t.drawLineFromTo(x, yCenter, xCenter, y);
        }
    }

    public static void main(String[] args) {
        Turtle t = new Turtle(new TurtleWorld(2000, 2000));
        double xCenter = 1000;
        double yCenter = 1000;
        double size = 500;
        double space = 20;

        shape(t, xCenter, yCenter, size, space);
    }

}
