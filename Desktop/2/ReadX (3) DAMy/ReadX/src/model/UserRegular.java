package model;

import java.util.Calendar;

public class UserRegular extends User {

    private Book[] book;
    private Magazine[] magazine;
    private String[][] productos;

    public UserRegular(String name, String cC, Calendar date) {
        super(name, cC, date);

        book = new Book[5];
        magazine = new Magazine[2];
        productos = new String[5][5];

    }

    //Getters and setters

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }

    public Magazine[] getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine[] magazine) {
        this.magazine = magazine;
    }

    public String[][] getProductos() {
        return productos;
    }

    public void setProductos(String[][] productos) {
        this.productos = productos;
    }

    public int sumaPaginaLibro(){

        int contador=0;

        for (int i = 0; i < book.length; i++) {
            if(book[i] instanceof Book){
                contador += book[i].getNumPage();
            }
            
        }

        return contador;
    }

    @Override
    public int sumaPaginaRevista() {
   
        int contador = 0;

        for(int i=0; i<magazine.length;i++){
            if(magazine[i] instanceof Magazine){
                contador += magazine[i].getNumPage();
            }
        }

        return contador;
    }

    
}
