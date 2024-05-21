package Lab_01;

import libs.*;

public class Step07HelloTurtle {

  public static void main(String[] args) throws InterruptedException {
    Turtle example = new Turtle(); // create a new turtle named example
    example.delay(1000); // set the delay in milliseconds between turtle actions
    example.forward(200); // move the example forward
    example.left(90); // rotate the example to the left (counter-clockwise)
    example.forward(200); // move the example forward
    example.left(135); // rotate the example to the left (counter-clockwise)
    example.forward(200); // move the example forward
    example.backward(50); // move the example backward 50 steps
    example.right(45); // rotate the example clockwise 45 degrees
    example.penup(); // example does not draw anymore
    example.forward(100);
    example.hideturtle();
    example.pendown(); // example draws again
    example.forward(50);
    example.color("red"); // turns the turtle red
    example.forward(100);

  }

}
