abstract class Shape {
    public abstract void draw();

    
    public abstract String toString();
}

class Square extends Shape {
    private double sideLength;

    public Square() {
        this.sideLength = 0;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    
    public void draw() {
        System.out.println("Drawing a square with side length: " + sideLength);
    }

    
    public String toString() {
        return "Square with side length: " + sideLength;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }

    
    public String toString() {
        return "Rectangle with length: " + length + " and width: " + width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    public void draw() {
        System.out.println("Drawing a triangle with base: " + base + " and height: " + height);
    }

    
    public String toString() {
        return "Triangle with base: " + base + " and height: " + height;
    }
}

class Node {
    Shape data;
    Node next;

    public Node(Shape data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(Shape shape) {
        Node newNode = new Node(shape);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList shapeList = new LinkedList();

        for (int i = 0; i < 100; i++) {
            // Generate random shapes (Square, Rectangle, Triangle)
            int randomShape = (int) (Math.random() * 3);
            Shape shape;

            switch (randomShape) {
                case 0:
                    shape = new Square(Math.random() * 10);
                    break;
                case 1:
                    shape = new Rectangle(Math.random() * 10, Math.random() * 10);
                    break;
                case 2:
                    shape = new Triangle(Math.random() * 10, Math.random() * 10);
                    break;
                default:
                    shape = new Square(); // Default to Square if something goes wrong
                    break;
            }

            shapeList.insert(shape);
        }

        System.out.println("Shapes in the linked list:");
        shapeList.displayList();
        System.out.println("Total number of shapes: " + shapeList.getSize());
    }
}
