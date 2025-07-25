package Cuddly_Toy_Program;


import Intermediate_Class.Bunny;
import Intermediate_Class.Teddy;
import Lowest_Level_Class.Bank_manager;
import Lowest_Level_Class.Clown;
import Lowest_Level_Class.Engine_driver;
import Lowest_Level_Class.Gardeners;

public class Program {
    public void run() {

        Teddy teddy_bear = new Teddy("medium", "Blue");
        teddy_bear.makeNoise();
        System.out.println("------Teddy------");
        System.out.println("Noise: " + teddy_bear.getNoise());

        Engine_driver Driver= new Engine_driver("large");
        Driver.describe();
        Driver.setSpeed(200);
        Driver.change_gear();
        System.out.println("-----------------");

        Gardeners gardener=new Gardeners("medium");
        gardener.describe();
        System.out.println("-----------------");

        Bunny rabbit= new Bunny("small","White");
        rabbit.makeNoise();
        System.out.println("------Bunny------");
        System.out.println("Noise: "+rabbit.getNoise());

        Clown cute_rabbit= new Clown("small");
        cute_rabbit.describe();
        cute_rabbit.juggleBalls();
        System.out.println("-----------------");

        Bank_manager bank_manager=new Bank_manager("large");
        bank_manager.describe();
        bank_manager.authorize_loan(1900.0);








    }
}
