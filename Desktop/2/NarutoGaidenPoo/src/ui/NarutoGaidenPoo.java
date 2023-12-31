package ui;

import java.util.Scanner;
import model.Controladora;

public class NarutoGaidenPoo{

    private Scanner lector;
    private Controladora controladora;
    private String anObjetc;

    public NarutoGaidenPoo(){

        lector = new Scanner(System.in);
        controladora = new Controladora();        
    }

    public void menu(){

        System.out.println("Bienvenido a NarutoGaidenPOO");

        boolean cond = false;

        while(!cond){

            System.out.println("1. Registrar entrenamiento");
            System.out.println("2. Consultar informacion registrada");
            System.out.println("3. Salir");
            int opcion = lector.nextInt();

            switch(opcion){

                case 1:
                registrarTipoEntrenamiento();
                break;

                case 2:
                consultarInfo();
                break;

                case 3:
                cond = true;
                break;

            }


        }

    }

    public void registrarTipoEntrenamiento(){

        System.out.println("Digite a continuacion la informacion de un entrenamiento");

        //Limpieza de buffer
        lector.nextLine();

        System.out.println("Digite el tipo de entrenamiento. Ej.: Ninjutsu");
        String tipo = lector.nextLine();

        System.out.println("Digite el maximo numero de horas para el entrenamiento. Ej.: 200");
        int duracionMaxima = lector.nextInt();

        System.out.println(tipo);
        if(controladora.registrarTipoEntrenamiento2(tipo, duracionMaxima)){

            System.out.println("Entrenamiento registrado exitosamente");

        }else{

            System.out.println("Memoria llena, no se pudo registrar el Entrenamiento");
        }
    }

    public void registrarSesionDeEntrenamiento(){

        String contulta = Controladora.consultarEntrenamientoRegistrado();

        Object consulta;
        if(consulta.equals(anObjetc: "")){

            System.out.println("No hay entrenammientos registrados : :()");
        }else{

            System.out.println("Estos son los tipos de entrenaminetos registradoas");
            System.out.println(consulta);
            System.out.println("Digite el tipo del cual se va crear el  emtremamiento");
            int opcion = lector.nextInt();
            System.out.println("Digite olas horas de entrenamientoW");
            int hotras = lector.nextInt();

        }


        System.out.println("Digite a continuacion la informacion de una sesion de entrenamiento");
    }

    public void consultarInfo(){

        System.out.println("Esta es la informacion registrada en el sistema");

        String consulta = controladora.consultarInfo();

        if(consulta.equals("")){

            System.out.println("No hay entrenamientos registrados :(");
        }else{
            System.out.println(consulta);
        }



    }

    public static void main(String[] args) {

        NarutoGaidenPoo ejecutable = new NarutoGaidenPoo();
        ejecutable.menu();



        /**
        Entrenamiento ninjutsu = new Entrenamiento("Ninjutsu", 500, 0, 0);
		entrenamientos[0] = ninjutsu;
		
		Entrenamiento taijutsu = new Entrenamiento("Taijutsu", 300, 0, 0);
		entrenamientos[1] = taijutsu;
		
		Entrenamiento genjutsu = new Entrenamiento("Genjutsu", 200, 0, 0);
		entrenamientos[2] = genjutsu;
        for(int i = 0; i<entrenamientos.length;i++){
            System.out.println(entrenamientos[i].toString());
        }
        */
        

    }






}
