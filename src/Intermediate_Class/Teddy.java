package Intermediate_Class;

import Base_Class.Cuddly_Toy;

public class Teddy extends Cuddly_Toy {

    public Teddy(String size, String colour){
        super(size,colour,"Teddy");
    }
   @Override
    public void makeNoise(){
        this.noise="Teddy says: Growling Noise";
    }


}
