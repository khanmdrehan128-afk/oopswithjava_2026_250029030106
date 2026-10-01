import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        // Higher marks first
        if (s1.marks != s2.marks) {
            return Integer.compare(s2.marks, s1.marks);
        }

        // Same marks -> smaller roll number first
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 85));
        students.add(new Student(101, "Aman", 95));
        students.add(new Student(102, "Riya", 95));
        students.add(new Student(104, "Karan", 75));

        Collections.sort(students, new StudentComparator());

        for (Student s : students) {
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
        }
    }
}