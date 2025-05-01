class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling2{
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new CustomException("You are not allowed to enter. Age below 18 is not permitted.");
            }
            System.out.println("You are allowed to enter.");
        } catch (CustomException e) {
            System.err.println("Custom Exception: " + e.getMessage());
        }
    }
}
