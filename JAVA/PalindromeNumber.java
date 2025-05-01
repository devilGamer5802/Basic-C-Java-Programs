import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String []args){
        int num,rev,rem;
        try(Scanner input=new Scanner(System.in)){
            System.out.print("Enter the number to be checked:");
            num=input.nextInt();
        }
        int temp=num;
        for(rev=0; num!=0; num=num/10){
            rem=num%10;
            rev=(rev*10) + rem;
        }

        if(temp==rev){
            System.out.println("The given number is palindrome.");
        }
        else{
            System.out.println("The given number is not palindrome.");
        }
    }
}

