import java.util.Scanner;

public class GeometryAreaCalculator {
    public static void main(String []args){
        try (Scanner input = new Scanner(System.in)) {
            int choice;
            double area;
            {
                System.out.println("Geometry Area Calculator");
                System.out.println("1. Area of a rectangle:\n2. Area of a triangle:\n3. Area of a circle:\n4. Quit");
                System.out.print("Enter your choice:");
                choice=input.nextInt();

            switch(choice){

                case 1:
                System.out.print("Enter the length:");
                double length=input.nextDouble();
                System.out.print("Enter the width:");
                double width=input.nextDouble();
                area=length*width;
                System.out.println("Area of Rectangle is " +area);
                break;

                case 2:
                System.out.print("Enter the height:");
                double height=input.nextDouble();
                System.out.print("Enter the base:");
                double base=input.nextDouble();
                area=0.5*height*base;
                System.out.println("Area of Triangle is " +area);
                break;

                case 3:
                System.out.print("Enter the radius:");
                double radius=input.nextDouble();
                area=3.142*radius*radius;
                System.out.println("Area of Circle is " +area);
                break;

                case 4:
                System.out.println("Thanks");
                break;

                default:
                System.out.println("Entered choice is invalid");
                break;
            }
            }
        }
    }
    
}
