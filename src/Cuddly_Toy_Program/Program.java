package Cuddly_Toy_Program;

import Base_Class.Cuddly_Toy;
import Intermediate_Class.Bunny;
import Intermediate_Class.Teddy;
import Lowest_Level_Class.Bank_manager;
import Lowest_Level_Class.Clown;
import Lowest_Level_Class.Engine_driver;
import Lowest_Level_Class.Gardeners;

public class Program {
    public void run() {

        Cuddly_Toy teddy_bear = new Teddy("Medium", "Blue");
        teddy_bear.makeNoise();
        System.out.println("------\uD83E\uDDF8 Teddy------");
        System.out.println(teddy_bear.getNoise());

        Engine_driver Driver= new Engine_driver("Large");
        Driver.describe();
        Driver.setSpeed(200);
        Driver.change_gear();
        System.out.println("------------------");

        Gardeners gardener=new Gardeners("Medium");
        gardener.makeNoise();
        gardener.describe();
        System.out.println("------------------");

        Bunny rabbit= new Bunny("Small","White");
        rabbit.makeNoise();
        System.out.println("------\uD83D\uDC30 Bunny------");
        System.out.println(rabbit.getNoise());

        Clown cute_rabbit= new Clown("Small");
        cute_rabbit.describe();
        cute_rabbit.juggleBalls();
        System.out.println("------------------");

        Bank_manager bank_manager=new Bank_manager("large");
        bank_manager.describe();
        bank_manager.setLoan_amount(2000);
        bank_manager.authorize_loan();


    }
}
