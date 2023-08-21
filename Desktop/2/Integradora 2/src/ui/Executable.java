package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

	private Scanner reader;
	private Controller controller;

	public Executable() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) {

		Executable exe = new Executable();
		exe.menu();

	}

	// Incompleto
	public void menu() {

			System.out.println("¡Welcome to KnowledgeUnit!");

			boolean cond = false;

			while (!cond){

				System.out.println("enter which function you want to use ");

				System.out.println("1. Regitrar un projeco");
				System.out.println("2. culminar etapa de un projecto");
				System.out.println("3. registrar una capsula");
				System.out.println("4. aprovar una capsula");
				System.out.println("5. publica capsula");
				System.out.println("6. Exit");
				int option = reader.nextInt();

				switch (option){

					case 1:
					createProject();
					break;

					case 2:
					stageComplete();
					break;

					case 3:
					registerKnowledgeUnit();;
					break;

					case 4:
					approveKnowledgeUnit();
					break;

					case 5:
					publishCapsule();
					break;

					case 6:
					cond = true;
					break;

				}
			}
	}

	public void createProject(){

		System.out.println("Nombre del projecto");
		String nombreP = reader.nextLine();

		System.out.println("Nombre del cliente");
		String nombreC = reader.nextLine();

		System.out.println("Numero del cliete");
		String numeroC = reader.nextLine();

		System.out.println("Precio del projecto");
		double precio = reader.nextDouble();

		System.out.println("Nombre del colaboradot");
		String nombreCollaborator = reader.nextLine();

		System.out.println("Numero del colaborador");
		String numeroCollaborator = reader.nextLine();

		System.out.println("Fecha planeada del projecto");
		System.out.println("Dia");
		int dia = reader.nextInt();
		System.out.println("Mes");
		int mes = reader.nextInt();
		System.out.println("Año");
		int año = reader.nextInt();

		System.out.println("fecha final del proyecto");
		System.out.println("Dia");
		int dia2 = reader.nextInt();
		System.out.println("Mes");
		int mes2 = reader.nextInt();
		System.out.println("Año");
		int año2 = reader.nextInt();
		
		if (controller.registerProject(nombreP, nombreC, numeroC, precio, nombreCollaborator, numeroCollaborator, dia, mes, año, dia2, mes2, año2)){

			System.out.println("El projecto se creo correctamente");

		}else{

			System.out.println("Ocurrio un error");
		}

	}

	public void stageComplete(){

		
		System.out.println("\n           -Estos son los projectos guardados-");

		String research = controller.showProject();

		if(research.equals("")){

			System.out.println("No hay nada");

		}else{

			System.out.println(research);
		}
		
		System.out.println("\nSeleccione el projecto al que desea culminar etapa");
		int option = reader.nextInt();

		System.out.println("\nEsta es la etapa de su projecto ");
		System.out.println(controller.ActiveStage(option-1));

		System.out.println("\nDigite la fecha inicial real");
		System.out.println("Dia");
		int dia=reader.nextInt();
		System.out.println("Mes");
		int mes =reader.nextInt();
		System.out.println("Año");
		int año=reader.nextInt();

		System.out.println("\nDigite la fecha real final");
		System.out.println("Dia");
		int diaa=reader.nextInt();
		System.out.println("Mes");
		int mess =reader.nextInt();
		System.out.println("Año");
		int añoss=reader.nextInt();


		if(controller.culminateStageProject(option-1, dia, mes, año, diaa, mess, añoss)){

			System.out.println("\nStage completed successfully");

		}else{

			System.out.println("\nAn error occurred");

		}

	}

	public void registerKnowledgeUnit() {

		System.out.println("Ingrese la siguiente Informacion");

		//Limpieza de buffer
		reader.nextLine();

		System.out.println("Identificacion (A0000)");
		String identificacion = reader.nextLine();

		System.out.println(" Corta descripcion");
		String descripcion = reader.nextLine();

		System.out.println("Tipo de capsula (Tecnica-Experiencia-Gestion-Control)");
		String tipo = reader.nextLine();

		System.out.println("Leccion aprendida");
		String leccion = reader.nextLine();

		if (controller.registerKnowledgeUnit(identificacion, descripcion, tipo, leccion)){

			System.out.println("Knowledge unit registered correctly");

		}else{

			System.out.println("Could not register the knowledge unit");
		}
 
	
	}


	public void approveKnowledgeUnit() {

		System.out.println("Estas son las capsulas registradas ");
		String approveUnit = controller.getKnowledgeUnits();

		System.out.println(approveUnit);

		System.out.println("Please,select the unit that you want its status has to be changed");
		int whichUnit = reader.nextInt();

		System.out.println("1.Approve this Unit");
		System.out.println("2. Disapprove Unit");
		int unitStatus = reader.nextInt();

		String approbacion = "";

		if(unitStatus==1){

			approbacion = "Aprovada";

		}else{
					
			approbacion= "No approvada";

		}

		controller.approveKnowledgeUnit(whichUnit-1, approbacion);
	}
	
	public void publishCapsule(){

		System.out.println("Esta es la informacion guardade en el proyecto");

		String research = controller.getKnowledgeUnits();

		if(research.equals("")){

			System.out.println("There is nothing save");

		}else{

			System.out.println(research);
		}

	}

	
	
	

	
	

}