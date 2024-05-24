package Lab_02;

import libs.Turtle;

class Step05QuizPractice {

    public static void polyperi(Turtle t, int n, double p) {
        for (int i = 0; i < n; i++) {
            t.forward(p / n);
            t.left(360 / n);
        }
    }

    public static void rect(Turtle t, double p, double r) {
        for (int i = 0; i < 2; i++) {
            t.forward((p / 2) / (r + 1));
            t.left(90);
            t.forward(r * (p / 2) / (r + 1));
            t.left(90);
        }

    }

    public static void main(String[] args) {
        Turtle t = new Turtle();
        // t.delay(1000);
        polyperi(t, 10, 600);
        t.penup();
        t.forward(200);
        t.pendown();
        rect(t, 400, 1);

    }

}