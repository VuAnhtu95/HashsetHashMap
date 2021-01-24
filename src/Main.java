import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("Tus",26,"HN");
        Student studentTwo = new Student("Tú",26,"HN");
        Student studentThree = new Student("Tu's",26,"HN");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,studentOne);
        studentMap.put(2,studentTwo);
        studentMap.put(3,studentThree);
        studentMap.put(4,studentThree);
        for (Map.Entry<Integer,Student> student:studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        Set<Student> students = new HashSet<>();
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentThree);
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
