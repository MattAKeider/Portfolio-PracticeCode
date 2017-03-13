
public class CarMain
{
    public static void main(String[] args)
    {
        //Truck, SportsCar, Beater, objects
        Truck f150 = new Truck("Ford","F150",false);
        SportsCar corvette = new SportsCar("Chevy","Corvette",true);
        Truck ranger = new Truck("Ford","Ranger",false);
        Beater crappy = new Beater("Chevy", "Junker", true);

        //Engine objects to use in various vehicles
        Engine corV12 = new Engine();
        Engine f150V8 = new Engine();
        Engine rangV6 = new Engine();

        //Set corvette attributes
        corvette.setTopSpeed(200);
        corvette.setColor("Rally Red");
        corvette.setNoOfCyl(12);

        //Set F150 attributes
        f150.setNoOfCyl(8);
        f150.setTireSize(32.2);
        f150.setColor("Black");
        f150.raised(true);

        //Set Ranger attributes
        ranger.raised(true);
        ranger.setNoOfCyl(6);
        ranger.setTireSize(25);

        //Set crappy car attributes
        crappy.setBadPaint(true);
        crappy.setBalledTires(false);
        crappy.setBrokenWindows(true);

        //Set Horsepower for vehicles
        f150V8.setHorsepower(f150);
        corV12.setHorsepower(corvette);
        rangV6.setHorsepower(ranger);

        //Printout different vehicle objects toString methods
        System.out.println(f150 + "\n" + corvette + "\n" + ranger + "\n" + crappy);

    }

}