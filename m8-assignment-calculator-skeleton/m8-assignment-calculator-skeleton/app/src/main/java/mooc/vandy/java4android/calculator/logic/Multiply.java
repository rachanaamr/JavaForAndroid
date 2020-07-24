package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    int multiplyResult;

    public void multiply(int arg1, int arg2) {
        multiplyResult = arg1 * arg2;
    }

    public String toString() {
        return String.valueOf(multiplyResult);
    }
}
