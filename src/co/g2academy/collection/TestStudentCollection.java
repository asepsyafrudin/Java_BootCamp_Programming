package co.g2academy.collection;

import java.util.ArrayList;

public class TestStudentCollection {
    public static void main(String[] args) {
        //Creating user-defined class object
        Student sonoo = new Student(101, "Sonoo", 23);
        Student ravi = new Student(102, "Ravi", 21);
        Student hunamat = new Student(103, "Hunamat" , 25);

        //creating array list

        ArrayList<Student> studentlist = new ArrayList<>();
        studentlist.add(sonoo);
        studentlist.add(ravi);
        studentlist.add(hunamat);

        for(Student st : studentlist) {
            System.out.println(st.id + " " + st.name + st.age);
        }
    }
}
