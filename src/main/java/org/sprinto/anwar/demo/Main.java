package org.sprinto.anwar.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Borrower> borrowers = new ArrayList<>();
        borrowers.add(new Borrower("martin", "1234567"));
        borrowers.add(new Borrower("Oskar", "vemvet"));
        borrowers.add(new Borrower("anwar", "hej123"));

        Author authorJK = new Author("JK Rowling");
        Author authorMartinG = new Author("Martin Gruter");
        Author authorOskar = new Author("Oskar Devloop");

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry potter", "fantasy", authorJK));
        books.add(new Book("Sagan om ringen", "fantasy", authorMartinG));
        books.add(new Book("Star wars", "fantasy", authorOskar));

        List<Loan> loans = new ArrayList<>();

        
    }
}