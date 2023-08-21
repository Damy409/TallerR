package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Controller {

    private ArrayList<User> user;
    private ArrayList<Transaction> transactions;
    private ArrayList<BibliographicProduct> books;
    private ArrayList<int[][]> matrixes;

    public Controller() {

        matrixes = new ArrayList<int[][]>();
        this.books = new ArrayList<BibliographicProduct>();
        this.user = new ArrayList<User>();
        this.transactions = new ArrayList<Transaction>();

    }


    /**
     * Description: this method is for Returns a list of registered bibliographic
     * products
     * 
     * @return msg Returns a list of registered bibliographic products
     */
    public String getBibliographiProducts() {

        String msg = "";

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i) != null) {

                msg += "\n" + (i + 1) + ". " + books.get(i).getId() + " - " + books.get(i).getName();
            }
        }

        return msg;

    }

    /**
     * Description: This method is used to register users in the program, whether
     * they are premium or regular.
     * 
     * @param typeUser Variable to determine the type of user premium or regular
     * @param name     Variable to determine the name of user
     * @param cC       Variable to determine the CC of user
     * @param year     Variable to determine the record date
     * @param month    Variable to determine the record date
     * @param day      Variable to determine the record date
     * @param optionD
     * @return indicador A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean registerUser(int typeUser, String name, String cC, int year, int month, int day, String optionD) {

        boolean indicator = false;

        Calendar date = Calendar.getInstance();

        if (indicator == false) {

            switch (typeUser) {

                case 1:
                    user.add(new UserRegular(name, cC, date));
                    indicator = true;
                    return indicator;
                case 2:
                    user.add(new UserPremium(name, cC, date));
                    indicator = true;
                    return indicator;
            }

        }

        return false;
    }

    /**
     * Description: This method is used to register books
     * 
     * @param optionB       Variable that defines the type of bibliographic product
     * @param id            Variable to determine the id of Book
     * @param name          Variable to determine the name ok book
     * @param numPage       Variable to determine the number pages of book
     * @param review        Variable to determine a reviw
     * @param dayP          Variable to determine the record date
     * @param monthP        Variable to determine the record date
     * @param yearP         Variable to determine the record date
     * @param category      Variable to determine category book
     * @param uRL           Variable to determine the URL of book
     * @param value         Variable to determine the price
     * @param numCopiesRead Variable to determine the number that copies read
     * @param numCopiesSold Variable to determine the number that copies read
     * @return indicator A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean registerBoooks(int optionB, String id, String name, int numPage, String review, int dayP, int monthP,
            int yearP, int category, String uRL, double value, int numCopiesRead, int numCopiesSold) {

        boolean indicator = false;
        CategoriesB categories = CategoriesB.POR_DEFINIR;

        if (category == 1) {

            categories = CategoriesB.FANTASY;

        } else if (category == 2) {

            categories = CategoriesB.SCIENCE_FICTION;

        } else {

            categories = CategoriesB.HISTORICAL_NOVEL;

        }

        if (indicator == false) {

            books.add(new Book(id, name, numPage, null, review, categories, uRL, value, numCopiesRead, numCopiesSold));
            indicator = true;
            return indicator;
        }

        return false;

    }

    /**
     * Description: This method is used to register Magazine
     * 
     * @param optionB       Variable that defines the type of bibliographic product
     * @param id            Variable to determine the id of Magazine
     * @param name          Variable to determine the name of Magazine
     * @param numPage       Variable to determine the number pages of Magazine
     * @param dayP          Variable to determine the record date
     * @param monthP        Variable to determine the record date
     * @param yearP         Variable to determine the record date
     * @param category      Variable to determine category Magazine
     * @param uRL           Variable to determine URl Magazine
     * @param valueM        Variable to determine the price
     * @param numCopiesRead Variable to determine the number that copies read
     * @param numActiveSubs Variable to determine the number that active
     *                      subscriptions
     * @return indicator A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean registerMagazine(int optionB, String id, String name, int numPage, int dayP, int monthP, int yearP,
            int category, String uRL, double valueM, int numCopiesRead, String numActiveSubs) {

        boolean indicator = false;
        Categories categoryy;

        if (category == 1) {

            categoryy = Categories.DESING;

        } else if (category == 2) {

            categoryy = Categories.SCIENTIFIC;

        } else {

            categoryy = Categories.VARIETIES;

        }

        if (indicator == false) {

            books.add(new Magazine(id, name, numPage, null, categoryy, uRL, valueM, numActiveSubs, numCopiesRead));
            indicator = true;
            return indicator;

        }

        return false;

    }

    /**
     * Description: Method used to delete books that have been registered
     * 
     * @param option Variable that determines the book that the user wants to delete
     * @return indicator A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean deleteBooks(int option) {

        boolean indicator = false;

        if (indicator == false) {

            books.remove(books.get(option));
            indicator = true;
            return indicator;
        }

        return false;

    }

    /**
     * Description: Method used to delete Magazine that have been registered
     * 
     * @param option Variable that determines the Magazine that the user wants to
     *               delete
     * @return indicator A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean deleteMagazine(int option) {

        boolean indicator = false;

        if (indicator == false) {

            books.remove(books.get(option));
            indicator = true;
            return indicator;
        }

        return false;

    }

    /**
     * Description: Method used to cancel a magazine subscription
     * 
     * @param identificadorProducto Variable that determines the product according
     *                              to the matrix in which it is located
     * @return indicador A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean cancelSubscripMagazine(String identificadorProducto) {
        boolean indicador = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(identificadorProducto)) {
                books.remove(i);
                indicador = true;
                break;
            }
        }

        return indicador;
    }

    /**
     * Description: Method used to modify a bibliographic product
     * 
     * @param option        Variable that determines the bibliographic product to
     *                      modify
     * @param option2       Variable that determines the item to modify of the books
     * @param option3       Variable that determines the item to modify of the
     *                      Magazines
     * @param mmodificacion Set variables to modify items
     * @param modificacion2 Set variables to modify items
     * @param modificacion3 Set variables to modify items
     * @param modificacion4 Set variables to modify items
     * @return indicador A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean modifyBibliographicProduct(int option, int option2, int option3, String mmodificacion,
            int modificacion2, double modificacion3, int modificacion4) {

        boolean indicador = false;

        if (indicador == false) {

            if (books.get(option) instanceof Book) {

                if (option2 == 1) {
                    ((Book) books.get(option)).setId(mmodificacion);
                    return true;
                }
                if (option2 == 2) {
                    ((Book) books.get(option)).setNameB(mmodificacion);
                    return true;
                }
                if (option2 == 3) {
                    ((Book) books.get(option)).setNumPage(modificacion2);
                    return true;
                }
                if (option2 == 4) {
                    ((Book) books.get(option)).setReview(mmodificacion);
                    return true;
                }
                if (option2 == 5) {

                }
                if (option2 == 6) {
                    ((Book) books.get(option)).setuRL(mmodificacion);
                    return true;
                }
                if (option2 == 7) {
                    ((Book) books.get(option)).setValue(modificacion3);
                    return true;
                }
                if (option2 == 8) {
                    ((Book) books.get(option)).setNumCopiesSold(modificacion2);
                    return true;
                }
                if (option2 == 9) {
                    ((Book) books.get(option)).setNumCopiesRead(modificacion2);
                    return true;
                }

            } else if (books.get(option) instanceof Magazine) {

                if (option3 == 1) {
                    ((Magazine) books.get(option)).setId(mmodificacion);
                    return true;
                }
                if (option3 == 2) {
                    ((Magazine) books.get(option)).setNameB(mmodificacion);
                    return true;
                }
                if (option3 == 3) {
                    ((Magazine) books.get(option)).setNumPage(modificacion2);
                    return true;
                }
                if (option3 == 4) {

                }
                if (option3 == 5) {
                    ((Magazine) books.get(option)).setuRl(mmodificacion);
                    return true;
                }
                if (option3 == 6) {
                    ((Magazine) books.get(option)).setValueM(modificacion3);
                    return true;
                }
                if (option3 == 7) {
                    ((Magazine) books.get(option)).setNumActiveSubs(mmodificacion);
                    return true;
                }
                if (option3 == 8) {
                    ((Magazine) books.get(option)).setNumCopiesRead(modificacion2);
                    return true;
                }
            }

        }

        return false;
    }

    /**
     * Description: Method used to determine the type of bibliographic product (book
     * or magazine)
     * 
     * @param option Variable that determines the bibliographic product entered by
     *               the user
     * @return msg Returns the type of bibliographic product, that is, if it is a
     *         book or a magazine
     */
    public String tipoProductoBibliografico(int option) {

        String msg = "";

        if (books.get(option) instanceof Book) {

            msg = "                                 -El producto bibliografico es un libro-";

        } else if (books.get(option) instanceof Magazine) {

            msg = "                                 -El producto bibliografico es una Revista-";
        }

        return msg;
    }

    /**
     * Description: Method used to determine the type of User (regular or premium)
     * 
     * @param option Variable that determines the user entered by the user
     * @return msg Returns the type of User, that is, if it is a User regular or a
     *         User premium
     */
    public String tipoUsuario(int option) {

        String msg = "";

        if (user.get(option) instanceof UserPremium) {

            msg = "                                 -U-";

        } else if (user.get(option) instanceof UserRegular) {

            msg = "                                 -El Usuario registrado es de tipo regular>";
        }

        return msg;
    }

    /**
     * Description: Method used to delete books according to the ones the user has
     * purchased
     * 
     * @param optionBook Variable that determines the book
     * @param optionUser Variable that determines the type of user
     * @return indicador A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean sellBook(int optionBook, int optionUser) {

        boolean indicador = false;
        Calendar date = Calendar.getInstance();
        double price = ((Book) books.get(optionBook)).getValue();

        if (indicador == false) {

            if (user.get(optionUser) instanceof UserRegular) {
                if (books.get(optionBook) instanceof Book) {
                    for (int i = 0; i < 4; i++) {
                        if (((UserRegular) user.get(optionUser)).getBook()[i] == null) {
                            ((UserRegular) user.get(optionUser)).getBook()[i] = ((Book) books.get(optionBook));
                            ingresarProductoMatrix(optionUser, ((Book) books.get(optionBook)).getId());
                            return true;
                        }
                    }

                }

                transactions.add(new Transaction(date, price));
                ((Book) books.get(optionBook)).setUnitsSold(+1);
                indicador = true;

            } else if (user.get(optionUser) instanceof UserPremium) {
                if (books.get(optionUser) instanceof Book) {
                    if (((UserPremium) user.get(optionUser)).getBook() == null) {

                        ((UserPremium) user.get(optionUser)).getBook().add(((Book) books.get(optionBook)));
                        ingresarProductoMatrix(optionUser, ((Book) books.get(optionBook)).getId());
                        return true;
                    }

                }
                transactions.add(new Transaction(date, price));
                ((Book) books.get(optionBook)).setUnitsSold(optionBook + 1);
                indicador = true;
            }

        }

        return indicador;
    }

    /**
     * Description: Method used so that a user can subscribe to a magazine
     * 
     * @param option     Variable that determines the magazine
     * @param optionUser Variable that determines the type of user
     * @return indicador A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean magazineSubscription(int option, int optionUser) {

        boolean indicador = false;
        Calendar date = Calendar.getInstance();
        double price = ((Magazine) books.get(option)).getValueM();

        if (indicador == false) {

            if (user.get(optionUser) instanceof UserRegular) {
                if (books.get(option) instanceof Magazine) {
                    for (int i = 0; i < 4; i++) {
                        if (((UserRegular) user.get(optionUser)).getMagazine()[i] == null) {
                            ((UserRegular) user.get(optionUser)).getMagazine()[i] = ((Magazine) books.get(option));
                            ingresarProductoMatrix(optionUser, ((Magazine) books.get(option)).getId());
                            return true;
                        }
                    }

                }

                transactions.add(new Transaction(date, price));
                ((Magazine) books.get(option)).setUnistSubs(+1);
                indicador = true;

            } else if (user.get(optionUser) instanceof UserPremium) {
                transactions.add(new Transaction(date, price));
                ((Magazine) books.get(option)).setUnistSubs(option + 1);
                indicador = true;
            }
        }

        return indicador;
    }

    /**
     * Description: Method that displays a list of registered users
     * 
     * @return msg
     */
    public String getUserList() {
        String msg = "";

        for (int i = 0; i < user.size(); i++) {
            if (user.get(i) != null) {
                msg += "\n" + (i + 1) + ". " + (user.get(i)).getName() + " - " + (user.get(i)).getcC();
            }
        }
        return msg;
    }

    /**
     * Description: Method that displays a list of magazines registered
     * 
     * @return msg
     */
    public String getMagazineList() {
        String msg = "";

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof Magazine) {
                msg += "\n" + (i + 1) + ". " + ((Magazine) books.get(i)).getId() + " - "
                        + ((Magazine) books.get(i)).getName();
            }
        }

        return msg;
    }

    /**
     * Description: Method that displays a list of books registered
     * 
     * @return msg
     */
    public String getBooksList() {

        String msg = "";

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i) instanceof Book) {

                msg += "\n" + (i + 1) + ". " + ((Book) books.get(i)).getId() + " - " + ((Book) books.get(i)).getName();

            }
        }

        return msg;
    }

    /**
     * Description: This method is used to be able to organize the books depending
     * on the dates in the arrangement
     * 
     * @param optionUser Variable that determines the type of user
     * @return indicador A variable declared as boolean to know if the method works
     *         correctly
     */
    public boolean acomodarArregloUsuario(int optionUser) {
        boolean indicador = false;
        if (user.get(optionUser) instanceof UserRegular) {
            for (int i = 0; i < ((UserRegular) user.get(optionUser)).getBook().length; i++) {
                if (i != 0) {
                    if (((UserRegular) user.get(optionUser)).getBook()[i] != null) {
                        if (((UserRegular) user.get(optionUser)).getBook()[i].getDateP()
                                .compareTo(((UserRegular) user.get(optionUser)).getBook()[(i - 1)].getDateP()) == -1) {
                            Book libroMenor = ((UserRegular) user.get(optionUser)).getBook()[i];
                            Book libroMayor = ((UserRegular) user.get(optionUser)).getBook()[(i - 1)];
                            ((UserRegular) user.get(optionUser)).getBook()[(i - 1)] = libroMenor;
                            ((UserRegular) user.get(optionUser)).getBook()[i] = libroMayor;
                            indicador = true;
                        }
                    }
                } else {
                    indicador = false;
                }

            }

        }

        return indicador;
    }

    /**
     * Description: This method is used to create a 5x5 matrix
     * 
     * @return msg
     */
    public String createMatrix() {

        String msg = "";
        int[][] matrixess = new int[5][5];
        matrixes.add(matrixess);
        msg += printMatrix(matrixess);

        return msg;
    }

    /**
     * Description: This method is used to identify a product in the matrix
     * 
     * @param optionUser Variable determined by the user
     * @param fila       Variable that determines the row of the matrix
     * @param columna    Variable that determines the column of the matrix
     * @return msg
     */
    public String identificadorProducto(int optionUser, int fila, int columna) {
        String msg = "";

        if (user.get(optionUser) instanceof UserRegular) {
            msg = ((UserRegular) user.get(optionUser)).getProductos()[fila][columna];
        } else if (user.get(optionUser) instanceof UserPremium) {
            msg = ((UserPremium) user.get(optionUser)).getProducts().get(fila).get(columna);

        }

        return msg;

    }

    /**
     * Description: This method is used to know the number of pages that a
     * bibliographic product has
     * 
     * @param identificadorProducto Variable that gives us the identification of a
     *                              product in a matrix
     * @return msg
     */
    public int paginasProducto(String identificadorProducto) {
        int msg = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(identificadorProducto)) {
                msg = books.get(i).getNumPage();
            }
        }
        return msg;

    }

    /**
     * Description: Method used to find the name of a bibliographic product
     * 
     * @param identificadorProducto Variable that gives us the identification of a
     *                              product in a matrix
     * @return msg
     */
    public String nombreProductoBibliografico(String identificadorProducto) {
        String msg = "";

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(identificadorProducto)) {
                msg = books.get(i).getName();
            }
        }

        return msg;
    }

    /**
     * Description: Method that displays the name of a user so that it can be
     * printed in the library
     * 
     * @param optionU Variable determined by the user
     * @return msg
     */
    public String showMatrixes(int optionU) {

        String msg = "";
        if (user.get(optionU) instanceof UserPremium) {

            msg += "\nBiblioteca de " + ((UserPremium) user.get(optionU)).getName() + "\n";

        } else if (user.get(optionU) instanceof UserRegular) {

            msg += "\nBiblioteca de \n" + ((UserRegular) user.get(optionU)).getName() + "\n";

        }

        return msg;
    }

    /**
     * Description Method that prints the matrix
     * 
     * @param numMatrix variable that determines the name of the matrix
     * @return print
     */
    private String printMatrix(int[][] numMatrix) {
        String print = "";
        for (int i = 0; i < numMatrix.length; i++) { // filas
            for (int j = 0; j < numMatrix[0].length; j++) { // columnas
                print += numMatrix[i][j] + " ";
            }
            print += "\n";
        }

        return print;
    }

    /**
     * Description This method is used to display the user library.
     * 
     * @param optionUser Variable determined by the user
     * @return msg
     */
    public String mostrarLibreriaUsuario(int optionUser) {

        String msg = "";

        if (user.get(optionUser) instanceof UserRegular) {

            for (int i = 0; i < ((UserRegular) user.get(optionUser)).getProductos().length; i++) {
                for (int j = 0; j < ((UserRegular) user.get(optionUser)).getProductos()[0].length; j++) {
                    if (user.get(optionUser) instanceof UserRegular) {
                        msg += "" + ((UserRegular) user.get(optionUser)).getProductos()[i][j] + " ";

                    }

                }
                msg += "\n";
            }

        } else if (user.get(optionUser) instanceof UserPremium) {

            for (int i = 0; i < ((UserPremium) user.get(optionUser)).getProducts().size(); i++) {
                for (int j = 0; j < ((UserPremium) user.get(optionUser)).getProducts().size(); j++) {
                    if (user.get(optionUser) instanceof UserPremium) {
                        msg += "" + ((UserPremium) user.get(optionUser)).getProducts() + "";
                    }
                }
                msg += "\n";
            }
        }

        return msg;

    }

    /**
     * Description: Method used to show the subscribed magazines according to the
     * type of user
     * 
     * @param optionUser Variable determined by the user
     * @return msg
     */
    public String mostrarRevistasSubscritas(int optionUser) {
        String msg = "";

        for (int i = 0; i < ((UserRegular) user.get(optionUser)).getProductos().length; i++) {
            for (int j = 0; j < ((UserRegular) user.get(optionUser)).getProductos()[0].length; j++) {
                if (user.get(optionUser) instanceof UserRegular) {
                    msg += "" + ((UserRegular) user.get(optionUser)).getProductos()[i][j] + " ";
                }

            }
            msg += "\n";
        }

        return msg;

    }

    /**
     * Decription: Method used to enter a product to the matrix
     * 
     * @param optionUser    Variable determined by the user
     * @param identificador Variable that determines the identifier
     * @return true
     */
    public boolean ingresarProductoMatrix(int optionUser, String identificador) {

        String adicion;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (user.get(optionUser) instanceof UserRegular) {
                    if (((UserRegular) user.get(optionUser)).getProductos()[i][j] == null) {
                        ((UserRegular) user.get(optionUser)).getProductos()[i][j] = identificador;
                        return true;
                    }
                } else if (user.get(optionUser) instanceof UserPremium) {

                    if (((UserPremium) user.get(optionUser)).getProducts().get(i).get(j) == null) {

                        adicion = ((UserPremium) user.get(optionUser)).getProducts().get(i).get(j);
                        adicion = identificador;
                        return true;
                    }

                }

            }
        }

        return false;

    }

    /**
     * Description: Method used to count the pages read in total of the books
     * 
     * @return contador
     */

    public int numPagesBook() {
        int contador = 0;

        for (int i = 0; i < user.size(); i++) {
            contador += user.get(i).sumaPaginaLibro();
        }

        return contador;
    }

    /**
     * Description: Method used to count the pages read in total of the magazines
     * 
     * @return contador
     */
    public int numPagesMagazine() {

        int contador = 0;

        for (int i = 0; i < user.size(); i++) {
            contador += user.get(i).sumaPaginaRevista();
        }

        return contador;
    }

    public String libroRevistaMasLeidas(){
        String msg = "";
        
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador11 = 0;
        int contador22 = 0;
        int contador33 = 0;
        int contadorMax = 0;
        int contadorMax1 = 0;
        CategoriesB catLibros = CategoriesB.FANTASY;
        Categories catRevistas = Categories.DESING;


        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof Book) {

                CategoriesB categoriatemp = ((Book)(books.get(i))).getCategory();

                if (categoriatemp == CategoriesB.FANTASY) {
                    contador1 = contador1 + ((Book)(books.get(i))).getNumCopiesRead();

                }
                if (categoriatemp == CategoriesB.HISTORICAL_NOVEL) {
                    contador2 = contador2 + ((Book)(books.get(i))).getNumCopiesRead();

                }
                if (categoriatemp == CategoriesB.SCIENCE_FICTION) {
                    contador3 = contador3 + ((Book)(books.get(i))).getNumCopiesRead();

                }

            }
            if(books.get(i) instanceof Magazine){

                Categories categoriestemp = ((Magazine)(books.get(i))).getCategory();

                if (categoriestemp == Categories.DESING) {
                    contador11 = contador11 + ((Magazine)(books.get(i))).getNumCopiesRead();

                }
                if (categoriestemp == Categories.SCIENTIFIC) {
                    contador22 = contador22 + ((Magazine)(books.get(i))).getNumCopiesRead();

                }
                if (categoriestemp == Categories.VARIETIES) {
                    contador33 = contador33 + ((Magazine)(books.get(i))).getNumCopiesRead();

                }



            }

        }

    
        if((contador1>contador2)&&(contador1>contador3)){
            contadorMax = contador1;
            catLibros = CategoriesB.FANTASY;
        }
        if((contador2>contador1)&&(contador2>contador3)){
            contadorMax = contador2;
            catLibros = CategoriesB.HISTORICAL_NOVEL;
        }
        if((contador3>contador1)&&(contador3>contador2)){
            contadorMax = contador3;
            catLibros = CategoriesB.SCIENCE_FICTION;
        }

        if((contador11>contador22&&contador11>contador33)){
            contadorMax1 = contador11;
            catRevistas = Categories.DESING;
        }
        if((contador22>contador11)&&(contador22>contador33)){
            contadorMax1 = contador22;
            catRevistas = Categories.SCIENTIFIC;
        }
        if((contador33>contador11)&&(contador33>contador22)){
            contadorMax1 = contador33;
            catRevistas = Categories.VARIETIES;
        }

        msg += "\nIn the books The category more read is "+catLibros+" with a max of pages " + contadorMax;
        msg += "\nThe magazine The category more read is "+catRevistas+" with a max of pages " + contadorMax1;


        return msg;
    }

    public String librosVendidos() {

        String msg = "";
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        double value = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof Book) {

                CategoriesB categoriatemp = ((Book) (books.get(i))).getCategory();

                if (categoriatemp == CategoriesB.FANTASY) {
                    contador1++;
                    value += ((Book) books.get(i)).getValue() * ((Book) books.get(i)).getUnitsSold();
                }
                if (categoriatemp == CategoriesB.HISTORICAL_NOVEL) {
                    contador2++;
                    value += ((Book) books.get(i)).getValue() * ((Book) books.get(i)).getUnitsSold();
                }
                if (categoriatemp == CategoriesB.SCIENCE_FICTION) {
                    contador3++;
                    value += ((Book) books.get(i)).getValue() * ((Book) books.get(i)).getUnitsSold();
                }

            }

        }
        msg += "\nThe number of books sold in the: ";
        msg += "\nFantasy " + contador1 ;
        msg += "\nHistorical Novel " + contador2 ;
        msg += "\nScience Fiction " + contador3 ;

        msg += "\n\nThe value total : ";
        msg += "\nFantasy " + value;
        msg += "\nHistorical Novel " + value;
        msg += "\nScience Fiction " + value;


        return msg;
    }

    public String numeroSubsActivasValorTotal(){

        String msg = "";

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        double value = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof Magazine) {

                Categories categoriatemp = ((Magazine) (books.get(i))).getCategory();

                if (categoriatemp == Categories.DESING) {
                    contador1++;
                    value += ((Magazine) books.get(i)).getValueM() * ((Magazine) books.get(i)).getUnistSubs();
                }
                if (categoriatemp == Categories.SCIENTIFIC) {
                    contador2++;
                    value += ((Magazine) books.get(i)).getValueM() * ((Magazine) books.get(i)).getUnistSubs();
                }
                if (categoriatemp == Categories.VARIETIES) {
                    contador3++;
                    value += ((Magazine) books.get(i)).getValueM() * ((Magazine) books.get(i)).getUnistSubs();
                }

            }

        }
        msg += "\nThe number of books sold in the: ";
        msg += "\nDesing " + contador1 ;
        msg += "\nScientific " + contador2 ;
        msg += "\nVarieties " + contador3 ;

        msg += "\n\nThe value total: ";
        msg += "\nDesing " + value;
        msg += "\nScientific " + value;
        msg += "\nVarieties " + value;
        return msg;
    }

}
