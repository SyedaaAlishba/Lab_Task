package Lowest_Level_Class;

import Intermediate_Class.Teddy;

public class Engine_driver extends Teddy {

    int speed;

    public Engine_driver(String size){
      super(size,"Blue");
      this.job="Engine Driver";
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void change_gear(){
        System.out.println("Gear Changed Speed is "+getSpeed());
    }


}
