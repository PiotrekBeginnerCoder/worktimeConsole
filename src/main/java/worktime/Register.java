package worktime;
import java.util.Scanner;

public class Register {
    static Scanner scanner = new Scanner(System.in);
    String fName;
    String lName;
    int age;
    String email;

    Register(String firstName, String lastName, int ageUser, String emailUser){
        this.fName = firstName;
        this.lName = lastName;
        this.age = ageUser;
        this.email = emailUser;
    }


}
