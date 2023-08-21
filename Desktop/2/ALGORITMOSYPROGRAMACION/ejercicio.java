import java.util.Scanner;
	
	public class ejercicio {
		
		public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in) ;
				
			
				System.out.println("Digite un numero para encontrar su factorial") ;
			
				double num = entrada.nextDouble () ;
				
				int contador = 1;
				
				double factorial = 1;
				
				while (contador <= num) {
					
					factorial = (factorial * contador) ;
					
					contador += 1;
					
					
				}
				
				System.out.println("El factorial de: " + num + " es: " + factorial);
				
				System.out.println("¿Desea saber el factorial de otro numero? Si(1), No(2)");
				
				int respuesta = nextInt ();
				
		}
	}	