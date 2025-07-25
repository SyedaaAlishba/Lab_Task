package Base_Class;

public class Cuddly_Toy {
   public String size;
   public String job;
   public String colour;
   public String noise;


   public  Cuddly_Toy(){

   }

    public void set(String size, String job, String colour, String noise){
       this.size=size;
       this.colour=colour;
       this.job=job;
       this.noise=noise;
    }

    public String getSize() {
        return size;
    }
    public String getJob(){
       return job;
    }
    public String getColour() {
       return colour;
    }
    public String getNoise(){
       return noise;
    }
    public void describe(){
        System.out.println("Job "+getJob());
        System.out.println("Size "+getSize());
        System.out.println("Colour "+getColour());
    }
    public void makeNoise(){
       this.noise=getNoise();
    }


}
