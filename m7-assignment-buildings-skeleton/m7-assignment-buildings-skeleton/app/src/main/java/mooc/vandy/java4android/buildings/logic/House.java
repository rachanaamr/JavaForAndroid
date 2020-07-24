package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    String mOwner;
    boolean mPool;
    House(int length,int width,int lotLength,int lotWidth)
    {
        super(length,width,lotLength,lotWidth);
    }
    House(int length,int width,int lotLength,int lotWidth,String owner)
    {
        super(length,width,lotLength,lotWidth);
        mOwner=owner;
    }
    House(int length,int width,int lotLength,int lotWidth,String owner,boolean pool)
    {
        super(length,width,lotLength,lotWidth);
        mOwner=owner;
        mPool=pool;
    }
    public String getOwner()
    {
        return mOwner;
    }
    public Boolean hasPool()
    {
        return mPool;
    }
    public void setOwner(String owner)
    {
        mOwner=owner;
    }
    public void setPool(boolean pool)
    {
        mPool=pool;
    }
    public String toString()
    {
        return "Owner: " + (mOwner!=null ? mOwner : "n/a") +
                (hasPool() ? "; has a pool" : "") +
                (calcLotArea() > calcBuildingArea() ? "; has a big open space" : "");
    }
    public boolean equals(Object o)
    {
        House h=(House) o;
        if(this.calcBuildingArea() ==h.calcBuildingArea() && this.mPool==h.mPool)
            return true;
        else return false;
    }

}
