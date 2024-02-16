package _05_class._02_access_modifier;

public class Rectangle {

    private int width;
    private int height;

    private static int callingCount = 0;
    public Rectangle(int width) {
        this.width = width;
        callingCount++;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getCallingCount() {
        return callingCount;
    }
}
