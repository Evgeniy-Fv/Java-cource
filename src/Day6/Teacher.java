package Day6;
import Day6.Student;

import java.util.Random;

class Teacher {
    String name;
    String subject;


        public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }


    public void evaluate(Student st_new){
            String ev_str = null;
        Random rand = new Random();
        int ev = rand.nextInt(4)+2;
        switch (ev){
            case 2: ev_str = "Неуд";
            break;
            case 3: ev_str = "Удов";
            break;
            case 4: ev_str = "Хорошо";
            break;
            case 5: ev_str = "Отлично";
            break;
        }
        System.out.println("Преподаватель "+name+" оценил студента с именем "+st_new.getName()+" по предмету "+subject+" на оценку "+ev_str);




    }
}
