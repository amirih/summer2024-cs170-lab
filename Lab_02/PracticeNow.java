package Lab_02;

import libs.*;

public class PracticeNow {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(1);
    // Call every method you need here
    circle(t, 50, 50);
  }

  public static void head(Turtle t) { // code for head and positioning of the head

  }

  public static void legs(Turtle t) { // code for one leg and positioning the legs, repeated 4 times

  }

  public static void tail(Turtle t) { // code for the tail and the positioning of the tail

  }

  public static void body(Turtle t) { // code of the body

  }

  public static void fillcolor(Turtle t, int numSides) { // used for body

  }

  public static void circle(Turtle t, double length, int numSides) { // used for body
    for (int k = 0; k < numSides; k++) {
      t.forward(length);
      t.left(360.0 / numSides);
    }
    fillcolor(t, 90);
  }
}
