import java.util.Scanner;
	
	public class borrador {
		
		public static void main(String[] args){
			
			int decision; 
			
			do{
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Digite el tamaño del arreglo");
				
				int arreglo = entrada.nextInt ();
				
				double [] a = new double [arreglo];
				
				for (int i=0; i<a.length; i++){
					
					System.out.println("Digite la nota en la posicion " +(i+1)+ " del arreglo");
					a [i] = entrada.nextDouble ();
					
				}
				
				double promedio = 0 ; 
				
				for (int i=0; i<a.length; i++){
					
					promedio += a[i];
				}
				
				promedio /= a.length;
				
				System.out.println("El promedio de notas es de " +promedio);
				System.out.println("Desea calcular otro promedio? ");
				System.out.println("1. Si");
				System.out.println("2. No");
				
				decision = entrada.nextInt ();
				
			}while(decision == 1);
			
			
	
		}
	}
	