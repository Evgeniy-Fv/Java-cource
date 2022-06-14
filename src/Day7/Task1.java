package Day7;



public class Task1 {
    public static void main(String[] args) {


        Airplane air1 = new Airplane("Sukhoi", 2020, 24, 20, 0);
        Airplane air2 = new Airplane("Boing", 2010, 26, 25, 0);

        Airplane.compareAirplanes(air1,air2);
    }
}
