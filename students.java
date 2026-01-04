import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student[age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        return this.age - that.age;  
    }
}

public class students {
    public static void main(String args[]) {

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Dheeraj"));
        studs.add(new Student(20, "Bharath"));
        studs.add(new Student(22, "Hardhik"));
        studs.add(new Student(23, "Charan"));

        Collections.sort(studs);

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
