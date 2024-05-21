package libs;

import java.awt.Color;
import java.util.Objects;

public class TurtleLine {

    int x1; // x coordinate of the first point
    int y1; // y coordinate of the first point
    int x2; // x coordinate of the second point
    int y2; // y coordinate of the second point
    int red; // red color component
    int green; // green color component
    int blue; // blue color component

    public TurtleLine(int x1, int y1, int x2, int y2, Color color) {
        // Sort the coordinates
        if (x1 < x2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else if (x1 > x2) {
            this.x1 = x2;
            this.y1 = y2;
            this.x2 = x1;
            this.y2 = y1;
        } else if (y1 <= y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            this.x1 = x2;
            this.y1 = y2;
            this.x2 = x1;
            this.y2 = y1;
        }

        // Extract the RGB color components
        red = color.getRed();
        green = color.getGreen();
        blue = color.getBlue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2, red, green, blue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof TurtleLine)) {
            return false;
        }
        TurtleLine other = (TurtleLine) obj;
        return x1 == other.x1 && y1 == other.y1 && x2 == other.x2 && y2 == other.y2
                && red == other.red && green == other.green && blue == other.blue;
    }

    @Override
    public String toString() {
        return x1 + " " + y1 + " " + x2 + " " + y2 + " " + red + " " + green + " " + blue;
    }

}