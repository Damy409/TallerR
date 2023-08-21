package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class BibliographicProduct {

    private String id;
    private String name;
    private int numPage;
    private Calendar dateP;


    private DateFormat formatter;

    public BibliographicProduct(String id, String name, int numPage, Calendar dateP){

        this.formatter = new SimpleDateFormat("dd/mm/yy");

        this.id = id;
        this.name = name;
        this.numPage = numPage;
        this.dateP = dateP;

    }
    
    //Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setNameB(String name) {
        this.name = name;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public Calendar getDateP() {
        return dateP;
    }

    public void setDateP(Calendar dateP) {
        this.dateP = dateP;
    }

    public DateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(DateFormat formatter) {
        this.formatter = formatter;
    }


    public String toString() {
        return "\nBibliographicProduct" + "\nId: " + id + "\nName: " + name + "\n numPage=" + numPage + "\nPublicated Date: " + dateP;
    }

    public String get(int columna) {
        return null;
    }


    

    
}
