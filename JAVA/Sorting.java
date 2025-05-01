import java.util.Scanner;
public class Sorting {
    public static void main(String[]args){
        int n,i,j,temp=0;
        try(Scanner input=new Scanner(System.in)){
        System.out.print("Enter number of element in an array: ");
        n=input.nextInt();
        System.out.println("Enter Elements: ");
        int []arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array is ");
            for(i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
            