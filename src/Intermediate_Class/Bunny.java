package Intermediate_Class;

import Base_Class.Cuddly_Toy;

public class Bunny extends Cuddly_Toy {
    public Bunny(String size, String colour){
        this.size=size;
        this.colour=colour;
    }
    @Override
    public void makeNoise(){
        this.noise="\uD83D\uDC30 Bunny says: Squeak!";
    }

}
