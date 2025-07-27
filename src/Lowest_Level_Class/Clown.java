package Lowest_Level_Class;

import Intermediate_Class.Bunny;

public class Clown extends Bunny {
    public Clown(String size){
        super(size,"White");
        this.job="Clown";
    }
    public void juggleBalls(){
        System.out.println(getColour()+" Clown "+"is juggling balls" );
    }

    @Override
    public String getNoise() {
        return super.getNoise();
    }
}
