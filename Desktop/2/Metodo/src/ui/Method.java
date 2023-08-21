package ui;
import java.util.Scanner;

	/*
	 * @author: Damy Yuriana Villegas Ordoñez
     *	 
	 * Program description
	 * This program is created to be able to calculate the Bisection Method of three functions 
	 * in a range with a lower and upper limit, which are entered by the user.
	 *
	 * Inputs: function(Option to choose the function to calculate), a(Lower limit), b(Upper limit), continue(Option to repeat the program)
	 * Outputs: The result of an approximate root according to the desired function to be calculated by the user 
	 *
	 * Example: Function 1 is chosen with lower limit a = 1 and upper limit b = 2
	 * Return message by console:
	 *            The approximate root is: 1.2533149719238281
	 *            f(root) = -4.18410705894025E-6
	 */

	public class Method {
		
		
		public static void main(String[] args) {
			
			Scanner reader = new Scanner(System.in);
			
			double epsilon = 0.00001;
			double a;
			double b;
			double root;
			int continuer;
			
			System.out.println("Welcome to the system for calculating the Bisection Method");
			
			do {
				
				System.out.println("Enter a number depending on the function you want to calculate");
				System.out.println("1. f(x) = 2cos(x^2)");
				System.out.println("2. f(x) = 3x^3 + 7x^2 + 5");
				System.out.println("3. f(x) = xcos(x)");
				int function = reader.nextInt();
				
				switch (function){
					
					case 1:
					
						System.out.println("To use the bisection method type the range");
						System.out.println("Enter or lower limit (a)");
						a = reader.nextDouble(); 
						
						System.out.println("Enter the upper limit (b)");
						b = reader.nextDouble(); 
						
						root = metBis(a, b, epsilon);
						System.out.println("A fuzzy root is: " + root);
				
						System.out.println("f(root) = " + f(root));
						
						
						break;
					
					case 2:
					
						System.out.println("To use the bisection method type the range");
						System.out.println("Enter or lower limit (a)");
						a = reader.nextDouble(); 
						
						System.out.println("Enter the upper limit (b)");
						b = reader.nextDouble(); 
						
						root = metBis(a, b, epsilon);
						System.out.println("A fuzzy root is: " + root);
						
						System.out.println("g(root) = " + g(root));
						   
						
						break;
					
					case 3:
						
						System.out.println("To use the bisection method type the range");
						System.out.println("Enter or lower limit (a)");
						a = reader.nextDouble(); 
						
						System.out.println("Enter the upper limit (b)");
						b = reader.nextDouble(); 
						
						root = metBis(a, b, epsilon);
						System.out.println("A fuzzy root is: " + root);
						
						System.out.println("h(root) = " + h(root));
						break;
						
					default:
						
						System.out.println("Error");
					
				}
				
				System.out.println("Do you want to calculate another function? \n 1. Yes \n 2. No");
				continuer = reader.nextInt();
				
			}while(continuer == 1);
		}

		/**
		*Deprecated: The power method allows obtaining the result of a base number raised to an exponent number
		*@param base double Is the base number, which is to be raised
		*@param expo int It is the exponential number, it is the number of times the base number will be raised
		*@return result double Result of the base number raised by the exponent number
		*/
		
		
		public static double power(double base, int expo){

			double result = 1;
			for(int i=0; i<expo; i++){
				result *= base;
			}

			return result;
		}
		
		/**
		*Deprecated:This method allows obtaining the factorial of a number
		*@param fac int The number that calls the method to calculate its factorial
		*@return result double Result of the method to find the factorial of a number
		*/
		public static double factorial(int fac){
		
			double result = 1;
			for (int i = 1; i<= fac; i++) {
				result *= i;
			}
			return result;

		}
		
		/**
		*Deprecated: The cosine method allows to implement the mathematical function of cosine without the use of libraries
		*@param x double The number that calls the method
		*@return result double Approximate result of the cosine function 
		*/
		public static double cosine(double x){
			
			double result = 0;
			double numerator;
			double denominator;
			double multiplication;

			for (int i=0; i<50; i++){
				
				numerator = (power(-1, i));
				denominator = factorial(2 * i);
				multiplication = power(x, 2 * i);
				result += (numerator/denominator)*multiplication;
			}

			return result;

		}
		
		/**
		*Deprecated: The absolute method allows to calculate the mathematical function of absolute value
		*@param num double Number that calls the method to get its absolute value
		*@return num double Result of the method 
		*/
		public static double absolute(double num){
			
			if(num<0){
				
				num = num * (-1);
			}

			return num;
		}
		

		/**
		*Deprecated: The method f allows to calculate one of the given functions
		*@param x double Number that calls the method to be able to calculate the function 
		*@return resu double result of the calculation of the function
		*/
		public static double f(double x) {
			double valcosine = cosine(power(x, 2));
			double resu = 2 * valcosine;
			return resu;
		}
		
		/**
		*Deprecated: The method g allows to calculate one of the given functions
		*@param x double Number that calls the method to be able to calculate the function 
		*@return resu double result of the calculation of the function
		*/	
		public static double g(double x) {
			double resu = 3 * power(x, 3) + 7 * power(x, 2) + 5;
			return resu;
		}
		
		/**
		*Deprecated: The method h allows to calculate one of the given functions
		*@param x double Number that calls the method to be able to calculate the function 
		*@return resu double result of the calculation of the function
		*/
		public static double h(double x) {
			double valcosine = cosine(x);
			double resu = x * valcosine;
			return resu;
		}
		
		/**
		* Deprecated: The metBis method allows finding the approximate root of a function 
		*@param a double Value that takes the lower bound
		*@param b double Value that takes the upper bound
		*@param epsilon double Value of epsilon to be able to calculate the bisection method 
		*@return c double Result of the calculation to find the approximate root of a function
		*/
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
		
			return c;
		}
	}