package worktime;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.text.DateFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Register {
    //Obiekty dodatkowych klas w javie
    static Scanner inputUserData = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //Pola klasy
    String fName;
    String lName;
    int age;
    String email;
    LocalDate userInputDate;

    //Konstruktor pól klasy
    Register(String firstName, String lastName, int ageUser, String emailUser, LocalDate userInputDate){
        this.fName = firstName;
        this.lName = lastName;
        this.age = ageUser;
        this.email = emailUser;
        this.userInputDate = userInputDate;
    }

    public Register() {

    }

    // Metoda pobierająca dane od użytkowników!
    public void userData(){
        System.out.println("Prosze podaj Imie:");
        this.fName = inputUserData.nextLine();

        System.out.println("Prosze podaj Nazwisko:");
        this.lName = inputUserData.nextLine();

        System.out.println("Prosze podać swoja date urodzenia!");
        boolean whileExepction = false;
        while (!whileExepction){
            try{
                String inputScannerUserData = inputUserData.nextLine();
                this.userInputDate = LocalDate.parse(inputScannerUserData, formatter);
                whileExepction = true;

            } catch (DateTimeException e){
                System.out.println("Podano błedny format daty!");
                System.out.println("Prosze wprowadzic poprawny format!");
            }

        }

        System.out.println("Prosze podaj swój E-mail:");
        this.email = inputUserData.nextLine();

        System.out.println("Zakończono poprawnie podawanie danych!");
        System.out.println("Czy chcesz wyswietlic swoje dane?");

        while (true){
            System.out.println("Czy chcesz wyświetlić swoje dane? (True/False)");
            String trueInput = "True";
            String falseInput = "False";
            String choice = inputUserData.nextLine().trim();
            if (trueInput.equals(choice)) {
                showDataUser();
                break;
            } else if (falseInput.equals(choice)) {
                System.out.println("Dalsze wykonywanie operacji zostało zakończone wraz z zapisanymi danymi!");
            } else {
                System.out.println("Niepoprawna wartość! Wpisz 'True' lub 'False'.");
            }

        }



    }
    public void showDataUser(){
        System.out.println("Imie:" + this.fName);
        System.out.println("Nazwisko:" + this.lName);
        System.out.println("Data urodzenia:");
        System.out.println("EMail:" + this.email);
    }



}
