package model;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class ProjectUnit {
    
    private String nombreP;
    private String nombreC;
    private String numeroC;
    private double precio;
    private String nombreCollaborator;
    private String numeroCollaborator;
    private Calendar fechaInicial;
    private Calendar fechaFinal;

    private DateFormat formatter;

    public ProjectUnit(String nombreP, String nombreC, String numeroC, double precio, String nombreCollaborator, String numeroCollaborator, Calendar fechaInicial, Calendar fechaFinal){
       

        this.formatter = new SimpleDateFormat("dd/M/yy");
        
        this.nombreP = nombreP;
        this.nombreC = nombreC;
        this.numeroC = numeroC;
        this.precio = precio;
        this.nombreCollaborator = nombreCollaborator;
        this.numeroCollaborator = numeroCollaborator;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;

    }

    public String getNombreP(){
        return nombreP;
    }
    
    public String getNombreC(){
        return nombreC;
    }

    public String getNumeroC(){
        return numeroC;
    }

    public Calendar getFechaInicial(){
        return fechaInicial;
    }

    public String getFechaInicialFormated() throws ParseException{
		return formatter.format(this.getFechaInicial().getTime());
	}

    public Calendar getFechaFinal(){
        return fechaFinal;
    }

    public String getFechaFinalFormated() throws ParseException{
		return formatter.format(this.fechaFinal.getTime());
	}		

    public double getPrecio(){
        return precio;
    }

    public String getNombreCollaborator(){
        return nombreCollaborator;
    }

    public String getNumeroCollaborator(){
        return numeroCollaborator;
    }

    public String getProjectInfo() throws ParseException{
		return "\nNombre Projecto: " + nombreP + "\nNombre del CLiente: " + nombreC + "\nFecha Inicial: " + getFechaInicialFormated() + "\nFecha Final: " + getFechaFinalFormated() + "\nPreciot: " + precio+ "\nNombre Colaborator : " +nombreCollaborator+ "\nNumero Colaborator: " +numeroCollaborator;
	}

    public Object[] getStages() {
        return null;
    }

    public int getActiveStage() {
        return 0;
    }


    










    }




