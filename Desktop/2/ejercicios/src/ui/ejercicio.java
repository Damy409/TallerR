package ui;

import java.util.Scanner ;
	
	public class ejercicios {
		
		static Scanner entrada = new Scanner(System.in);
		
		
		public static void main(String[] args){
			
			
			int continuar = 0;
			do{
				
				System.out.println("Digite un numero del 1 al 5 dependiendo del ejercicio que desea calcular");
				System.out.println("1. Calcular potencia");
				System.out.println("2. Calcular la suma de numeros divisibles por 3 entre dos numeros que usted registre");
				System.out.println("3. Calcular la suma y la media de los numeros que el usuarios digite hasta que ingrese 0");
				System.out.println("4. Mostrar tabla del numero que dijite el usuario ");
				System.out.println("5. Calcular promedio");
				int decision = entrada.nextInt ();
			
				switch (decision){
				
					case 1:
				
						System.out.println("Digite dos numeros para calcular la potencia");
						System.out.println("Digite el numero base");
						double a = entrada.nextDouble ();
			
						System.out.println("Digite el numero que toma valor del exponente");
						int b = entrada.nextInt ();
			
						System.out.println("La potencia del numero " +a+ " elevado en " +b+ " es: ");
						System.out.println(potencia(a, b));
						break;
					
					case 2:
					
						System.out.println("Digite el primer numero");
						int m = entrada.nextInt ();
						System.out.println("Digite el segundo numero");
						int n = entrada.nextInt ();
					
					
						break;
					case 3:

						int suma = 0;
					
						int sumatoria1 = sumatoria(suma);
					
						System.out.println("La suma de todos los numeros introducidos excepto el cero es: " + sumatoria1);
					
						break;
					case 4:
						break;
					case 5:
						break;
				}
					System.out.println("Desea relizar otro ejercicio? \n 1. Si \n 2. No ");
					continuar = entrada.nextInt ();
					
			}while (continuar == 1);
		}
		
		public static double potencia(double a, int b){
			
			double potencia = a ;
			
			for (int i=1; i<b; i++){
				
				potencia = (potencia * a);
			}
			return potencia;
		}
		
		public static int sumatoria(int suma){
			
			int num = 0;
			
			do {
					
				System.out.println("Digite los numero que desee,para poder calcular la suma de ellos");
				System.out.println("Si desea parar, solo dijite el numero 0 ");
				num = entrada.nextInt();
				
				if(num != 0){
					suma = (suma + num);
				}				

			}while (num != 0 );
			
			return suma;
		}
	}