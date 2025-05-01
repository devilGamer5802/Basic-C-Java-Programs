import java.util.Scanner;
public class CheckWhetherSumOfNumbersIsPrime{  
    public static void main(String args[]){ 
        // code for sum of digits 
        int number, digit, sum = 0;  
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Enter the number: ");  
          number = input.nextInt();
        }  
        while(number > 0){
            digit = number % 10;  
            sum = sum + digit;  
            number = number / 10;
        }
        System.out.println("Sum of Digits: "+sum);
        // my code for checking whether sum of digit is prime number or not
        if (sum <= 1) {
            System.out.println("The sum of digit is not prime");
            return;
          }
          int count = 0;
          int i = 1;
          while (i <= sum / 2) {
            if (sum % i == 0) {
              count++;
            }
            i++;
          }
      
          if (count > 1) {
            System.out.println("The sum of digit is not prime");
          } else {
            System.out.println("The sum of digit is prime");
          }
    }  
}  