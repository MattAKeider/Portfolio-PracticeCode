import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Animal> animals = new ArrayList<>();

        //Sample Dog, Cat, Bird, objects of type Animal
        Animal dogObject = new Dog("Fido");
        Animal catObject = new Cat("HairBall");
        Animal birdObject = new Bird("Tweet");

        //Add animals to animal ArrayList
        animals.add(dogObject);
        animals.add(catObject);
        animals.add(birdObject);

        /*
        Demonstrate polymorphism. Different Animal output depending on type of object
        and data given. Uses a simple for-each loop to loop through Animal
        ArrayList.
         */
        for(Animal x : animals)
        {
            System.out.println(x);
            x.eat();
            x.move();
            x.sleep();
            System.out.println("");
        }

        /*
        birdObject hurt his wings, cast Animal birdObject to Bird object subclass
        to use setFlies() method. Bird can be of type Animal, but Animal cannot be of type
        Bird.
         */
        ((Bird)birdObject).setFlies(false);
        System.out.print("Tweet says: ");
        birdObject.move();

        //Total animals created
        System.out.println("There are " + dogObject.getTotalAnimals() + " animals.");

    }

}
