package Day6;

public class Task2 {
    public static void main(String[] args){

        Airplane air1 = new Airplane("Sukhoi",2020,30,20,0);
        air1.setYear(2018);
        air1.setLength(33);
        air1.fillUp(10);
        air1.fillUp(13);
        air1.info();
    }
}
