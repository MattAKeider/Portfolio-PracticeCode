//Engine Class
public class Engine
{
    private int horsepower;
    private int cylUsed;

    //Constructor sets default values
    public Engine()
    {
        horsepower = 200;
        cylUsed = 4;
    }

    //Constructor with Vehicle object as parameter
    public void setHorsepower(Vehicle vehObj)
    {
        cylUsed = vehObj.getNoOfCyl();

        switch(cylUsed){
            case 4:
                horsepower = 200;
                break;
            case 6:
                horsepower = 230;
                break;
            case 8:
                horsepower = 325;
                break;
            case 12:
                horsepower = 500;
                break;
        }
    }

    //Getter
    public int getHorsepower()
    {
        return horsepower;
    }

    //toString method
    public String toString()
    {
        return String.format("The horsepower of this %d cylinder engine is %d\n", cylUsed ,horsepower);
    }
}
