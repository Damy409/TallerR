package model;

import java.util.Calendar;

public class Magazine extends BibliographicProduct {

    private Categories category;
    private String uRl;
    private double valueM;
    private String numActiveSubs;
    private int numCopiesRead;
    private int unistSubs;

    public Magazine(String id, String name, int numPage, Calendar dateP, Categories category, String uRl, double valueM, String numActiveSubs, int numCopiesRead) {
        super(id, name, numPage, dateP);

        this.category = category;
        this.uRl = uRl;
        this.valueM = valueM;
        this.numActiveSubs = numActiveSubs;
        this.numCopiesRead = numCopiesRead;
        this.unistSubs = 0;

    }

    //Getters and setters

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public String getuRl() {
        return uRl;
    }

    public void setuRl(String uRl) {
        this.uRl = uRl;
    }

    public double getValueM() {
        return valueM;
    }

    public void setValueM(double valueM) {
        this.valueM = valueM;
    }

    public String getNumActiveSubs() {
        return numActiveSubs;
    }

    public void setNumActiveSubs(String numActiveSubs) {
        this.numActiveSubs = numActiveSubs;
    }

    public int getNumCopiesRead() {
        return numCopiesRead;
    }

    public void setNumCopiesRead(int numCopiesRead) {
        this.numCopiesRead = numCopiesRead;
    }

    public int getUnistSubs() {
        return unistSubs;
    }

    public void setUnistSubs(int unistSubs) {
        this.unistSubs = unistSubs;
    }
    
}
