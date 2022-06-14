package Day6;

class Motorbike {
    private String model, color;
    private int year, inputYear;


public Motorbike(String model, String color, int year){

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

void info(){
    System.out.println("Это мотоцикл");
}

int yearDifference(int inputYear){
this.inputYear = inputYear - year;
return this.inputYear;
}

}
