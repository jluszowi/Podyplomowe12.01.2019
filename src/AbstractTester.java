public class AbstractTester {
    public static void main(String[] args) {

        Shape s = new Rectangle();

        s.getArea();

    }
}

abstract class Shape {
    private String color;
    abstract double getArea();
}


class Rectangle extends Shape {
    private int lenght;
    private int width;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return lenght * width;
    }
}