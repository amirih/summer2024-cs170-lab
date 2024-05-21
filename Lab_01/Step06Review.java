
package Lab_01;

class Step06Review {
    public static void stars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void spaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void dots(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(".");
        }
    }

    public static void newLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            spaces(size - i);
            stars(i * 2 - 1);
            newLine(1);
        }
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            stars(size);
            newLine(1);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            stars(width);
            newLine(1);
        }
    }

    public static void printCircle(int radius) {
        for (int i = 0; i < radius * 2; i++) {
            for (int j = 0; j < radius * 2; j++) {
                if (Math.pow(i - radius, 2) + Math.pow(j - radius, 2) < Math.pow(radius, 2)) {
                    stars(1);
                } else {
                    spaces(1);
                }
            }
            newLine(1);
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
        printSquare(5);
        printRectangle(5, 3);
        printCircle(5);

    }

}