
package com.mycompany.fawry2;

public class DemoBook extends Book {

    public DemoBook(String isbn, String title, int publishYear, double price) {
        super(isbn, title, publishYear, price);
    }
    
    @Override
    public boolean forSale(){
        return false;
    }
    @Override
    public void deliveryType(String ignored){
        System.out.println("no delivery");
    }
}
