package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class User {

    private String name;
    private String cC;
    private Calendar date;

    private DateFormat formatter;
    
    public User(String name, String cC, Calendar date){

        this.formatter = new SimpleDateFormat("dd/M/yy");

        this.name = name;
        this.cC = cC;
        this.date = date;
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcC() {
        return cC;
    }

    public void setcC(String cC) {
        this.cC = cC;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    
    public DateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(DateFormat formatter) {
        this.formatter = formatter;
    }

    public abstract int sumaPaginaLibro();

    public abstract int sumaPaginaRevista();
    
    public String toString(){

        String msg = "";

        msg = "\nName User: " +name+ "\nCC: " +cC+ "\nDate: " +date;

        return msg;
    }



    


}
