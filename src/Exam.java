import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    private String exam;
    private ArrayList<Student> studentPerExam;

    Exam(Student[] students) {
        setExam();
        setStudentPerExam(students);
    }

    private void setExam() {
        System.out.println("Fill in exam:");
        Scanner scanner = new Scanner(System.in);
        this.exam = scanner.nextLine();
    }

    public String getExam() {
        return exam;
    }

    private void setStudentPerExam(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentPerExam = new ArrayList<>();
        for (Student student : students) {
            System.out.println("Does " + student.getFullName() + " has exam: " + exam + "?");
            if (scanner.nextLine().equalsIgnoreCase("ja")) {
                studentPerExam.add(student);
            }
        } this.studentPerExam = studentPerExam;
    }

    public ArrayList<Student> getStudentPerExam() {
        return studentPerExam;
    }

}
