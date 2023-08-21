package ui;

import java.text.ParseException;
import java.util.Scanner;
import model.Controller;

public class Executable{

    private Scanner reader;
    private Controller controller;

    public Executable(){

        reader = new Scanner(System.in);
        controller = new Controller();

    }

    public static void main(String[] args) throws ParseException{

        Executable exe = new Executable();
        exe.menu();
    }

    public void menu() throws ParseException{

        int answer = 1;

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\n                          - WELCOME TO READX BOOKS -\n ");
        System.out.println("------------------------------------------------------------------------------------");

        do{

            System.out.println("\n                      -Type the option you want to make-");

            System.out.println("\n1. Register users, regular and premium.");
            System.out.println("2. Manage bibliographic products.");
            System.out.println("3. Buy a book.");
            System.out.println("4. Subscribe to a magazine.");
            System.out.println("5. Simulate a reading session.");
            System.out.println("6. Library of your bibliographic products.");
            System.out.println("7. Reports. ");
            int option = reader.nextInt();

            switch(option){
                case 1:
                    registerUser();
                    break;
                case 2:

                    System.out.println("\nWhich option do you want to do? ");
                    System.out.println("1. Register a bibliographic product.");
                    System.out.println("2. Modify a bibliographic product.");
                    System.out.println("3. Delete a bibliographic product.");
                    System.out.println("4. Cancel a magazine subscription.");
                    int d = reader.nextInt();

                    switch(d){

                        case 1:
                            registerBibliographicProducts();
                            break;
                        case 2:
                           modifyBibliographicProduct();
                            break;
                        case 3:
                            deleteBibliographicProduct();
                            break;
                        case 4:
                            cancelSubscripMagazine();
                    }

                    break;
                case 3:
                    sellBook();
                    break;
                case 4:
                    magazineSubscription();
                    break;
                case 5:
                    readingSimulation();
                    break;
                case 6:
                    bibliotecaProductosBibliograficos();
                    break;
                case 7:
                    System.out.println("\nWhat type of report do you want to generate?");
                    System.out.println("1. Report for each type of bibliographic product (Book and magazine) the accumulated total number of pages read throughout the platform.");
                    System.out.println("2. Report the most read book genre and magazine category on the platform.");
                    System.out.println("3. Report the Top 5 books and the Top 5 most read magazines on the platform.");
                    System.out.println("4. Report for each genre the number of books sold and the total value of their sales.");
                    System.out.println("5. Inform for each category the number of active subscriptions and their total value for the number of subscriptions.");
                    
                    int d2 = reader.nextInt();

                    switch(d2){

                        case 1:
                            informationNumberOne();
                            break;
                        case 2:
                            informationNumberTwo();
                            break;
                        case 3:
                            informationNumberThree();
                            break;
                        case 4:
                            informationNumberFour();
                            break;
                        case 5:
                            informationNumberFive();
                            break;
                    }
                    break;                  
            }

            System.out.println("\n                  -Would you like to do something else- \n 1. Yes \n 2. No");
            answer = reader.nextInt();

            if(answer==2){
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("\n                            -SEE YOU SOON :)-\n");
                System.out.println("-----------------------------------------------------------------------------");
            }

        }while(answer == 1);
    }

    public void registerUser(){

        System.out.println("\n      -To register a user, enter the following information-");

        System.out.println("\nWhat kind of user do you want to be?  \n1. Premium \n2. Regular");
        int typeUser = reader.nextInt();

        System.out.println("\nType your name");
        reader.nextLine();
        String name = reader.nextLine();

        //limpieza de buffer
      

        System.out.println("\nEnter you CC");
        String cC = reader.nextLine();

        System.out.println("\n       -Write the binding date-");
        System.out.println("Year");
		int year = reader.nextInt();
		System.out.println("Month");
		int month = reader.nextInt();
		System.out.println("Day");
		int day = reader.nextInt();

        String optionD = "";

        if(controller.registerUser(typeUser, name, cC, year, month, day, optionD)){

		
			System.out.println("\nThe user is registered correctly");

		}else{
			
			System.out.println("\nThe user is Could not register");
		}


    }

