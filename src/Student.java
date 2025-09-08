import java.util.*;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{name ='" + name + "', marks =" + marks + "}";
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 85));
        students.add(new Student("Priya", 75));
        students.add(new Student("Ankit", 65));

        students.sort((s1, s2) -> Integer.compare(s1.marks, s2.marks));
        System.out.println("Sorted by marks: " + students);

        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Sorted by name: " + students);
    }
}
