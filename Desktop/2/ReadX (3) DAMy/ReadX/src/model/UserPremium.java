package model;

import java.util.ArrayList;
import java.util.Calendar;

public class UserPremium extends User {

    private ArrayList<Book> book;
    private ArrayList<Magazine> magazine;
    private ArrayList<BibliographicProduct> products;

    public UserPremium(String name, String cC, Calendar date) {
        super(name, cC, date);

        this.book = new ArrayList<Book>();
        this.magazine = new ArrayList<Magazine>();
        this.products = new ArrayList<BibliographicProduct>();

    }

    //Getters and setters
    
    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    public ArrayList<Magazine> getMagazine() {
        return magazine;
    }

    public void setMagazine(ArrayList<Magazine> magazine) {
        this.magazine = magazine;
    }

    public ArrayList<BibliographicProduct> getProducts() {
        return products;
    }


    public void setProducts(ArrayList<BibliographicProduct> products) {
        this.products = products;
    }


    @Override
    public int sumaPaginaLibro(){

        int contador = 0;

        for (int i = 0; i < book.size(); i++) {

            if(book.get(i) instanceof Book){

                contador += book.get(i).getNumPage();
            }
            
        }

        return contador;
    }

    @Override
    public int sumaPaginaRevista() {

        int contador = 0;

        for(int i=0; i<magazine.size();i++){

            if(magazine.get(i) instanceof Magazine){

                contador += book.get(i).getNumPage();
            }

        }

        return contador;
        
    }

   
    
    
}
