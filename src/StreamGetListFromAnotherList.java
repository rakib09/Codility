import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGetListFromAnotherList {
    public static void main(String[] args){
        List<Student> allStudent = new ArrayList<Student>();
        allStudent.add(new Student("Rakib", 93004, 25.0));
        allStudent.add(new Student("Borson", 93003, 26.0));
        allStudent.add(new Student("Sadia", 93002, 27.0));
        allStudent.add(new Student("Basar", 93001, 28.0));

        List<Student> studentList =
                allStudent
                .stream()
                .filter(k->(k.getAge()>25.0 && k.getAge() < 28))
                        .collect(Collectors.toList());
        for(Student  student: studentList) {
            System.out.println(student.getName());
        }
        allStudent.stream().filter(k-> {
            if((k.getAge()>25.0 && k.getAge() < 28)) {
                System.out.println("fillter " + k.getName());
                return true;
            }
            return true;
        }).forEach(k -> System.out.println("foreach " + k.getName()));
    }

    static class Student {
        String name;
        int roll;
        Double age;

        Student(String name, int roll, Double age) {
            this.name = name;
            this.roll = roll;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public Double getAge() {
            return age;
        }

        public void setAge(Double age) {
            this.age = age;
        }
    };
}
