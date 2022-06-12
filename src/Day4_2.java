import java.util.Arrays;
import java.util.Random;
public class Day4_2 {
    public static void main(String[] args){
        Array array1 = new Array();
        array1.setArray(100,10000);
        array1.dispArray();
        array1.max_f();
        array1.min_f();
        array1.zero();
        array1.summZero();

   }}

    class Array{
        private int[] array;
        private int kk;
    public void setArray(int k, int ch) {
        kk = k;
        array = new int[k];
        Random rand = new Random();
        for (int i = 0; i < k; i++) {
            array[i] = rand.nextInt(ch);
        }}

    public void dispArray() {
            System.out.println(Arrays.toString(array));
        }

    public void max_f (){
            int max = 0;

            max = array[0];
            for (int i = 0; i < kk; i++) {

                if (max < array[i]) {
                    max = array[i];
                }
            }

            System.out.println();
           System.out.println("Максимальный элемент:"+max);
        }

        public void min_f (){
            int min = 0;

            min = array[0];
            for (int i = 0; i < kk; i++) {

                if (min > array[i]) {
                    min = array[i];
                }
            }

            System.out.println("Минимальный элемент: "+min);
        }
        public void zero(){
        int count=0;
        for(int i=0;i<kk;i++){
            if(array[i]%10==0)
                count++;
        }
        System.out.println("Количество элементов, заканчивающихся на 0: "+count);
        }
        public void summZero(){
            int sum=0;
            for(int i=0;i<kk;i++){
                if(array[i]%10==0)
                 sum = sum+array[i];
            }
            System.out.println("Сумма элементов, заканчивающихся на 0: "+sum);

        }

}


       