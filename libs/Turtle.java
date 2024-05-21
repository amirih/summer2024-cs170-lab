package libs;

/**
 * Simple Turtle library
 * 
 * @author Davide Fossati <davide@fossati.us>
 * @version 1.07 - 2019.09.18
 */

import java.awt.*;

public class Turtle {

	static final int DEFAULT_DELAY = 100; // default delay of a turtle

	static final Color DEFAULT_COLOR = Color.BLACK; // default color of a turtle

	static final int[][] DEFAULT_SHAPE = { { 10, -10, -10 }, { 0, -7, 7 } }; // default shape of a turtle; format: {{x1,
																				// ... , xn}, {y1, ..., yn}}

	/**
	 * Default constructor. Creates a turtle in the default world.
	 */
	public Turtle() {
		this(TurtleWorld.getDefaultWorld());
	}

	/**
	 * Constructor. Creates a turtle in a specified world.
	 * 
	 * @param world World in which the turtle will be created.
	 *              If null, the turtle is created in the default world.
	 */
	public Turtle(TurtleWorld world) {
		if (world == null) {
			world = TurtleWorld.getDefaultWorld();
		}
		this.world = world;
		world.addTurtle(this);
		x = world.getWidth() / 2;
		y = world.getHeight() / 2;
		dir = 0;
		color = DEFAULT_COLOR;
		if (world.isVisible()) {
			delay = DEFAULT_DELAY;
		} else {
			delay = 0;
		}
		visible = true;
		penDown = true;
		shape = DEFAULT_SHAPE;
	}

