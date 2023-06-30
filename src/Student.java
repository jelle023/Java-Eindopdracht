import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private String fullName;


    Student() {
        setFirstname();
        setLastname();
        setFullName();
    }

    private void setFirstname() {
        System.out.println("Fill in student firstname:");
        Scanner scanner = new Scanner(System.in);
        this.firstname = scanner.nextLine();
    }

    private void setLastname() {
        System.out.println("FIll in student lastname:");
        Scanner scanner = new Scanner(System.in);
        this.lastname = scanner.nextLine();
    }

    private void setFullName() {
        this.fullName = firstname + " " + lastname;
    }

    public String getFullName() {
        return fullName;
    }
}
