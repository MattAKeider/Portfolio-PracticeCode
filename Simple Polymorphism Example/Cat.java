
//Cat class extends Abstract Animal class
public class Cat extends Animal
{
    //Default constructor
    public Cat()
    {

    }

    //Overridden constructor sets Cat name
    public Cat(String name)
    {
        //Passed to superclass constructor
        super(name);
    }

    //Abstract move() method implemented
    @Override
    public void move()
    {
        System.out.println("I like to sneak on the prowl!");
    }

    //Abstract eat() method implemented
    @Override
    public void eat()
    {
        System.out.println("I like to eat fish!");
    }

    //abstract sleep() method implemented
    @Override
    public void sleep()
    {
        System.out.println("I like to take naps!");
    }


}