    public void registerBibliographicProducts(){

        System.out.println("\n      -To register bibliographic products, register the following information-");

        System.out.println("\nWhat do you want to register?");
        System.out.println("\n1. Book");
        System.out.println("2. Magazine");
        int optionB = reader.nextInt();

        if(optionB == 1){

            System.out.println("\nEnter the id, Example: A12F");
            String id = reader.nextLine();
    
            reader.nextLine();
    
            System.out.println("\nType the name");
            String name = reader.nextLine();
    
            System.out.println("\nEnter the number of pages");
            int numPage = reader.nextInt();
    
            System.out.println("\nWrite a short review");
            String review = reader.nextLine();
    
            reader.nextLine();
    
            System.out.println("\nType the publicate date: ");
            System.out.println("Enter the day");
            int dayP = reader.nextInt();
            System.out.println("Enter the month");
            int monthP = reader.nextInt();
            System.out.println("Enter the year");
            int yearP = reader.nextInt();

            System.out.println("\nType the gender");
            System.out.println("1. Fantasy");
            System.out.println("2. Science Fiction");
            System.out.println("3. Historical Novel");
            int category = reader.nextInt();

            System.out.println("\nURL that leads to a repository with the book cover");
            String uRL = reader.nextLine();
            
            reader.nextLine();
        
            System.out.println("\nEnter the sale value (Dollars)");
            double value = reader.nextDouble();
    
            System.out.println("\nEnter the number of copies sold");
            int numCopiesSold = reader.nextInt();
            
            System.out.println("\nEnter the accumulated number of pages read");
            int numCopiesRead = reader.nextInt();

            if(controller.registerBoooks(optionB, id, name, numPage, review, dayP, monthP, yearP, category, uRL, value, numCopiesRead, numCopiesSold )){

                System.out.println("\n                                -The Book is registered correctly-");
                
            
            }else{
    
                System.out.println("\n                                -The Book is Could not register-");
           
            }


        }else{

            System.out.println("\nEnter the id, Example: A12F");
            String id = reader.nextLine();
    
            reader.nextLine();
    
            System.out.println("\nType the name");
            String name = reader.nextLine();
    
            System.out.println("\nEnter the number of pages");
            int numPage = reader.nextInt();
    
            reader.nextLine();
    
            System.out.println("\nType the publicate date: ");
            System.out.println("Enter the day");
            int dayP = reader.nextInt();
            System.out.println("Enter the month");
            int monthP = reader.nextInt();
            System.out.println("Enter the year");
            int yearP = reader.nextInt();

            System.out.println("\nType the category");
            System.out.println("1. Desing");
            System.out.println("2. Scientific");
            System.out.println("3. Varieties");
            int category = reader.nextInt();
    
            System.out.println("\nURL that leads to a repository with the magazine cover");
            String uRL = reader.nextLine();
            
            reader.nextLine();

            System.out.println("\nEnter the subscription value (Dollars)");
            double valueM = reader.nextDouble();
            reader.nextLine();
    
            System.out.println("\nNumber of active subscriptions");
            String numActiveSubs = reader.nextLine();
            
            System.out.println("\nNumber of pages read");
            int numCopiesRead = reader.nextInt();

            if(controller.registerMagazine(optionB, id, name, numPage, dayP, monthP, yearP, category, uRL, valueM, numCopiesRead, numActiveSubs)){

                System.out.println("\n                               -The Magazine is registered correctly-");
            
            }else{
    
                System.out.println("\n                                -The Magazine is Could not register-");
           
            }

        }
    }

    private void deleteBibliographicProduct(){

        String query = controller.getBibliographiProducts();
        String query2 = controller.tipoProductoBibliografico(0);

        if (query.equals("")) {

            System.out.println("\nThere are no registered bibliographic products");

        } else {

            System.out.println(query);

            System.out.println("\nThe existing bibliographic products in the system are these");



            System.out.println("\nWhat bibliographic product do you want to delete?");
            int option = reader.nextInt();

            if (option == 1){

                System.out.println(query2);

                if (controller.deleteBooks(option-1)) {

                    System.out.println("\n                     -Book deleted successfully-");
    
                } else {
    
                    System.out.println("\n                     -Error, the Book could not be deleted-");
                }

            }else{

                System.out.println(query2);

                if (controller.deleteMagazine(option-1)) {

                    System.out.println("\n                     -Magazine successfully deleted-");
    
                } else {
    
                    System.out.println("\n                     -Error, the Magazine could not be deleted-");
                }

            }

            
        }
    }

