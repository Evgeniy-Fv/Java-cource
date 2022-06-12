import java.util.Scanner;
import static java.lang.Math.*;

public class Day2_4 {
    static public void main(String[] args) {
        double y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = sc.nextDouble();
       if(x>=5) {
           y = (pow(x,2) - 10) / (x + 7);

       }else if (x>-3 && x<5){
           y = (x+3)*(pow(x,2) - 2);

           } else {
           y = 420;
       }
        System.out.println(y);
       }
    }

