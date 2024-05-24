package Lab_02;

import libs.Turtle;

class Step03QuizPractice {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(1000);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    t.forward(50);
                    t.left(90);
                }
                t.forward(20);
            }
        }
        t.backward(200);

    }

}