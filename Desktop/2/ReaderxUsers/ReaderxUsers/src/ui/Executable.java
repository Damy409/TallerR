package ui;
//Alexisa
import java.util.Scanner;
import model.Controller;

public class Executable {

	private Scanner reader;
	private Controller rXSystem;

	public Executable() {

		reader = new Scanner(System.in);
		rXSystem = new Controller();
	}

	public static void main(String[] args) {

		Executable ejecutable = new Executable();
		ejecutable.menu();

	}

	private void menu() {

		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("                                      -BIENVENIDO A READX!-");
		System.out.println("--------------------------------------------------------------------------------------------------");

		boolean flag = false;

		while (!flag) {

			System.out.println("\nMENU PRINCIPAL");
			System.out.println("\n1. Registrar usuario");
			System.out.println("2. Modificar usuario");
			System.out.println("3. Borrar usuario");
			System.out.println("4. Consultar informacion de un usuario");
			System.out.println("5. Consultar informacion de todos los usuarios registrados");
			System.out.println("6. Salir");
			int option = reader.nextInt();

			switch (option) {

			case 1:
				registerUser();
				break;
			case 2:
				modifyUser();
				break;
			case 3:
				deleteUser();
				break;
			case 4:
				showUserInfo();
				break;
			case 5:
				showAllUserInfo();
				break;
			case 6:
				flag = true;
				System.out.println("\n--------------------------------------------------------------------------------------------------");
				System.out.println("                                      -VUELVA PRONTO :)-");
				System.out.println("--------------------------------------------------------------------------------------------------");
				break;
			default:
				System.out.println("Opcion invalida");
				break;

			}

		}

	}

	private void registerUser() {

		System.out.println("\n                             -Digite a continuacion la informacion de un nuevo usuario-");

		System.out.println("\nQue tipo de usuario quiere registrar?          \n\n1. Usuario Premium \n2. Usuario Regular");
		int typeUser = reader.nextInt();

		if (typeUser == 1){
			reader.nextLine();
			System.out.println("\nDigite la cedula");
			String id = reader.nextLine();
	
			System.out.println("\nDigite el nombre");
			String name = reader.nextLine();
	
			System.out.println("\nDigite el nickname");
			String nickname = reader.nextLine();

			System.out.println("\nDigite la categoria del usuario premium. \n\n1. Oro \n2. Plata \n3. Diamante");
			int categoryPremium = reader.nextInt();
	
			if (rXSystem.registerUser(typeUser, id, name, nickname, categoryPremium)) {
	
				System.out.println("\n                        -Usuario registrado exitosamente-");
	
			} else {
	
				System.out.println("\n                       -Memoria llena, no se pudo registrar el Usuario-");
			}

		}else{

			System.out.println("\nDigite la cedula");
			String id = reader.nextLine();
	
			// Limpieza de buffer
			reader.nextLine();
	
			System.out.println("\nDigite el nombre");
			String name = reader.nextLine();
	
			System.out.println("\nDigite el nickname");
			String nickname = reader.nextLine();
	
			if (rXSystem.registerUser(typeUser, id, name, nickname, typeUser)) {
	
				System.out.println("\n                     -Usuario registrado exitosamente-");
	
			} else {
	
				System.out.println("\n                     -Memoria llena, no se pudo registrar el Usuario-");
			}


		}

	}

	private void modifyUser() {

		String query = rXSystem.getUserList();

		if (query.equals("")) {

			System.out.println("\n               -No hay usuarios registrados-");

		} else {

			System.out.println("\nEste es el listado de usuarios registrados en el sistema");

			System.out.println(query);

			System.out.println("\nSeleccione el usuario a editar");

			int option = reader.nextInt();

			System.out.println("\nSolo se puede modificar el nombre o la categoria del usuario");

			String cn = rXSystem.getTypeU(option-1);

			int optionN = 0;
			String nameN = "";

			if(cn.equals("Premium")){

				System.out.println("\nEl usuario elegido es premium, ¿Que desea editar?");
				System.out.println("\n1. Nombre");
				System.out.println("2. Categoria");

				int ell = reader.nextInt();

				if(ell == 1){

					System.out.println("\nEscriba el nuevo nombre que va a tomar el usuario");
					reader.nextLine();
					nameN = reader.nextLine();

				}else if(ell == 2){

					System.out.println("\nCual es la nueva categoria por la que desea remplazar");
					System.out.println("\n1. Oro");
					System.out.println("2. Plata");
					System.out.println("3. Diamante");

					optionN = reader.nextInt();
				}

				
			}else if(cn.equals("Regular")){

				System.out.println("\nEl usuario es regular, solo le puedes cambiar el nombre");
				System.out.println("\nPor cual nombre desea remplazarlo");
				reader.nextLine();
				nameN = reader.nextLine();
			}


			if (rXSystem.editUser(option - 1, optionN, nameN)) {

				System.out.println("\n                          -Usuario editado exitosamente-");

			} else {

				System.out.println("\n                          -Error, el usuario no pudo ser editado-");
			}

		}

	}

	private void deleteUser() {

		String query = rXSystem.getUserList();

		if (query.equals("")) {

			System.out.println("\nNo hay usuarios registrados");
		} else {

			System.out.println("\nEste es el listado de usuarios registrados en el sistema");

			System.out.println(query);

			System.out.println("\nSeleccione el usuario a borrar");

			int option = reader.nextInt();

			if (rXSystem.deleteUser(option-1)) {

				System.out.println("\n                     -Usuario borrado exitosamente-");

			} else {

				System.out.println("\n                     -Error, el usuario no pudo ser borrado-");
			}

		}

	}

	private void showUserInfo() {

		String query = rXSystem.getUserList();

		if (query.equals("")) {

			System.out.println("\nNo hay usuarios registrados");

		} else {

			System.out.println("\nEste es el listado de usuarios registrados en el sistema");

			System.out.println(query);

			System.out.println("\nSeleccione el usuario a consultar");

			int option = reader.nextInt();

			String query2 = rXSystem.getUserInfo(option-1);

			if (query2.equals("")) {

				System.out.println("\n                  -La operación no pudo realizarse-");

			} else {

				System.out.println(query2);
			}

		}

	}

	private void showAllUserInfo() {

		System.out.println("\n                                -Esta es la informacion registrada en el sistema-");

		String query = rXSystem.getAllUserInfo();

		if (query.equals("")) {

			System.out.println("\nNo hay usuarios registrados");
		} else {
			System.out.println(query);
		}

	}

}