public class main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceHandle();
        studentService.addStudent(new Student("Lala", 18, 1215));
        studentService.addStudent(new Student("afa", 21, 1216));
        studentService.updateStudent(1216,22);
        studentService.getAllStudent();
    }
}
