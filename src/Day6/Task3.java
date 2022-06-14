package Day6;

public class Task3 {
    public static void main(String[] args){

        Student st1 = new Student("Петров Иван");
        Teacher t1 = new Teacher("Иванов Сергей","Русский язык");
        t1.evaluate(st1);
    }
}
