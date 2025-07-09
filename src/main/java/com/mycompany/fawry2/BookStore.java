
package com.mycompany.fawry2;

import java.util.*;

public class BookStore {
   public List<Book> inventory = new ArrayList<>();
   
public Book findBookByIsbn(String isbn){
    for(Book book:inventory){
        if(book.getIsbn().equals(isbn))
            return book;
    }
    return null;
}
public void addPaperBook(int stock, String isbn, String title, int publishYear, double price){
    if(findBookByIsbn(isbn) != null){
        System.out.println("book with isbn "+ isbn + "exists");
    }
    inventory.add(new PaperBook (stock , isbn , title , publishYear , price));
    System.out.println(title + " added");
}
public void addEBook(String fileType, String isbn, String title, int publishYear, double price){
    if(findBookByIsbn(isbn) != null){
        System.out.println("book with isbn "+ isbn + "exists");
    }
    inventory.add(new EBook (fileType , isbn , title , publishYear , price));
    System.out.println(title + " added");
}
public void addDemoBook(String isbn, String title, int publishYear, double price){
    if(findBookByIsbn(isbn) != null){
        System.out.println("book with isbn "+ isbn + "exists");
    }
    inventory.add(new DemoBook (isbn , title , publishYear , price));
    System.out.println(title + " added");
}

public List<Book> removeOutdatedBooks(int currentYear, int BookAge) {
    List<Book> removed = new ArrayList<>();
    Iterator<Book> iterator = inventory.iterator();

    while (iterator.hasNext()) {
        Book book = iterator.next();
        if (currentYear - book.getPublishYear() > BookAge) {
            removed.add(book);
            iterator.remove();
            System.out.println("Quantum book store >> Removed outdated book: " + book.title);
        }
    }

    return removed;
}
public double buyBook(String isbn , int quantity , String email , String address){
    Book book = findBookByIsbn(isbn);
    if (book instanceof PaperBook paperBook){
        boolean success = paperBook.BooksLeft(quantity);
        ShippingService.deliveryType(book , address);
    }
    else if(book instanceof EBook eBook){
        EmailService.deliveryType(eBook, email);
    }
    double total = book.getPrice() * quantity;
    System.out.println("Total paid: " + total);
    return total;
    
}

  
}
