package org.sprinto.anwar.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
//    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginManager loginManager = new LoginManager();

        List<Borrower> borrowers = new ArrayList<>();
        borrowers.add(new Borrower("Martin", "1234567"));
        borrowers.add(new Borrower("Oscar", "vemvet"));
        borrowers.add(new Borrower("Anwar", "hej123"));

        Author authorJK = new Author("JK Rowling");
        Author authorMartinG = new Author("Martin Gruter");
        Author authorOskar = new Author("Oscar Devloop");

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry potter", "fantasy", authorJK));
        books.add(new Book("Sagan om ringen", "fantasy", authorMartinG));
        books.add(new Book("Star wars", "sci-fi", authorOskar));

        List<Loan> loans = new ArrayList<>();

//        Boolean loggedIn = false;

        while (true) {
            Borrower currentBorrower = null;
            while (currentBorrower == null) {
                currentBorrower = loginManager.login(borrowers);
            }

            Boolean loggedIn = true;

            while (loggedIn) {
                System.out.println("1. Lista alla böcker");
                System.out.println("2. Logga ut");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        for (Book book : books) {
                            System.out.println(book.getTitle() + " by " + book.getAuthor().getName() + " (" + book.getGenre() + ")");
                        }
                        break;
                    case 2:
                        loggedIn = false;
                        currentBorrower = null;
                        break;
                    default:
                        System.out.println("Ogiltigt val. Försök igen.");
                        break;
                }
            }
        }
    }

//    public static Borrower loginMeny(List<Borrower> borrowers) {
//        System.out.println("Welcome log in");
//        System.out.println("Enter your username: ");
//        String answerName = sc.nextLine();
//        System.out.println("Enter your password: ");
//        String answerPassword = sc.nextLine();
//
//        for (int i = 0; i < borrowers.size(); i++) {
//            if (borrowers.get(i).getUsername().equals(answerName) && borrowers.get(i).getPassword().equals(answerPassword)) {
//                System.out.println("You have successfully logged in");
//                return borrowers.get(i);
//            }
//        }
//        return null;
//    }
}
