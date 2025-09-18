package org.sprinto.anwar.demo;

public class Loan {
    private String loanDate;
    private String dueDate;
    private Book book;
    private Borrower borrower;

    public Loan(String loanDate, String dueDate, Book book, Borrower borrower) {
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.book = book;
        this.borrower = borrower;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}
