import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int rollno;
    int marks;

    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    // Natural ordering: students are sorted by marks from lowest to highest.
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
}

public class comparatorsortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(12);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Ascending: " + numbers);
        numbers.sort(Collections.reverseOrder());
        System.out.println("Descending: " + numbers);

        List<Student> students = new ArrayList<>();
        students.add(new Student("rahul", 1, 100));
        students.add(new Student("nitesh", 10, 20));
        students.add(new Student("neetesh", 7, 80));
        students.add(new Student("hitesh", 9, 70));
        students.add(new Student("rehan", 20, 80));

        // Comparable provides ascending order; reverse it to show highest marks first.
        Collections.sort(students, Collections.reverseOrder());

        for (Student student : students) {
            System.out.println(student.rollno + " " + student.name + " " + student.marks);
        }
    }
}
