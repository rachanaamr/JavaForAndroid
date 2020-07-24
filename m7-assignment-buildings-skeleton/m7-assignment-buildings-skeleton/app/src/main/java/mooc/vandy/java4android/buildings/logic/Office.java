package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    // TODO - Put your code here.
    String mBusinessName;
    int mParkingSpaces;
    private static int sTotalOffices=0;
    Office(int length,int width,int lotLength,int lotWidth)
    {
        super(length,width,lotLength,lotWidth);
        sTotalOffices++;
    }
    Office(int length,int width,int lotLength,int lotWidth,String businessName)
    {
        super(length,width,lotLength,lotWidth);
        mBusinessName=businessName;
        sTotalOffices++;
    }
    Office(int length,int width,int lotLength,int lotWidth,String businessName, int parkingSpaces)
    {
        super(length,width,lotLength,lotWidth);
        mBusinessName=businessName;
        mParkingSpaces=parkingSpaces;
        sTotalOffices++;
    }
    public String getBusinessName()
    {
        return mBusinessName;
    }
    public int getParkingSpaces()
    {
        return mParkingSpaces;
    }
    public void  setBusinessName(String name)
    {
        mBusinessName=name;
    }
    public void setParkingSpaces(int space)
    {
        mParkingSpaces=space;
    }
    public String toString()
    {
        return "Business: " +
                (mBusinessName != null ? mBusinessName : "unoccupied") +
                (mParkingSpaces != 0 ? "; has " + mParkingSpaces + " parking spaces" : "") +
                " (total offices: " + sTotalOffices + ")";
    }
    public boolean equals(Object o)
    {
        Office obj=(Office) o;
        if(this.calcBuildingArea()==obj.calcBuildingArea() && this.getParkingSpaces()==obj.getParkingSpaces())
            return true;
        else
            return false;
    }
}
