import java.util.Random;
import java.util.Arrays;
public class Day4_4 {
    public static void main(String[] args){
    ArrayTrio array = new ArrayTrio();
    array.setArray(100,10001);
    array.dispArray();
    array.trio();

    }
}

class ArrayTrio {
    private int g;
    private int[] array;

    public void setArray(int n, int ch) {
        array = new int[n];
        g = n;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(ch);

        }
        System.out.println();

    }

    public void dispArray() {
        System.out.println("Массив: " + Arrays.toString(array));
    }

  public void trio() {
        int sum = 0;
        int max, max2 = 0;
        int index = 0;
        int[] arraySum = new int[g];
        max = arraySum[0]+arraySum[1]+arraySum[2];
        for (int i = 0; i < (g-2); i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            arraySum[i] = sum;
            if (max < sum) {
                max = sum;
                index = i;
            }

             }
        System.out.println("Максимальная сумма из 3-х подряд элементов: "+max);
        System.out.println("Номер первого элемента максимальной тройки: "+index);

  }

}



