public class 2nd_problem {
    public static void main(String[] args) {

    }
}

class Shape {
    private String color = "red";
    private boolean filled = true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape[ color = " + color + ", filled = " + filled + "]";
    }
}

class Circle extends Shape {
    private double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 3.14 * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle[ Shape[ color = " + this.getColor() + ", filled = " + this.isFilled() + "], radius = " + radius + "]";
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width * lenght;
    }

    public double getPerimeter() {
        return (width + lenght) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[ Shape[ color=" + this.getColor() + ", filled = " + this.isFilled() + "], width = " + width + ", lenght = " + 
        lenght + "]";
    }
}

class Square extends Rectangle {
    Square() {
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        this.setWidth(side);
        this.setLenght(side);
    }

    public void setLenght(double side) {
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[ Rectangle[ Shape[ color = " + this.getColor() + ", filled = " + this.isFilled() + "], width = " + this.getWidth() 
        + ", lenght = " + this.getLenght() + "]]";
    }
}