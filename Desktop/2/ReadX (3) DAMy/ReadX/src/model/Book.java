package model;

import java.util.Calendar;

public class Book extends BibliographicProduct {

    private String review;
    private CategoriesB category;
    private String uRL;
    private double value;
    private int numCopiesRead;
    private int numCopiesSold;
    private int unitsSold;

    public Book(String id, String name, int numPage, Calendar dateP, String review, CategoriesB category, String uRL, double value, int numCopiesRead, int numCopiesSold) {
        super(id, name, numPage, dateP);

        this.review = review;
        this.category = category ;
        this.uRL = uRL;
        this.value = value;
        this.numCopiesSold = numCopiesSold;
        this.numCopiesRead = numCopiesRead;
        this.unitsSold = 0;

    }

    //Getters and setters

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public CategoriesB getCategory() {
        return category;
    }

    public void setCategory(CategoriesB category) {
        this.category = category;
    }

    public String getuRL() {
        return uRL;
    }

    public void setuRL(String uRL) {
        this.uRL = uRL;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getNumCopiesRead() {
        return numCopiesRead;
    }

    public void setNumCopiesRead(int numCopiesRead) {
        this.numCopiesRead = numCopiesRead;
    }

    public int getNumCopiesSold() {
        return numCopiesSold;
    }

    public void setNumCopiesSold(int numCopiesSold) {
        this.numCopiesSold = numCopiesSold;
    }
    
	public int getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(int unitsSold) {
		this.unitsSold = unitsSold;
	}

    public int compareTo(Book bookMn) {
        return 0;
    }


    
    
    
}
