import java.util.Scanner;

public class Day2_2 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=b){
            System.out.println("Некорректный ввод...");
        }else{
        for (int x = a+1; x < b; x++) {

              if ((x%5) == 0 && (x%10)!=0){
                System.out.print(x + " ");}
        }}
    }
}
