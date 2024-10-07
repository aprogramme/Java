// ------------------LIBRARY------------------

import java.security.cert.CertificateNotYetValidException;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }
    void showAvaibleBooks(){
        System.out.println("Availabe Books are: ");
        for(String book: this.books){
            if(book == null){
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issueBook(String book){
        for(int i = 0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not available!");
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class A46_Exercise4 {
    public static void main(String[] args){
        Library centralLibrary = new Library();
        centralLibrary.addBook(" Think and grow Rich");
        centralLibrary.addBook(" Data Structure");
        centralLibrary.addBook(" Java Fundamentals");
        centralLibrary.showAvaibleBooks();
        centralLibrary.issueBook("Data Structure");
        centralLibrary.returnBook("C++");
        centralLibrary.showAvaibleBooks();
    }
}