    public void modifyBibliographicProduct(){

        String query = controller.getBibliographiProducts();
        String query2 = controller.tipoProductoBibliografico(0);

        if (query.equals("")){

            System.out.println("\n                         -There are no registered bibliographic products-");

        }else{

            System.out.println("\nWhat bibliographic product do you want to modify? ");
            System.out.println(query);
            int option = reader.nextInt();
            int option2 = 0;
            int option3 = 0;
            String modificacion = "";
            int modificacion2 = 0;
            double modificacion3 = 0;
            int modificacion4 = 0;

            if(option == 1){

                System.out.println(query2);
                System.out.println("\nType the option you want to change: ");
                System.out.println("\n1. Id, Example: A12F");
                System.out.println("2. Name");
                System.out.println("3. Number of pages");
                System.out.println("4. Short review");
                System.out.println("5. Gender");
                System.out.println("6. URL");
                System.out.println("7. The value (Dollars)");
                System.out.println("8. Number of copies sold");
                System.out.println("9. Accumulated number of pages read");
                option2 = reader.nextInt();

                if (option2==1||option2==2 || option2 ==4 || option2==6){
                    reader.nextLine();
                    System.out.println("\nEnter the new value");
                    modificacion = reader.nextLine();

                }else if(option2==3 ||  option2 ==8 || option2 == 9){

                    System.out.println("\nEnter the new value");
                    modificacion2 = reader.nextInt();
                }else if(option2 == 7){

                    System.out.println("\nEnter the new value");
                    modificacion3 = reader.nextDouble();
                }else{
                    System.out.println("\nEnter the new option");
                    System.out.println("1. Fantasy");
                    System.out.println("2. Science Fiction");
                    System.out.println("3. Historical Novel");
                    modificacion4 = reader.nextInt();
                }

            }else{

                System.out.println(query2);
                System.out.println("\nType the option you want to change: ");
                System.out.println("\n1. Id, Example: A12F");
                System.out.println("2. Name");
                System.out.println("3. Number of pages");
                System.out.println("4. The category");
                System.out.println("5. URL");
                System.out.println("6. The value (Dollars)");
                System.out.println("7. Number of active subscriptions");
                System.out.println("8. Number of pages read");
                option3 = reader.nextInt();

                if (option3==1||option3==2 || option3 ==5){
                    reader.nextLine();
                    System.out.println("\nEnter the new value");
                    modificacion = reader.nextLine();

                }else if(option3==3 || option3 ==7 || option3 == 8){

                    System.out.println("\nEnter the new value");
                    modificacion2 = reader.nextInt();

                }else if (option ==6){

                    System.out.println("\nEnter the new value");
                    modificacion3 = reader.nextDouble();

                }else {

                    System.out.println("\nEnter the new option");
                    System.out.println("1. Desing");
                    System.out.println("2. Scientific");
                    System.out.println("3. Varieties");
                    modificacion4 = reader.nextInt();

                }

            }

            if(controller.modifyBibliographicProduct(option-1, option2, option3, modificacion, modificacion2, modificacion3, modificacion4)){

                System.out.println("\n                        -The Book is modify correctly-");
            
            }else{
    
                System.out.println("\n                        -The Book is Could not modify-");
            
            } 
        }
    }



        
    public void sellBook() {

        String query = controller.getBooksList();
        String query2 = controller.getUserList();

        if ((query.equals("")) || query2.equals("")) {

            System.out.println("\n                   -There are no books or registered registered users-");
        } else {

            System.out.println("\nThis is the list of users registered in the system who can buy books");

            System.out.println(query2);

            System.out.println("\nEnter the user who will buy the book");
            int optionUser = reader.nextInt();

            System.out.println("\nThis is the list of books registered in the system");

            System.out.println(query);

            System.out.println("\nSelect the book to sell");

            int option = reader.nextInt();

            if (controller.sellBook(option-1, optionUser-1)) {

                System.out.println("\n                           -Book sold successfully-");


            } else {

                System.out.println("\n                           -Mistake in the sale-");
            }

        }
    }

