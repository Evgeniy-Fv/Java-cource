public class Day5_2 {
  public static void main(String[] args){
    Motorbike mtb = new Motorbike("Honda", "Silver", 2021);
    System.out.println(mtb.getMod());
    System.out.println(mtb.getCol());
    System.out.println(mtb.getYear());

  }

}

class Motorbike{
    private String model, color;
    private int year;

public Motorbike(String model,String color, int year){

    this.model = model;
    this.color = color;
    this.year = year;
}

public String getMod(){
    return model;

}
public String getCol(){
        return color;

}
public int getYear(){
    return  year;
}

}
