
package com.mycompany.fawry2;

public class ShippingService {
    public static void deliveryType(PaperBook book , String address){
        System.out.println("Ship " + book.title + " to "+ address);
    }

    static void deliveryType(Book book, String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
