package Lab_02;

import libs.*;

public class Step08ShapePractice {

    public static void shape(Turtle t, double xCenter, double yCenter, double size, double space, int xDir, int yDir,
            int rotate) {

        size = Math.round(size / space) * space;
        // space = Math.round(space / space) * space;
        xCenter = Math.round(xCenter / space) * space;
        yCenter = Math.round(yCenter / space) * space;

        double xStartPoint = xCenter;
        double yStartPoint = yCenter - yDir * size;
        double xEndPoint = yCenter + xDir * size;
        double yEndPoint = yCenter;
        double xIncrement = xDir * space;
        double yIncrement = yDir * space;

        for (double x = xStartPoint, y = yStartPoint; x != xEndPoint
                && y != yEndPoint; x += xIncrement, y += yIncrement) {
            t.drawLineFromTo(x, yCenter, xCenter, y);
        }

    }

    public static void main(String[] args) {
        Turtle t = new Turtle(new TurtleWorld(2000, 2000));
        double xCenter = 501;
        double yCenter = 501;
        double size = 501;
        double space = 10;
        int rotate = 0;

        shape(t, xCenter, yCenter, size, space, 1, 1, rotate);
        // shape(t, xCenter, yCenter, size, space, 1, -1, rotate);
        // shape(t, xCenter, yCenter, size, space, -1, 1, rotate);
        // shape(t, xCenter, yCenter, size, space, -1, -1, rotate);

    }

}
