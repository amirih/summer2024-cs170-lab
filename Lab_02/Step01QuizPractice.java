package Lab_02;

import libs.Turtle;

class Step01QuizPractice {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(1000);
        for (int k = 1; k < 3; k++) {
            for (int i = 0; i < 8; i++) {
                t.forward(60);
                t.left(45);
            }
            t.forward(60);
            t.left(180);
        }
    }

}