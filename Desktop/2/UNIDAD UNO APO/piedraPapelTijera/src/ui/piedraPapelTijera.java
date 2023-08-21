package ui;
import java.util.Scanner;
 
public class piedraPapelTijera
{
    public static void main(String args[])
    {
        System.out.println("Bienvenido al juego Piedra, Papel y tijera");
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Seleccione la opcion que desea realizar ");
		System.out.println("1. Jugar");
		System.out.println("2. Ver resultados");
		System.out.println("3. Salir");
        int decision = teclado.nextInt ();
		
		int continuar;
		
		if (decision == 1) {
			
			
			do {
				
				int seleccionCompu = (int)(Math.random() * 3) + 1;
				System.out.println("La computadora ya escogio la jugada");
 
				System.out.println("Escoje tu jugada ");
				System.out.println("1. Piedra");
				System.out.println("2. Papel");
				System.out.println("3. Tijera");
				int seleccionUsuario = teclado.nextInt();
 
				System.out.print("La computadora ha escogido: ");
					switch ( seleccionCompu )
					{
						case 1:
						System.out.println("Piedra");
						switch ( seleccionUsuario )
						{
							case 1: System.out.println("Empate!"); break;
							case 2: System.out.println("Usted gana!"); break;
							case 3: System.out.println("La computadora gana!"); break;
					}
					break;
 
						case 2:
						System.out.println("Papel");
						switch ( seleccionUsuario )
						{
							case 1: System.out.println("La computadora gana!"); break;
							case 2: System.out.println("Empate!"); break;
							case 3: System.out.println("Usted gana!"); break;
					}
					break;
 
						case 3:
						System.out.println("Tijera");
						switch ( seleccionUsuario )
						{
							case 1: System.out.println("Usted gana!"); break;
							case 2: System.out.println("La computadora gana!"); break;
							case 3: System.out.println("Empate!"); break;
					}
					break;
					
					System.out.println("Desea volver a jugar de nuevo");
					System.out.println("1. Si");
					System.out.println("2. No");
					continuar = teclado.nextInt ();
				}
			}while (continuar == 1);
		} 
		if (decision == 2){
			
		}
		if (decision == 3){
			
		}
    }
}