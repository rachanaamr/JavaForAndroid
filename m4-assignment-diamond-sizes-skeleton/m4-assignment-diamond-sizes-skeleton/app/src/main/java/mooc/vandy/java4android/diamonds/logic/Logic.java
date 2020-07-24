package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public int dash_count=2;
    public int line_number=1;
    public void print_pattern(int i,int size ,int u_or_d) {

        for (int j = size - i; j > 0; j--) {
            mOut.print(" ");
        }
        if (size == 1) {
            mOut.print("<>");
            return;
        }
        if (i == 1 && u_or_d == 1) {
            mOut.print("/\\");
            for (int j = size - i; j > 0; j--) {
                mOut.print(" ");
            }
            return;
        } else if (i == 1 && u_or_d == 0) {
            mOut.print("\\/");
            for (int j = size - i; j > 0; j--) {
                mOut.print(" ");
            }
            return;
        } else if (i == size) {
            mOut.print("<");
            for (int j = 1; j <= dash_count; j++) {
                if (line_number == 1)
                    mOut.print("-");
                else
                    mOut.print("=");
            }
            mOut.print(">");
            if (line_number == 1)
                line_number = 0;
            else
                line_number = 1;
        } else {
            if (u_or_d == 1)
                mOut.print("/");
            if (u_or_d == 0)
                mOut.print("\\");
            for (int j = 1; j <= dash_count; j++) {
                if (line_number == 1)
                    mOut.print("-");
                else
                    mOut.print("=");
            }
            if (u_or_d == 1)
                mOut.print("\\");
            if (u_or_d == 0)
                mOut.print("/");
            for (int j = size - i; j > 0; j--) {
                mOut.print(" ");
            }
            dash_count += 2;
            if (line_number == 1)
                line_number = 0;
            else
                line_number = 1;
        }
    }
    public void process(int size) {

        // TODO -- add your code here
        mOut.print("+");
        for(int i=0;i<2*size;i++)
            mOut.print("-");
        mOut.println("+");
        for (int i = 1; i <= size; i++) {
            mOut.print("|");
            print_pattern(i, size,1);
            //if u_or_d==1 : is set to upper part
            mOut.println("|");
        }
        dash_count -= 2;
        for (int i = size - 1; i > 0; i--) {
            mOut.print("|");
            print_pattern(i, size,0);
            // if u_or_d==0:  is set to print the lower part of the diamond
            mOut.println("|");
            dash_count-=4;
        }
        mOut.print("+");
        for(int i=0;i<2*size;i++)
            mOut.print("-");
        mOut.println("+");
    }
}
