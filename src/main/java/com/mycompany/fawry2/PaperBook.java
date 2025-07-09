
package com.mycompany.fawry2;


public class PaperBook extends Book {
    public int stock;

    public PaperBook(int stock, String isbn, String title, int publishYear, double price) {
        super(isbn, title, publishYear, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
    
    public boolean BooksLeft(int quantity){
        if (stock >= quantity){
            stock -= quantity;
            return true;
        }
        return false;
    }
    @Override
    public boolean forSale(){
        return stock > 0;
    }
    @Override
    public void deliveryType(String address){
        ShippingService.deliveryType(this, address);
    }
}
