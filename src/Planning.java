import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Planning {

    private final int totalStudents;
    private Student[] students;
    private Exam[] exams;
    private final int totalExams;

    Planning() {
        this.totalStudents = totalStudents();
        setStudents();
        this.totalExams = totalExams();
        setExams();
    }

    private int totalStudents() {
        System.out.println("Enter total students:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void setStudents() {
        Student[] studentList = new Student[totalStudents];
        for (int i = 0; i < totalStudents; i++) {
            studentList[i] = new Student();
        } this.students = studentList;
    }

    public Student[] getStudents() {
        return students;
    }

    private int totalExams() {
        System.out.println("Enter total exams:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void setExams() {
        Exam[] examList = new Exam[totalExams];
        for (int i = 0; i < totalExams; i++) {
            examList[i] = new Exam(students);
        } this.exams = examList;
    }

    public Exam[] getExams() {
        return exams;
    }

    public void print() {
        System.out.println();
        for (Exam exam : exams) {
            System.out.print(exam.getExam() + ": ");
            for (int i = 0; i < exam.getStudentPerExam().toArray().length; i++) {
                if (i == (exam.getStudentPerExam().toArray().length - 1)) {
                    System.out.print(exam.getStudentPerExam().get(i).getFullName());
                }
                else System.out.print(exam.getStudentPerExam().get(i).getFullName() + ", ");
            } System.out.println();
        }
    }


}