	/**
	 * Moves the turtle forward.
	 * 
	 * @param steps the distance traveled by the turtle (1 step = 1 pixel)
	 */
	public void forward(double steps) {
		double x0 = x;
		double y0 = y;
		x += steps * Math.cos(dir);
		y -= steps * Math.sin(dir);
		if (penDown) {
			world.drawLine((int) Math.round(x0), (int) Math.round(y0),
					(int) Math.round(x), (int) Math.round(y), color);
		}
		world.repaint();
		if (delay > 0) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Moves the turtle backward.
	 * 
	 * @param steps the distance traveled by the turtle (1 step = 1 pixel)
	 */
	public void backward(double steps) {
		forward(-steps);
	}

	/**
	 * Rotates the turtle counter-clockwise.
	 * 
	 * @param degrees the rotation angle (in degrees)
	 */
	public void left(double degrees) {
		dir += degrees * Math.PI / 180;
		double pi2 = 2 * Math.PI;
		while (dir >= pi2) {
			dir -= pi2;
		}
		while (dir < 0) {
			dir += pi2;
		}
		world.repaint();
		if (delay > 0) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Rotates the turtle clockwise.
	 * 
	 * @param degrees the rotation angle (in degrees)
	 */
	public void right(double degrees) {
		left(-degrees);
	}

	/**
	 * Raises the turtle's pen. When the pen is up, the turtle does not draw lines
	 * on the screen.
	 */
	public void penup() {
		penDown = false;
	}

	/**
	 * Lowers the turtle's pen. When the pen is down, the turtle draws lines on the
	 * screen.
	 */
	public void pendown() {
		penDown = true;
	}

	/**
	 * Sets the turtle's delay between moves. The lower the delay, the faster the
	 * turtle. Default: 100 ms
	 * 
	 * @param delay the amount of delay (in milliseconds)
	 */
	public void delay(int delay) {
		this.delay = delay;
	}

	/**
	 * Hides the turtle so it is not visible on the screen.
	 */
	public void hideturtle() {
		visible = false;
		world.repaint();
	}

	/**
	 * Shows the turtle so it is visible on the screen.
	 */
	public void showturtle() {
		visible = true;
		world.repaint();
	}

	/**
	 * Sets the color of the turtle.
	 * 
	 * @param color a string representation of the color. Examples: "red", "green",
	 *              "blue", "yellow", etc.
	 */
	public void color(String color) {
		try {
			this.color = (Color) Class.forName("java.awt.Color").getField(color).get(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		world.repaint();
	}

	/**
	 * Sets the color of the turtle.
	 * 
	 * @param red   the red component of the color (0 <= red <= 255)
	 * @param green the blue component of the color (0 <= green <= 255)
	 * @param blue  the blue component of the color (0 <= blue <= 255)
	 */
	public void color(int red, int green, int blue) {
		color = new Color(red, green, blue);
		world.repaint();
	}

	/**
	 * Flood-fills the area under the turtle with the turtle's current color.
	 */
	public void fill() {
		world.fill(x, y, color);
		world.repaint();
	}

	/**
	 * Sets the shape of the turtle as a polygon with given vertices.
	 * The array of coordinates has the following format:
	 * {{x1, x2, ... , xn}, {y1, y2, ..., yn}}
	 * The center of the shape is (0, 0).
	 * If the given array does not have at least 3 pairs of coordinates,
	 * then the shape of the turtle is not changed.
	 * 
	 * @param coordinates a 2D array in the format {{x1, x2, ... , xn}, {y1, y2,
	 *                    ..., yn}}
	 */
	public void setShape(int[][] coordinates) {
		// The input array must must contain at least 3 vertices
		if (coordinates.length == 2 && coordinates[0].length >= 3) {
			shape = coordinates;
			world.repaint();
		}
	}

	/**
	 * Returns true if the turtle is visible, false otherwise.
	 * 
	 * @return true if the turtle is visible, false otherwise.
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * Returns the world of this turtle.
	 * 
	 * @return the world of this turtle.
	 */
	public TurtleWorld getWorld() {
		return world;
	}

	/**
	 * Returns the current color of the turtle, in Java AWT format.
	 * 
	 * @return the current color of the turtle.
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Calculates an array containing the coordinates of the vertices
	 * of the shape of the turtle, rotated in the current direction.
	 * The result array has the following format:
	 * {{x1, x2, ..., xn}, {y1, y2, ..., yn}}
	 * 
	 * @return a 2D array of integers representing the coordinates of the vertices
	 *         of the turtle
	 */
	public int[][] turtleCoordinates() {
		int[] xValues = new int[shape[0].length];
		int[] yValues = new int[shape[0].length];
		double sind = Math.sin(dir);
		double cosd = Math.cos(dir);

		for (int i = 0; i < shape[0].length; i++) {
			xValues[i] = (int) Math.round(x + shape[0][i] * cosd - shape[1][i] * sind);
			yValues[i] = (int) Math.round(y - shape[0][i] * sind - shape[1][i] * cosd);
		}

		return new int[][] { xValues, yValues };
	}

	/**
	 * Returns a String with a representation of position and direction of the
	 * turtle.
	 * Format: (x y dir)
	 * 
	 * @return a String with a representation of position and direction
	 *         of all the turtles in the current world.
	 */
	public String turtlePosition() {
		return String.format("(%.1f %.1f %.5f)", x, y, dir);
	}

	private TurtleWorld world; // world of the turtle

	private double x; // x position of the turtle

	private double y; // y position of the turtle

	private double dir; // direction of the turtle in radians

	private Color color; // color of the turtle

	private long delay; // delay of the turtle

	private boolean visible; // true if the turtle is visible

	private boolean penDown; // true if the pen is down

	private int[][] shape; // shape of the turtle at 0 degrees; format: {{x1, ... , xn}, {y1, ..., yn}}

	// The rest is dded by Hossein Amiri for summer 2024
	public void gotoXY(double x, double y) {
		this.x = x;
		this.y = y;
		world.repaint();
	}

	public void drawLineTo(double x0, double y0) {

		if (penDown) {
			world.drawLine((int) Math.round(this.x), (int) Math.round(this.y), (int) Math.round(x0),
					(int) Math.round(y0),
					color);
		}
		this.x = x0;
		this.y = y0;
		world.repaint();
	}

	public void drawLineFromTo(double x0, double y0, double x1, double y1) {
		penDown = true;
		world.drawLine((int) Math.round(x0), (int) Math.round(y0), (int) Math.round(x1),
				(int) Math.round(y1),
				color);
		this.x = x1;
		this.y = y1;
		world.repaint();
	}

	public void setDirection(double dir) {
		this.dir = dir;
		world.repaint();
	}

	public double getDirection() {
		return this.dir;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setX(double x) {
		this.x = x;
		world.repaint();
	}

	public void setY(double y) {
		this.y = y;
		world.repaint();
	}
}
