import java.util.Date;

public class Shape {
    private static int autoID = 1;

    private int shapeID;
    private Date createdTimestamp;

    public Shape() {
        shapeID = autoID++;
        createdTimestamp = new Date();
    }

    public int getShapeID() {
        return shapeID;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    @Override
    public String toString() {
        return "Shape ID: " + shapeID + ", Created at: " + createdTimestamp;
    }
}
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle [ID: " + getShapeID() + ", Width: " + width + ", Height: " + height + "]";
    }
}
public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        super();
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public String toString() {
        return "Square [ID: " + getShapeID() + ", Side Length: " + sideLength + "]";
    }
}
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle [ID: " + getShapeID() + ", Base: " + base + ", Height: " + height + "]";
    }
}
public class LinkedList {
    private Node head;

    public void add(Shape shape) {
        Node newNode = new Node(shape);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.shape);
            current = current.next;
        }
    }

    private class Node {
        Shape shape;
        Node next;

        Node(Shape shape) {
            this.shape = shape;
            this.next = null;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList shapeList = new LinkedList();

        Rectangle rectangle = new Rectangle(5.0, 8.0);
        Square square = new Square(6.0);
        Triangle triangle = new Triangle(3.0, 4.0);

        shapeList.add(rectangle);
        shapeList.add(square);
        shapeList.add(triangle);

        shapeList.displayList();
    }
}
