package model;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class Transaction {

    private Calendar date;

	private DateFormat formatter;

	public Transaction(Calendar date, double purchaseValue) {

        this.formatter=new SimpleDateFormat("dd/MM/yyyy");
		this.date = date;

	}

	//Getters and setters
	
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
    
}
