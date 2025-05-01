import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String []args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number to be checked:");
            int num=input.nextInt();

            int c=0, sqr=num*num;
            int temp=num;

            while(temp>0){
                c++;
                temp=temp/10;
            }

            int lastSquareDigits=(int)(sqr%(Math.pow(10,c)));

            if(num==lastSquareDigits)
            System.out.println("Automorphic Number");
            else
            System.out.println("Not an Automorphic Number");
        }

    }
}
