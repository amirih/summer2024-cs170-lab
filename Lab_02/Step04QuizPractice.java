package Lab_02;

import libs.Turtle;

class Step04QuizPractice {

    public static void steps(Turtle t) {
        for (int i = 0; i < 5; i++) {
            t.forward(20);
            t.left(90);
            t.forward(20);
            t.right(90);
        }
    }

    public static void main(String[] args) {
        Turtle t = new Turtle();
        // t.delay(1000);
        for (int i = 0; i < 3; i++) {
            steps(t);
            // t.penup();
            // t.right(90);
            // t.pendown();
        }
        // t.hideturtle();

    }

}