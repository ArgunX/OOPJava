package practic1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return t1.id - student.id;
    }
}
