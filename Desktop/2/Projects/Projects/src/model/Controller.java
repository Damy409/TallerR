package model;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Controller {

	private Project[] projects;

	public Controller() {

		projects = new Project[10];
	
	}

	//Incomplete
	public boolean RegisterProject(String name, String clientName, Calendar initialDate, Calendar finalDate, double budget, int diaI, int mesI, int añoI, int diaIi, int mesIi, int añoIi, int type) {

		TypeProject typeProject = TypeProject.POR_DEFINIR;

		if (type == 1){

			typeProject = TypeProject.DESARROLLO;

		}else if(type == 2) {

			typeProject = TypeProject.MANTENIMIENTO;

		}else{

			typeProject = TypeProject.DESPLIEGUE;

		}

		Calendar fechaInicial = new GregorianCalendar(diaI, mesI, añoI);
		Calendar fechaFinal = new GregorianCalendar(diaIi, mesIi, añoIi);

		Project newProjects = new Project(name, clientName, fechaInicial, fechaFinal, budget, typeProject);
		
		for(int i=0; i < projects.length; i++){

			if(projects[i] == null){

				projects[i] = newProjects;
				return true;
			}
		}

		return false;
	}

	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsAfterDate(int dia, int mes, int año) throws ParseException {

		Calendar fechaBusquedaA = new GregorianCalendar(dia, mes, año);
		String msg = "";

		for(int i = 0; i<projects.length; i++){

			if(projects[i] == null){

				return msg;
			}else{

				int valor = fechaBusquedaA.compareTo(projects[i].getFinalDate());
				if (valor == 1){
					msg += projects[i].getProjectInfo();
				}
			}

		}

		return msg;

	}
	
	//Incomplete

	// Date class also has their own before() and after() method
	public String searchProjectsBeforeDate(int diaA, int mesS, int añoO) throws ParseException {
		
		Calendar fechaBusquedaB = new GregorianCalendar(diaA, mesS, añoO);
		String msg = "";

		for(int i = 0; i<projects.length; i++){

			if(projects[i] == null){

				return msg;
			}else{

				int valor = fechaBusquedaB.compareTo(projects[i].getFinalDate());
				if (valor == 1){
					msg += projects[i].getProjectInfo();
				}
			}

		}

		return msg;

	}

	public boolean RegisterProject(String nameProject, String clientName, int diaI, int mesI, double añoI, int diaIi,
			int mesIi, double añoIi, double budget, int typeProject) {
		return false;
	}


}


