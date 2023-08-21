package model;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Controller {

	private KnowledgeUnit[] units;
	private ProjectUnit[] projects; 


	public Controller() {
	
		units = new KnowledgeUnit[25];
		projects = new ProjectUnit[10]; 
	}

	public boolean registerProject(String nombreP, String nombreC, String numeroC, double precio, String nombreCollaborator, String numeroCollaborator, int dia, int mes, int año, int dia2, int mes2, int año2){


		ProjectUnit newProjectunit  = new ProjectUnit(nombreP, nombreC, numeroC, precio, nombreCollaborator, numeroCollaborator, null, null);
	
		for(int i =0; i<units.length;i++){
			
			if(projects[i]==null){
				projects[i] = newProjectunit;
				return true;
			}
		
		}
		
		return false;

	}

	public boolean culminateStageProject(int option, int dia,int  mes,int  año,int  diaa,int mess,int añoss){

		boolean indicator=false;

		Calendar RealInitialDate = new GregorianCalendar(año, mes-1, dia);
		Calendar RealFinallDate = new GregorianCalendar(añoss, mess-1, diaa);
		if(indicator==false){
			int StageActive=projects[option].getActiveStage();
			projects[option].getStages()[StageActive].setInitialDateReal(RealInitialDate);
			projects[option].getStages()[StageActive].setFinishDateReal(RealFinallDate);
			projects[option].getStages()[StageActive].setStatus(StatusSt.INACTIVE);
			projects[option].getStages()[StageActive+1].setStatus(StatusSt.ACTIVE);
			indicator=true;
		}
		return indicator;

	}

	public void stageComplete(option, dia, mes, año, diaa, mess, añoss){


	}
	public boolean registerKnowledgeUnit(String identificacion, String descripcion, String tipo, String leccion) {

		KnowledgeUnit newKnowledgeUnit = new KnowledgeUnit(identificacion, descripcion, descripcion, leccion, leccion);

		for(int i=0; i < units.length; i++){

			if(units[i] == null){

				units[i] = newKnowledgeUnit;
				return true;
			}
		}
		return false;
        

    }

	public void approveKnowledgeUnit(int whichUnit,String approbacion){
		
		units[whichUnit].setStatus(approbacion);

	}

	public String getKnowledgeUnits(){


		String msg = "";

		for(int i = 0; i < units.length; i++ ){

			if(units[i]!=null){
                msg += "\n" + units[i].toString();
            }
		}

		return msg;
	}

	public String showProject() throws ParseException{

		String msg = "";

		for(int i = 0; i < projects.length; i++ ){

			if(projects[i]!=null){
                msg += "\n"+ (i+1) + ". " + projects[i].getProjectInfo();
            }
		}

		return msg;

	}
	
	public String ActiveStage(int opcionProject){

		String msg="";
		
		int StageActive=projects[opcionProject].getActiveStage();
		msg=projects[opcionProject].getStages()[StageActive].toString();
		
		return msg;
	}

}

	
