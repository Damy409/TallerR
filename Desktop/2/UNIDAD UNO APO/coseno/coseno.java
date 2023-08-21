import java.util.Scanner;
	
	public class coseno{
		
		public static void main(String[] args){
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("vamos a calcular esta funcion ");
			System.out.println("f(x)=2cos(x^2)");
			
			System.out.println("Digite el valor que va a tomar x ");
			int x = entrada.nextInt();
			
			System.out.println("Digite el valor de iteraciones");
			int j = entrada.nextInt ();
			
			double m = (potencia(j));
			System.out.println("La potencia es" +m);
			
			double n = (multiplicacion(j));
			System.out.println("La multiplicacion es" +n);
			
			double d = (division(m, n));
			System.out.println("La division es" +d);
			
			System.out.println(multiplicacion2(x, d, j));
			
		}
		
	
		public static double potencia(int j){
			
			double potencia = -1 ;
			
			for (int i=1; i<j; i++){
				
				potencia *= -1;
			}
			return potencia;
		}
			

		public static double multiplicacion(int j){
			
			int b = 0;
			
			b = 2*(j);
			
			return b;
			
		}
		
		public static double division(double m, double n){
			
			double division = 0;
			
			division = m/n;
			
			return division;
		}
		
		public static double multiplicacion2(int x, double d, int j ){
			
			double multi = 0;
			
			for (int i=2*j; i<=1; i++){
				
				multi = d * x * i ;
			}

			return multi;
		}
		
	}