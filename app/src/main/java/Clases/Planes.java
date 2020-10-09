package Clases;

public class Planes {

    private int xtreme;
    private int suave;

    //constructor

    public  Planes()
    {
        xtreme =12000;
        suave = 24000;
    }

    public int getXtreme()
    {
        return xtreme;
    }
    public int getSuave()
    {
        return suave;
    }

    public  void setXtreme(int xtreme)
    {
        this.xtreme = xtreme;
    }

    public  void setSuave(int suave)
    {
        this.suave = suave;
    }
}
