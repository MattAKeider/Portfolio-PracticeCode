
//Subclass to Vehicle Class. Implements Speed Interface.
public class SportsCar extends Vehicle implements Speed
{
    private int topSpeed = 140;

    //Constructor
    public SportsCar()
    {
        topSpeed = 140;
    }

    //Constructor with parameters. Inherits superclass constructor within.
    public SportsCar(String make,String model,boolean isCar)
    {
        super(make,model,isCar);
    }

    //Abstract method from Speed Interface
    @Override
    public void setTopSpeed(int topSpeed)
    {
        if((topSpeed<140)||(topSpeed>220))
        {
            System.out.println("Invalid Top Speed to be a sports car! Speed set to " + this.topSpeed);
        }
        else
        {
            this.topSpeed = topSpeed;
        }
    }

    //Abstract method from Speed Interface
    @Override
    public int getTopSpeed()
    {
        return topSpeed;
    }

    //toString method that uses Superclass toString method.
    public String toString()
    {
        return String.format(super.toString() + "Top Speed: %d\n",topSpeed);
    }
}




