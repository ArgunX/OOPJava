package practic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student petr = new Student("petr", 12);
        Student pavel = new Student("pavel",42);
        Student ira = new Student("ira",65);
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(petr);
        studentGroup.addStudent(pavel);
        studentGroup.addStudent(ira);

//        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (Student student :studentGroup){
            System.out.println(student);
        }
        ArrayList<Student> arrayList = new ArrayList<>(List.of(petr,pavel,ira));
        System.out.println(arrayList);
        Collections.sort(arrayList, (s1,s2) -> s2.id - s1.id);
        System.out.println(arrayList);

    }
}
