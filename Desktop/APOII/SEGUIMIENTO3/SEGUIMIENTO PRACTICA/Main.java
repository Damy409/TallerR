import java.util.Scanner;

public class Main{

    public static Scanner reader;

    public static void main(String[] args){

        reader = new Scanner(System.in);

        System.out.println("Digite la cantidad del arreglo");
        int longitud = reader.nextInt();

        int[] arreglo = new int[longitud];

        llenarArreglo(arreglo, 0);

        int suma = sumatoria(arreglo, 0, 0);
        System.out.println("La sumatoria de los numeros es: " +suma);

    }

    public static void llenarArreglo(int[] arreglo, int indice){

        if(indice < arreglo.length){
            System.out.println("Ingrese el numero " +(indice+1));
            int numero = reader.nextInt();
            arreglo[indice] = numero;
            llenarArreglo(arreglo, indice+1);
        }
    }

    public static int sumatoria(int[] arreglo, int indice, int acumulado){
        if(indice == arreglo.length){
            return acumulado;
        }else{
            acumulado += arreglo[indice];
            return sumatoria(arreglo, (indice+1), acumulado);
        }
    }
}