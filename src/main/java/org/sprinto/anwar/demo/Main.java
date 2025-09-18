package org.sprinto.anwar.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Borrower> borrowers = new ArrayList<>();
        borrowers.add(new Borrower("martin", "1234567"));
        borrowers.add(new Borrower("Oskar", "vemvet"));
        borrowers.add(new Borrower("anwar", "hej123"));


        Author authorJK = new Author("JK Rowling");
        Author authorMartinG = new Author("Martin Gruter");
        Author authorOskar = new Author("Oskar Devloop");

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry potter", "fantasy", authorJK, 2452));
        books.add(new Book("Sagan om ringen", "fantasy", authorMartinG, 235));
        books.add(new Book("Star wars", "sci-fi", authorOskar, 948));

        List<Loan> loans = new ArrayList<>();

        Boolean loggedIn = false;

        while (true) {
            Borrower currentBorrower = loginMeny(borrowers);
            if (currentBorrower != null) {
                loggedIn = true;
            }

            while (loggedIn) {
                System.out.println("1. List all books");
                System.out.println("2. Borrow book");
                System.out.println("3. List loans");
                System.out.println("4. Log out");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        for (Book book : books) {
                            System.out.println(book.getTitle());
                        }
                        break;
                    case 2:
                        System.out.println("ISBN?: ");
                        int isbn = sc.nextInt();
                        sc.nextLine();
                        for (Book book : books) {
                            if (book.getIsbn() == isbn) {
                                Boolean check = checkLoan(loans, book);
                                if (!check) {
                                    loans.add(new Loan("2025/09/18", "2025/10/18", book, currentBorrower));
                                    System.out.println("You have now borrowed that book");
                                }
                            }
                        }
                        break;
                    case 3:
                        for (Loan loan : loans) {
                            System.out.println(loan.getBook().getTitle());
                        }
                        break;
                    case 4:
                        loggedIn = false;
                        currentBorrower = null;
                        break;
                }
            }
        }
    }

    public static Boolean checkLoan(List<Loan> loans, Book book) {
        for (Loan loan : loans) {
            if (book.getIsbn() == loan.getBook().getIsbn()) {
                // om utlånad
                return true;
            }
        }
        // om inte utlånad
        return false;
    }

    public static Borrower loginMeny(List<Borrower> borrowers) {
        System.out.println("Welcome log in");
        System.out.println("Enter your username: ");
        String answerName = sc.nextLine();
        System.out.println("Enter your password: ");
        String answerPassword = sc.nextLine();

        for (int i = 0; i < borrowers.size(); i++) {
            if (borrowers.get(i).getUsername().equals(answerName) && borrowers.get(i).getPassword().equals(answerPassword)) {
                System.out.println("You have successfully logged in");
                return borrowers.get(i);
            }
        }
        return null;
    }
}
