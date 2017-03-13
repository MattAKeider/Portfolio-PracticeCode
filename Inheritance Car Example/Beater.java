//Beater Car Class
public class Beater extends Vehicle
{
    private boolean brokenWindows;
    private boolean badPaint;
    private boolean balledTires;

    //Default constructor to set default values
    public Beater()
    {
        brokenWindows = false;
        badPaint = false;
        balledTires = false;
    }

    //Constructor inherits superclass constructor within method
    public Beater(String make,String model,boolean isCar)
    {
        super(make,model,isCar);
    }

    //Setter
    public void setBrokenWindows(boolean brokenWindows)
    {
        this.brokenWindows = brokenWindows;
    }

    //Getter
    public boolean isBrokenWindows()
    {
        return brokenWindows;
    }

    //Setter
    public void setBadPaint(boolean badPaint)
    {
        this.badPaint = badPaint;
    }

    //Getter
    public boolean isBadPaint()
    {
        return badPaint;
    }

    //Setter
    public void setBalledTires(boolean balledTires)
    {
        this.balledTires = balledTires;
    }

    //Getter
    public boolean isBalledTires()
    {
        return balledTires;
    }

    //Return total damage
    public String getDamage()
    {
        String totDamage = "";

        if(balledTires)
        {
            totDamage += "Bad Tires, ";
        }
        if(brokenWindows)
        {
            totDamage += "Broken Windows, ";
        }
        if(badPaint)
        {
            totDamage += "Bad Paint.";
        }

        return totDamage;
    }

    //toString method that uses Superclass toString method.
    public String toString()
    {
        return String.format(super.toString() + "\nYour vehicle has " + getDamage());
    }


}
