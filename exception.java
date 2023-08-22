class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void myfunc(int x) throws MySpecialNumberException {
        if (x == 10) {
            throw new MySpecialNumberException("Input is 10. This is a special number.");
        } else if (x == 20) {
            throw new MySpecialNumberException("Input is 20. This is also a special number.");
        } else if (x == 30) {
            throw new MySpecialNumberException("Input is 30. This is another special number.");
        }
        
        // If x is not 10, 20, or 30, the function proceeds normally.
        System.out.println("x is: " + x);
    }

    public static void main(String[] args) {
        int input = 20; // Change this input to test different cases
        
        try {
            myfunc(input);
        } catch (MySpecialNumberException e) {
            System.err.println("Caught MySpecialNumberException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
