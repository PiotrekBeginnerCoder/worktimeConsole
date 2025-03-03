package worktime;

public class Main {
    public static void main(String[] args) {
        projName();
        RegisterUser registerUser = new RegisterUser(null, null, 0, null);
        registerUser.userRegisterMethod();
    }
    public static void projName(){
        System.out.println("WorkTime");
    }
}