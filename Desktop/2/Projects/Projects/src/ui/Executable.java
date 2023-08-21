package ui;

import java.text.ParseException;
import java.util.Scanner;


import model.Controller;

public class Executable {

	private Scanner reader;
	private Controller controller;

	public Executable() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) throws ParseException {

		Executable exe = new Executable();
		exe.menu();

	}

	// Incomplete
	public void menu() throws ParseException {

		int answer = 1;
		int decision = 1;

		System.out.println("Bienvenido a GreenSQA");

		do{

			System.out.println("1. Crear un nuevo proyecto");
			System.out.println("2. Consultar proyectos segun la fecha");

			int option = reader.nextInt();

			switch (option) {
				case 1:

					RegisterProject();
					break;

				case 2:

					System.out.println("Digite la opcion segun lo que desea consultar");
					System.out.println("1. Consultar proyectos que finalizan despues de una fecha");
					System.out.println("2. Consultar proyectos que inician antes de una fecha");
					decision = reader.nextInt();

					if (decision == 1){

						searchProjectsAfterDate();

					}else{

						searchProjectsBeforeDate();

					}
					break;
			}

			System.out.println("Desea realizar otra operacion?  \n 1. Si \n 2. No");
			answer = reader.nextInt();

		}while(answer == 1);


	}

	//Incomplete
	public void RegisterProject() {

		System.out.println("Ingrese la siguiente informacion para la creacion de un proyecto");

		System.out.println("Nombre del cliente");
		String clientName = reader.nextLine();

		System.out.println("Nombre del proyecto");
		String nameProject = reader.nextLine();


		System.out.println("Tipo de proyecto");
		System.out.println("1. Desarrollo");
		System.out.println("2. Mantenimiento");
		System.out.println("3. Despliegue");
		int typeProject = reader.nextInt();

		System.out.println("Fecha planeada para el inicio del proyecto");
		System.out.println("Digite el dia en numeros");
		int diaI = reader.nextInt();
		System.out.println("Digite el mes en numeros");
		int mesI = reader.nextInt();
		System.out.println("Digite el año en numeros");
		double añoI = reader.nextDouble();

		System.out.println("Fecha planeada para la finalizacion del proyecto");
		System.out.println("Digite el dia en numeros");
		int diaIi = reader.nextInt();
		System.out.println("Digite el mes en numeros");
		int mesIi = reader.nextInt();
		System.out.println("Digite el año en numeros");
		double añoIi = reader.nextDouble();

		System.out.println("Valor correspondiente al presupuesto del proyecto");
		double budget = reader.nextInt();

		if (controller.RegisterProject(nameProject, clientName, diaI, mesI, añoI, diaIi, mesIi, añoIi, budget, typeProject)){

			System.out.println("El entrenamiento se registro correctamente");

		}else{

			System.out.println("El entrenamiento no ha podido ser registrado");
		}

	}

	//Incomplete
	public void searchProjectsAfterDate() throws ParseException {

		System.out.println("Digite la fecha que desea comparar");
		System.out.println("Fecha");
		int dia = reader.nextInt();
		System.out.println("Mes");
		int mes = reader.nextInt();
		System.out.println("AÑo");
		int año = reader.nextInt();

		System.out.println("Los sistemas encontrados antes de esa fecha son:");
		System.out.println(controller.searchProjectsAfterDate(dia, mes, año));


	}
	
	//Incomplete
	public void searchProjectsBeforeDate() throws ParseException {

		System.out.println("Digite la fecha de los proyectos que se terminan antes de la misma");
		System.out.println("Dia");
		int diaA = reader.nextInt();
		System.out.println("Mes");
		int mesS = reader.nextInt();
		System.out.println("Año");
		int añoO = reader.nextInt();

		controller.searchProjectsBeforeDate(diaA, mesS, añoO);

	}
}