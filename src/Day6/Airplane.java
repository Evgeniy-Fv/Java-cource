package Day6;

public class Airplane {
    private String manufacturer;
    private int year, length,weight, fuel;

    public Airplane(String manufacturer,int year,int length, int weight, int fuel){
    this.manufacturer = manufacturer;
    this.year = year;
    this.length = length;
    this.weight = weight;
    this.fuel = fuel;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
        }
    public void setYear(int year){
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWeigh()
    {
        this.weight = weight;
        }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getFuel(){

        return fuel;
}

void info(){
System.out.println("Изготовитель: "+manufacturer+", год выпуска:"+year+", длина:"+length+", вес:"+weight+", топливо в баке:"+fuel);

}
void fillUp(int fuel){
this.fuel = fuel+this.fuel;

}
}