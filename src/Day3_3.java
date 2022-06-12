import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      for(int i=0;i<5;i++){

          System.out.println("Введите "+(i+1)+"-й набор чисел: ");
          double a = sc.nextDouble();
          double b = sc.nextDouble();
          if (b==0){
              System.out.println("Деление на 0...");
              continue;
          }

          System.out.println(a/b);
            }
      }
    }

