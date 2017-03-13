
//Abstract class Animal
public abstract class Animal
{
    private static int totalAnimals = 0; //Keep track of total animals
    private String name;

    //Constructor
    public Animal()
    {
        //Increment totalAnimals by 1
        totalAnimals++;
    }

    //Overloaded constructor takes animal name, increments totalAnimals
    public Animal(String name)
    {
        this.name = name;
        totalAnimals++;
    }

    //Get total animals created
    public int getTotalAnimals()
    {
        return totalAnimals;
    }

    //Set animal name
    public void setName(String name)
    {
        this.name = name;
    }

    //Get animal name
    public String getName()
    {
        return name;
    }

    //toString() method returns default string info about animal
    public String toString()
    {
        return String.format("My name is %s, and I am of %s",getName(),getClass());
    }

    //Abstract methods that must be implemented by subclasses
    public abstract void move();
    public abstract void eat();
    public abstract void sleep();

}
