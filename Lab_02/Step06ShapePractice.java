
package Lab_02;

import libs.*;

class Step06ShapePractice {

    public static void shape(Turtle t, int x, int y, int r, int start, int end, int dir) {
        t.setDirection(dir);
        t.gotoXY(x, y);
        for (int i = start; i < end; i++) {
            t.forward(2 * Math.PI * r / 360);
            t.right(1);
        }
    }

    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(0);

        for (int dir = 0; dir < 44; dir++) {
            shape(t, 500, 500, 100, 0, 360, dir);
        }

        for (int x = 200; x < 600; x += 200) {
            for (int y = 200; y < 600; y += 200) {
                for (int r = 50; r < 150; r += 50) {
                    for (int dir = 0; dir < 44; dir++) {
                        shape(t, x, y, r, 0, 360, dir);
                    }
                }
            }
        }

        for (int y = 200; y < 600; y += 200) {
            for (int x = 200; x < 600; x += 200) {
                for (int r = 50; r < 150; r += 50) {
                    for (int start = 0; start < 360; start += 45) {
                        for (int end = start + 45; end < 360; end += 45) {
                            for (int dir = 0; dir < 44; dir++) {
                                shape(t, x, y, r, start, end, dir);
                            }
                        }
                    }
                }
            }
        }

    }

}