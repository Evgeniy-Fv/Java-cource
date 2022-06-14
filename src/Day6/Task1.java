package Day6;


public class Task1 {
    public static void main(String[] args){
    Motorbike mt1 = new Motorbike("Yamaha", "Blue", 2013);
    mt1.info();
    System.out.println("Разница:"+Math.abs(mt1.yearDifference(2010)));
    System.out.println();
    car car1 = new car();
    car1.setColor("White");
    car1.setModel("Zhiguli");
    car1.setYear(1987);
    car1.info();;
    System.out.println("Разница:"+Math.abs(car1.yearDifference(2010)));

    }
}
