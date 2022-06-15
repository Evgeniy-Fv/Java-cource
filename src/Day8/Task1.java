package Day8;

public class Task1 {

    public static void main(String[] args){
    String str = "0";
    long startTime = System.currentTimeMillis();

    for(int i=1;i<=20000;i++)
    {
        str = str+" "+ i;
    }
    long stopTime = System.currentTimeMillis();


        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("0");
        for(int i=1;i<=20000;i++)
        {
            sb.append(" ").append(i);
        }
        long stopTime2 = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));

System.out.println(str);
System.out.println();
System.out.println(sb.toString());

}}
