import java.util.Scanner;
	
	public class borrador {
		
		public static void main(String[] args){
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite el tamaño del arreglo");
			int arreglo = entrada.nextInt ();
			
			double [] a = new double [arreglo];
			
			for (int i = 0; i<a.length; i++){
				
				System.out.println("Digite la nota en la posicion "+(i+1)+ " del arreglo");
				a[i] = entrada.nextDouble ();
				
			}
			
			double promedio = 0;
			
			for (int i = 0 ; i<a.length; i++){
				
				promedio += a[i];
			}
			
			promedio /= a.length;
			
			