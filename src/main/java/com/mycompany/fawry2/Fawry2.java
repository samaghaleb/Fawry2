/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fawry2;


public class Fawry2 {

    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.addPaperBook(5 ,"001" ,"Java Book" ,2010 , 200);
        store.addEBook("pdf", "002", "ai book", 2014, 200);
        store.addDemoBook("003", "body language book", 2010, 155);
        double paid = store.buyBook("005", 5, "", "egypt");
        System.out.println("total paid= "+paid);
        paid = store.buyBook("009", 10, "sama@email.com", "");
        System.out.println("total paid= "+paid);
        var removed = store.removeOutdatedBooks(2025, 15);
        for (Book b : removed){
            System.out.println("removed "+ b.title);
        }
    }
}
