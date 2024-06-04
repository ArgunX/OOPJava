package practic1;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

   private StudentGroup studentGroup;
   private  int index=0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    private Student[] getStudents(){
        String[] names = studentGroup.students.toString().split(" ");
        Student[] students = new Student[names.length];

        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i],i*4);

        }
        return students;
    }

    @Override
    public boolean hasNext() {
       return index < getStudents().length;

    }
    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }
}
