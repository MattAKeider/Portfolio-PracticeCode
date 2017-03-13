//Superclass

public class Vehicle
{
    private String make;
    private String model;
    private String color;
    private int noOfCyl;
    private boolean isCar;

    //Constructor sets default values
    public Vehicle()
    {
        make = "n/a";
        model = "n/a";
        color = "n/a";
        noOfCyl = 4;
        isCar = true;
    }

    //Constructor with parameters
    public Vehicle(String make, String model, boolean isCar)
    {
        this.make = make;
        this.model = model;
        this.isCar = isCar;
    }

    //Setter
    public void setMake(String make)
    {
        this.make = make;
    }

    //Getter
    public String getMake()
    {
        return make;
    }

    //Setter
    public void setModel(String model)
    {
        this.model = model;
    }

    //Getter
    public String getModel()
    {
        return model;
    }

    //Setter
    public void setColor(String color)
    {
        this.color = color;
    }

    //Getter
    public String getColor()
    {
        return color;
    }

    //Setter
    public void setNoOfCyl(int noOfCyl)
    {
        if((noOfCyl==4)||(noOfCyl==6)||(noOfCyl==8)||(noOfCyl==12))
        {
            this.noOfCyl = noOfCyl;
        }
        else
        {
            System.out.println("Invalid number of cylinders given. Using " + this.noOfCyl);
        }
    }

    //Getter
    public int getNoOfCyl()
    {
        return noOfCyl;
    }

    //Setter
    public void setIsCar(boolean isCar)
    {
        this.isCar = isCar;
    }

    //toString method to output String.
    public String toString()
    {
        return String.format("Make: %s\nModel: %s\n",make,model);
    }

}
