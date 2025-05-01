import java.util.Arrays;
import java.util.Scanner;
public class DirectSorting {
    public static void main(String []args){
        try(Scanner input=new Scanner(System.in)){
            System.out.print("Enter the number of terms:");
            int n=input.nextInt();
            System.out.print("Enter elements:");
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
        // main implementation of direct sorting
            Arrays.sort(a);
            for (int i=0; i<=0;i++) {
                System.out.println("The second largest element after "+a[n-1]+" is "+a[n-2]+", and the second smallest element after "+a[0]+" is "+a[1]);
            }
        }
    }
}
