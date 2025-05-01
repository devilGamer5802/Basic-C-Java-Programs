import java.util.Scanner;
public class ProgramToPrintFirst10Numbers {
    public static void main(String []args){
        int f, f1=-1,f2=1;
        try(Scanner input=new Scanner(System.in)){
            System.out.print("Enter the n th number:");
            int n=input.nextInt();
            System.out.println("The series as follows:");
        // basic concept of fibonnaci series 
            do{
                f=f1+f2;
                f1=f2;
                f2=f;
                System.out.print(" "+f+" ");
                n--;
            }while(n>0);
        }
    }
}

        


