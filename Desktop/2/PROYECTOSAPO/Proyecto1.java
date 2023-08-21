import java.util.Scanner;

	public class Proyecto1 {
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el primer numero");
		
		int num1 = entrada.nextInt ();
		
		System.out.println("Digite el segundo numero");
		
		int num2 = entrada.nextInt ();
		
		System.out.println("Que desea hacer con los numeros");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Modulo");
		
		int hacer = entrada.nextInt ();
		
		if (hacer ==1){
			int suma = (num1+num2);
			System.out.println(suma);
		}
		if (hacer ==2){
			int resta = (num1-num2);
			System.out.println(resta);
		}
		if (hacer ==3) {
			int multiplicar = (num1*num2);
			System.out.println(multiplicar);
		}
		if (hacer ==4) {
			double dividir = (num1/num2);
			System.out.println(dividir);
		}
		if (hacer ==5) {
			int modulo = (num1%num2);
			System.out.println (modulo);
		}
	}
}
