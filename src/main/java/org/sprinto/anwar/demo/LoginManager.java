package org.sprinto.anwar.demo;

import java.util.List;
import java.util.Scanner;

public class LoginManager {

    private static Scanner sc = new Scanner(System.in);

    public Borrower login(List<Borrower> borrowers) {
        System.out.println("Welcome log in.");

        System.out.print("Enter your username: ");
        String answerName = sc.nextLine();

        System.out.print("Enter your password: ");
        String answerPassword = sc.nextLine();

        for (Borrower borrower : borrowers) {
            if (borrower.getUsername().equals(answerName) && borrower.getPassword().equals(answerPassword)) {
                System.out.println("You have successfully logged in!");
                return borrower;
            }
        }

        System.out.println("Incorrect username or password.");
        return null;
    }
}
