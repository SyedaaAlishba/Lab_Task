package Intermediate_Class;

import Base_Class.Cuddly_Toy;

public class Teddy extends Cuddly_Toy {

    public Teddy(String size, String colour){
        this.size=size;
        this.colour=colour;
    }
   @Override
    public void makeNoise(){
        this.noise="\uD83E\uDDF8 Teddy says: Growling Noise";
    }


}
