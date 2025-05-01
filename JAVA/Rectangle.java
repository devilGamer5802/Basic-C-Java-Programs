import java.util.*;
class Rectangle
{
   double length;
   double width;
   double area;
   String color;

   public void set_length(double length)
    {
        this.length = length;
    }
   public void set_width(double width)
    {
        this.width = width;
    }
   public void set_color(String color)
    {
       this.color = color;
    }
   public String get_color()
    {
        return (this.color);
    } 
   public double find_area()
    {
       return (length * width);
    }
}

 class RectangleTest
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Details of 1st Rectangle : \n");
        System.out.println("Enter the length of 1st Rectangle : ");
        double l1 = in.nextDouble();
        System.out.println("Enter the width of 1st Rectangle : ");
        double w1 = in.nextDouble();
        in.nextLine();
        System.out.println("Enter the color of 1st Rectangle : ");
        String color1 = in.nextLine();
       
        System.out.println("\nEnter the Details of 2nd Rectangle : \n");
        System.out.println("Enter the length of 2nd Rectangle : ");
        double l2 = in.nextDouble();
        System.out.println("Enter the width of 2nd Rectangle : ");
        double w2 = in.nextDouble();
        in.nextLine();
        System.out.println("Enter the color of 2nd Rectangle : ");
        String color2 = in.nextLine();
   
        //creating two objects of class Rectangle
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle();
        //initialising R1
        R1.set_length(l1);
        R1.set_width(w1);
        R1.set_color(color1);
        //initialising R2
        R2.set_length(l2);
        R2.set_width(w2);
        R1.set_color(color2);
        //displaying area of the two rectangles
        System.out.println("\nArea of the Rectangle R1 = " + R1.find_area());
        System.out.println("\nArea of the Rectangle R2 = " + R2.find_area());
        
        boolean flag = color1.equalsIgnoreCase(color2);
       
        //checking for matching rectangles
        if(R1.find_area() == R2.find_area() && flag == true)
        System.out.println("\nMatching Rectangles.");
        else
        System.out.println("\nNon-Matching Rectangles.");
        in.close();
    }
}

