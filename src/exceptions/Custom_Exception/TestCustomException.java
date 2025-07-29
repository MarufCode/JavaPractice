package src.exceptions.Custom_Exception;

public class TestCustomException {

        public static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("age must be 18 or above to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
