package Day7;

public class Airplane {
    private String manufacturer;
    private int year, length,weight, fuel;

    public Airplane(String manufacturer, int year, int length, int weight, int fuel){
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

    public int getLength(){ return  length;}

    public int getFuel(){

        return fuel;
}

void info(){
System.out.println("Изготовитель: "+manufacturer+", год выпуска:"+year+", длина:"+length+", вес:"+weight+", топливо в баке:"+fuel);
}

void fillUp(int fuel){
this.fuel = fuel+this.fuel;
}

public static void compareAirplanes(Airplane pl1, Airplane pl2){
if(pl1.getLength()> pl2.getLength())
    System.out.println("Самолёт "+pl1.manufacturer+" длинее, чем самолет "+pl2.manufacturer);
else if (pl1.getLength()< pl2.getLength())
    System.out.println("Самолёт "+pl2.manufacturer+" длинее, чем самолет "+pl1.manufacturer);
else System.out.println("Длины самолетов равны.");
}
}