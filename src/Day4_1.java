import java.util.Scanner;
import java.util.Random;
public class Day4_1 {
public static void main(String[] args) {
    int count = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Введите размер массива: ");
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
        array[i] = rand.nextInt(11);
        if (array[i] > 8) count++;
        if (array[i] ==1) count2++;
        if ((array[i])%2 == 0) count3++;
        else count4++;
        sum = sum + array[i];
    }
    System.out.println();
    for (int x : array) {
        System.out.println(x);
    }
    System.out.println();
    System.out.println("Длинна массива: " + array.length);
    System.out.println("Количество цифр более 8: " + count);
    System.out.println("Количество цифры 1: " + count2);
    System.out.println("Количество четных чисел: " + count3);
    System.out.println("Количество нечетных чисел: " + count4);
    System.out.println("Сумма чисел массива: " + sum);


}
}
