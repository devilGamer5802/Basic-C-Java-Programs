class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    double height;

    Box(double length, double width, double height) {
        super(length, width); // Call the constructor of the parent class
        this.height = height;
    }

    double calculateVolume() {
        return length * width * height;
    }
}

public class Simple {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Box box = new Box(4, 3, 2);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.println("Box Area: " + box.calculateArea());
        System.out.println("Box Volume: " + box.calculateVolume());
    }
}
