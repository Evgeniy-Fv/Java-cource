import java.util.Scanner;

public class Day3_1 {
    public static void main(String[] args) {
               while(true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите название города: ");
                String city = sc.nextLine();

                if(city.equals("stop")){
                    break;}

            switch (city) {
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
                case "Rim":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                case "Liverpool":
                case "Manchester":
                case "London":
                    System.out.println("England");
                    break;
                case "Berlin":
                case "Munchen":
                case "Keln":
                    System.out.println("Germany");
                    break;
                default:
                {System.out.println("Неизвестная страна..");}
            }
        }}}



