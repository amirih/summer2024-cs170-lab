package Lab_02;

import libs.Turtle;

class Step02QuizPractice {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(1000);
        for (int k = 1; k < 4; k++) {
            t.forward(60);
            t.left(120);
        }
        t.penup();
        t.forward(120);
        t.pendown();
        for (int i = 0; i < 8; i++) {
            t.forward(60);
            t.left(45);
        }

    }

}