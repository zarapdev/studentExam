import java.util.ArrayList;

public class StudentServiceHandle implements StudentService {
    ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void updateStudent(int registrationNumber,int age) {
        for (Student student : studentList) {
             if (student.getRegistrationNumber()==registrationNumber){
                 student.setAge(age);
                 break;
             }
        }

    }

    @Override
    public void getAllStudent() {
        for (Student student : studentList){
            System.out.println(student);
        }
    }

}
