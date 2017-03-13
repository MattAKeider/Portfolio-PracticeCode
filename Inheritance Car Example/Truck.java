
//Truck class inherits from Superclass Vehicle and implements Offroad Interface.
public class Truck extends Vehicle implements OffRoad
{
    private boolean raised;
    private double tireSize;

    //Constructor sets default values
    public Truck()
    {
        raised = true;
        tireSize = 30.0;
    }

    //Constructor inherits superclass constructor within method
    public Truck(String make,String model,boolean isCar)
    {
        super(make,model,isCar);
    }

    //Abstract method inherited from Off-road Interface
    @Override
    public void raised(boolean raised)
    {
        this.raised = raised;
    }

    //Abstract method inherited from Off-road Interface
    @Override
    public void setTireSize(double tireSize)
    {
        if((tireSize<21.0)||(tireSize>45.5))
        {
            System.out.println("Not applicable tire size. Tire size set to " + this.tireSize);
        }
        else
        {
            this.tireSize = tireSize;
        }
    }

    //Abstract method inherited from Off-road Interface
    @Override
    public double getTireSize()
    {
        return tireSize;
    }
}
