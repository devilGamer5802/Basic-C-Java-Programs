import java.util.*;
public class ReverseNumber{
    public static void main(String []args){
        int num,rem,rev;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to reverse:");
            num=input.nextInt();
        }
        for(rev=0; num!=0; num=num/10){
            rem=num%10;
            rev=(rev*10) + rem;
        }
        System.out.println("The reverse of the number is "+rev);
    }
}
