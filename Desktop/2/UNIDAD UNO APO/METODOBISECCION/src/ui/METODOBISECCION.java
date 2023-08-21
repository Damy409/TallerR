package ui;
import java.util.Scanner;

public class METODOBISECCION {
	
	
    public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double epsilon = 0.00001;
		
		double raiz = metBis(a, b, epsilon);
		System.out.println("La raiz aproximada es: " + raiz);
		
		System.out.println("f(raiz) = " + f(raiz));
		System.out.println("g(raiz) = " + g(raiz));
		System.out.println("h(raiz) = " + h(raiz));
	}
	/*
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema para calcular el Método de Bisección");
        System.out.println("Digite un número dependiendo de la función que desea calcular");
        System.out.println("1. f(x) = 2cos(x^2)");
        System.out.println("2. f(x) = 3x^3 + 7x^2 + 5");
        System.out.println("3. f(x) = xcos(x)");
        int funcion = entrada.nextInt();
        
        double epsilon = 0.001;
        double a;
        double b;
        double raiz;
        double g;
        
        switch (funcion){
            
            case 1:
            
                System.out.println("Para poder emplear el método de bisección digite el rango");
                System.out.println("Digite el límite inferior (a)");
                a = entrada.nextDouble(); 
                a = f(a);
                
                System.out.println("Digite el límite superior (b)");
                b = entrada.nextDouble(); 
                b = f(b);
                
                System.out.println(metBis(a, b, epsilon));
                
                break;
            
            case 2:
            
                System.out.println("Para poder emplear el método de bisección digite el rango");
                System.out.println("Digite el límite inferior (a)");
                a = entrada.nextDouble(); 
                a = g(a);
                
                System.out.println("Digite el límite superior (b)");
                b = entrada.nextDouble(); 
                b = g(b);
                
                System.out.println(metBis(a, b, epsilon));
                        
                
                break;
            
            case 3:
                
                System.out.println("Para poder emplear el método de bisección digite el rango");
                System.out.println("Digite el límite inferior (a)");
                a = entrada.nextDouble(); 
                a = h(a);
                
                System.out.println("Digite el límite superior (b)");
                b = entrada.nextDouble(); 
                b = h(b);
                
                System.out.println(metBis(a, b, epsilon));
                
                break;
            
        }
         
    }
	*/
    //Método para calcular potencia
    public static double potencia(double base, int expo){

        double resultado = 1;
        for(int i=0; i<expo; i++){
            resultado *= base;
        }

        return resultado;
    }
    
    //Método para calcular el factorial 
    public static double factorial(int fac){
    
        double result = 1;
        for (int i = 1; i<= fac; i++) {
            result *= i;
        }
        return result;

    }
    
    //Método para calcular coseno
    public static double coseno(double x){
        
        double result = 0;
        double numerador;
        double denominador;
        double multiplicacion;

        for (int i=0; i<=100; i++){
			
            numerador = (potencia(-1, i));
            denominador = factorial(2 * i);
            multiplicacion = potencia(x, 2 * i);
            result += (numerador/denominador)*multiplicacion;
        }

        return result;

    }
    
    //Método para calcular valor absoluto
    public static double absolute(double num){
        
        if(num<0){
            
            num = num * (-1);
        }

        return num;
    }
    

	//Metodo para calcular la primera funcion
	public static double f(double x) {
		double valocoseno = coseno(potencia(x, 2));
		double resu = 2 * valocoseno;
		return resu;
	}
	
	//Metodo para calcular la segunda funcion 
	public static double g(double x) {
		double resu = 3 * potencia(x, 3) + 7 * potencia(x, 2) + 5;
		return resu;
	}
	
	//Metodo para calcular la tercera funcion
	public static double h(double x) {
		double valocoseno = coseno(x);
		double resu = x * valocoseno;
		return resu;
	}
	
	public static double metBis(double a, double b, double epsilon) {
		double fa = f(a);
		double fb = f(b);
		double c = 0;
		double fc = 0;
		
		do {
			c = (a + b) / 2;
			fc = f(c);
			
			if (fa * fc < 0) {
				b = c;
				fb = fc;
			} else {
				a = c;
				fa = fc;
			}
			
		} while (absolute(fc) > epsilon);
		
		System.out.println("El resultado de la raiz es: " + c);
		
		return c;
	}
	

}