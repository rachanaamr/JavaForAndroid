package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public static final int HERD=24; //the size of escargatoire
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public void simulateHerd(Random rand)
    {
        int inPen=HERD;
        int outPastuer=0;
        final int EAST=1;
        mOut.println("There are currently "+inPen+"snails in the pen and "+outPastuer+"snails in the pastuer");
        for(int i=0;i<MAX_ITERATIONS;i++)
        {
            if(inPen==0)
            {
                int temp=rand.nextInt(outPastuer)+1;
                inPen+=mWestGate.thru(temp);
                outPastuer=HERD-inPen;
            }
            else if (inPen==HERD)
            {
                int temp=rand.nextInt(inPen)+1;
                inPen+=mEastGate.thru(temp);
                outPastuer=HERD-inPen;
            }
            else
            {
                int gate=rand.nextInt(2);
                if(gate==EAST)
                {
                    int temp=rand.nextInt(inPen)+1;
                    inPen+=mEastGate.thru(temp);
                    outPastuer=HERD-inPen;
                }
                else
                {
                    int temp=rand.nextInt(outPastuer)+1;
                    inPen+=mWestGate.thru(temp);
                    outPastuer=HERD-inPen;
                }
            }
            mOut.println("There are currently "+inPen+"snails in the pen and "+outPastuer+"snails in the pastuer");
        }

    }



}
