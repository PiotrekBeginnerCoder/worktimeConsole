package worktime;
import java.util.Scanner;
import java.util.ArrayList;

public class Choice {
    public Scanner inputChoiceScanner = new Scanner(System.in);
    public static ArrayList<String> possibilitiesUser = new ArrayList<>();

    public static void message(){
        System.out.println("Prosze wybierz co chcesz zrobic!");
        possibilitiesUser.add("1 - Rejestracja");
        possibilitiesUser.add("2 - Logowanie");
        possibilitiesUser.add("3 - Wyjście");
        System.out.println(possibilitiesUser);

    }

    public int choiceMethod(){
        System.out.println("Prosze podaj liczbe odpowiadającą wyborowi!");
        int getNUmber = inputChoiceScanner.nextInt();
        while(true){
            if(){

            }


        }







    }
}


