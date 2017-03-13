
//Bird class extends Abstract Animal class and implements the Fly interface
public class Bird extends Animal implements Fly
{
    private boolean flies = true;

    //Default Constructor
    public Bird()
    {

    }

    //Overridden constructor sets Bird name
    public Bird(String name)
    {
        //Passed to superclass constructor
        super(name);
    }

    //Set if flies (Fly Interface)
    public void setFlies(boolean flies)
    {
        this.flies = flies;
    }

    //Get if flies (Fly Interface)
    public boolean isFlies()
    {
        return flies;
    }

    //Abstract move() method implemented
    @Override
    public void move()
    {
        //If isFlies() returns false, bird is hurt
        if(!flies)
        {
            System.out.println("My wings are hurt, I cannot fly!!");
        }
        else
        {
            System.out.println("I like to fly!");
        }
    }

    //Abstract eat() method implemented
    @Override
    public void eat()
    {
        System.out.println("I like to eat insects!");
    }

    //Abstract sleep() method implemented
    @Override
    public void sleep()
    {
        System.out.println("I sleep standing up!");
    }


}
