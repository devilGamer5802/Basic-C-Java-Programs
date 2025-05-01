import java.util.Scanner;

public class multidimensionalArray2{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = input.nextInt();

		System.out.print("Enter number of columns: ");
		int columns = input.nextInt();

		int[][] arr= new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
                System.out.print("Elements "+i+""+j+" of the array are: "); 
				arr[i][j]= input.nextInt();
			}
		}
        System.out.println();
        // displaying 2D array using enhanced for loop.
		for (int i[]:arr) {
			for (int j:i ) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		input.close();
	}
}