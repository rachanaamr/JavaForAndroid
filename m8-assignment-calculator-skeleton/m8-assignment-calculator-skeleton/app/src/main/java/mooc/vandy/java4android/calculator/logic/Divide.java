package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    int quotient;
    int remainder;
    String resultString;

    public void divide(int arg1, int arg2) {

        //exception when 0 id set for arg2
        try {

            quotient = arg1/arg2;
            remainder = arg1 % arg2;

            resultString = String.valueOf(quotient) + " R: " + remainder;


        } catch (ArithmeticException e) {

            resultString = "Divide by zero error.";
        }
    }

    public String toString() {
        return resultString;
    }

}
