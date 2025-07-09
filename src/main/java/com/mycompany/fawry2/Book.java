
package com.mycompany.fawry2;

public abstract class Book {
    public String isbn;
    public String title;
    public int publishYear;
    public double price;

    public Book(String isbn, String title, int publishYear, double price) {
        this.isbn = isbn;
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract boolean forSale();
    public abstract void deliveryType(String contact);
    
}
