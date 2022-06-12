import java.util.Scanner;

public class Day2 {

    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество этажей: ");
        int x = sc.nextInt();
        if(x>0 && x<5){
            System.out.println("Малоэтажный дом");}else if(x>5 && x<10){
            System.out.println("Среднеэтажный дом");}else if(x>9){
            System.out.println("Многоэтажный дом");}else{
            System.out.println("Ошибка ввода...");}
    }
}
