package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here
    int sum;

    public void add (int arg1, int arg2) {
        sum = arg1 + arg2;
    }

    public String toString() {
        return String.valueOf(sum);
    }
}
