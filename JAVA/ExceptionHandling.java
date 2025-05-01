public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 4; // Try changing this to test different exceptions
            
            int result = numbers[index]; // This line may throw an exception
            
            System.out.println("Result: " + result); // This line won't be executed if an exception occurs
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute, with or without an exception.");
        }
        
        System.out.println("Program continues after exception handling.");
    }
}
