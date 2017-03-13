
//Dog class extends Abstract Animal class
public class Dog extends Animal
{
    //Default constructor
    public Dog()
    {

    }

    //Overridden constructor sets Dog name
    public Dog(String name)
    {
        //Passed to superclass constructor
        super(name);
    }

    //Abstract eat() method implemented
    @Override
    public void eat()
    {
        System.out.println("I eat meat!");
    }

    //Abstract move() method implemented
    @Override
    public void move()
    {
        System.out.println("I like to run!");
    }

    //Abstract sleep() method implemented
    @Override
    public void sleep()
    {
        System.out.println("I like to take naps!");
    }


}

