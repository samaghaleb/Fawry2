
package com.mycompany.fawry2;

public class EBook extends Book {
    public String fileType;

    public EBook(String fileType, String isbn, String title, int publishYear, double price) {
        super(isbn, title, publishYear, price);
        this.fileType = fileType;
    }
    
    @Override
    public boolean forSale(){
        return true;
    }
    @Override
    public void deliveryType(String email){
        EmailService.deliveryType(this , email);
    }
}