    public void magazineSubscription(){

        String query = controller.getMagazineList();
        String query2 = controller.getUserList();

        if((query.equals("")) || query2.equals("")){

            System.out.println("\n                                    -There are no users or journals registered in the system-");

        } else {

            System.out.println("\nThis is the list of users registered in the system who can subscribe to a magazine");

            System.out.println(query2);

            System.out.println("\nType the user who is going to subscribe a magazine");
            int optionUser = reader.nextInt();

            System.out.println("\nThis is the list of journals registered in the system");

            System.out.println(query);

            System.out.println("\nSelect the magazine you want to subscribe to");
            int option = reader.nextInt();

            if (controller.magazineSubscription(option-1, optionUser-1)) {

                System.out.println("\n                                -Subscription successful-");

            } else {

                System.out.println("\n                                -Subscription error-");
            }

        }

    }

    public void cancelSubscripMagazine(){

        String query = controller.getUserList();

        if(query.equals("")){

            System.out.println("\n                                         -There are no users registered in the system registered in the system-");

        } else {

            System.out.println("\nThis is the list of users registered in the system");
            System.out.println(query);

            System.out.println("\nType the option according to your registered user");
            int optionUser = reader.nextInt();
            System.out.println(controller.mostrarRevistasSubscritas(optionUser-1));

            System.out.println("\nEnter the row");
            int fila = reader.nextInt();

            System.out.println("\nEnter the column");
            int columna = reader.nextInt();

            String identificadorProducto = controller.identificadorProducto((optionUser-1), fila, columna);

            if(controller.cancelSubscripMagazine( identificadorProducto)){

                System.out.println("\n                                          -His cancellation to the magazine was successful-");

            }else{

                System.out.println("\n                                      -An error occurred-");
            }
        }
        
    }

    public void readingSimulation(){

        String query = controller.getUserList();
        

        if(query.equals("")){

            System.out.println("\n                                  -There are no registered users-");

        } else {

            System.out.println("\nThis is the list of registered users who can perform a reading simulation");
            System.out.println(query);

            System.out.println("\nEnter your user number");
            int option = reader.nextInt();
            System.out.println(controller.mostrarLibreriaUsuario(option-1)) ;

            System.out.println("\nEnter the row");
            int fila = reader.nextInt();

            System.out.println("\nEnter the column");
            int columna = reader.nextInt();

            String identificadorProducto = controller.identificadorProducto((option-1), fila, columna);
            int cantidadPaginas = controller.paginasProducto(identificadorProducto);
            String nombre = controller.nombreProductoBibliografico(identificadorProducto);
            int contador = 0;

            while(contador<cantidadPaginas){

                System.out.println("\n\n                             -Reading session has started-");
                System.out.println("\n\nReading:  " +nombre);
                System.out.println("\n You are reading page number " +contador+ " of "+cantidadPaginas);
                System.out.println("\n\nType (A) to go to the previous page");
                System.out.println("Type (S) to go to the next page");
                System.out.println("Type (B) to return to the Library");
                if(contador==0){
                    reader.nextLine();
                }
                
                String optionD = reader.nextLine();
                if(optionD.equals("A")){
                    contador++;
                }
                if(optionD.equals("S")){
                    contador--;
                }
                if(optionD.equals("B")){
                    return;

                }
    

            }

            
        }
    }

    public void bibliotecaProductosBibliograficos(){

        String query = controller.getUserList();

        if(query.equals("")){

            System.out.println("\n                          -There are no registered users-");

        }else{

            System.out.println("\nThis is the list of registered users");
            System.out.println(query);
            System.out.println("\nType the number depending on which corresponds to your user");
            int optionU = reader.nextInt();
            System.out.println(controller.showMatrixes(optionU-1));
            System.out.println(controller.mostrarLibreriaUsuario(optionU-1));


        }

    }

    public void informationNumberOne(){

        System.out.println("\nType the option depending on the bibliographic product you want to choose \n1. Book \n2. Magazine");
        int opcion = reader.nextInt();

        if (opcion==1){

            System.out.println("\nTotal number of pages read in the books");
            System.out.println(controller.numPagesBook());

        }else if(opcion==2){

            System.out.println("\nNumber of pages read in total of the magazines");
            System.out.println(controller.numPagesMagazine());

        }

    }

    public void informationNumberTwo(){

        System.out.println(controller.libroRevistaMasLeidas());
    }

    public void informationNumberThree(){


    }

    public void informationNumberFour(){

        System.out.println(controller.librosVendidos());

    }

    public void informationNumberFive(){
        System.out.println(controller.numeroSubsActivasValorTotal());

    }

    

}





























