import java.util.Scanner;
public class CheckDataType {
    public static void main(String []args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the variable:");
            char variable=input.next().charAt(0);
            if((variable>='a'&& variable<='z')||(variable>='A' && variable<='Z')){
                System.out.println("The variable is an Alphabet.");
            }
            else if(variable>=48 && variable<=57){
                System.out.println("The variable is a digit.");
            }
            else
                System.out.println("The variable is a special character.");
        }

    }
}
