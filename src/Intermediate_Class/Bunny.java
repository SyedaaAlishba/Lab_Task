package Intermediate_Class;

import Base_Class.Cuddly_Toy;

public class Bunny extends Cuddly_Toy {
    public Bunny(String size, String colour){
        super(size,colour,"Bunny");

    }
    @Override
    public void makeNoise(){
        this.noise="Bunny says: Squeak!";
    }

    @Override
    public String getNoise() {
        return super.getNoise();
    }
}
