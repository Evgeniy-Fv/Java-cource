import java.util.Arrays;
import java.util.Random;

public class Day4_3 {
public static void main(String[] args){

dimArray array1 = new dimArray();
array1.setArray(12,8,50);
array1.dispArray();
array1.shMaxString();

}
}

class dimArray{
    private int[][] array;
    private int kk, kk2;
    public void setArray(int m, int n, int ch) {
       kk = m;
        kk2 = n;
        array = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i <m ; i++) {
            for(int j = 0; j<n;j++){
                array[i][j] = rand.nextInt(ch);
            }}

        }
    public void dispArray() {
        System.out.println("Массив: "+Arrays.deepToString(array));
    }
    public void shMaxString(){
        int sum = 0;
        int max = 0;
        int index = 0;
        int[] array_2 = new int[kk];
        max = array_2[0];
        for (int i = 0; i <kk ; i++) {
            for (int j = 0; j < kk2; j++) {
                sum = sum + array[i][j];
                array_2[i] = sum;
            }
            if (max < array_2[i])
                index = i;
        }


        System.out.println("Сумма строк массива: "+Arrays.toString(array_2));
        System.out.println("Номер строки с максимальной суммой: "+index);
    }

}