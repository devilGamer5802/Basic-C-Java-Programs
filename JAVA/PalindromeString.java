import java.util.Scanner;
public class PalindromeString {
    public static void main(String []args){
        String str,rev="";
        try(Scanner input=new Scanner(System.in)){
            System.out.print("Enter the String to be checked:");
            str=input.nextLine();
        }
        int temp=str.length();
        for(int i=(temp-1);i>=0; --i){
            rev=rev+str.charAt(i);
        }

        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("The given string is palindrome.");
        }
        else{
            System.out.println("The given string is not palindrome.");
        }
    }
}

