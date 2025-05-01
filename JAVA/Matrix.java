import java.util.Scanner;

public class Matrix{
	public static void main(String[] args){
        int sum=0; // initialize sum=0
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = input.nextInt();
		int[][] arr= new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
                System.out.println("Elements of the array are: "); 
				arr[i][j]= input.nextInt();
			}
		}
        System.out.println();
        // for displaying matrix.
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j]+ " ");
			}

			System.out.println();
		}
        // for computing sum of diagonal of matrix.
        if(rows==columns){
            for (int i = 0; i < rows; i++) {
                sum+=arr[i][i];
		    }
            System.out.println("Sum of diagonal of Matrix :"+sum);
		    input.close();
	    }
        else{
            System.out.println("The given m X n matrix is not diagonal matrix");
        }
    }
}

