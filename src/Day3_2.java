import java.util.Scanner;

public class Day3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Введите 2 числа: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
           if(b==0)
               break;
            System.out.println("Результат: "+a/b);


        }

    }
}
