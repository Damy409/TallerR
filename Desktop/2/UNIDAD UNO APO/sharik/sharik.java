import java.util.Scanner;

	public class sharik{
		
		public static void main(String[] args){
			
			Scanner reader = new Scanner(System.in);

			
			
			String[] productos = {"Llave de tubo", "Desatornillador de estrella", "Adaptador coaxial", "Cable UTP", "Tubo PVC"};
			double[] precioUnitario = {10000, 5000, 600, 6000, 15000};
			
			int answer;
			
			do{
				
				System.out.println("Digite el el nombre del producto: ");
				String producto = reader.nextLine();
				
				System.out.println("Digite la cantidad deseada: ");
				int cantidad = reader.nextInt();

				int valorP = buscarProducto(productos, producto);
				if (valorP == -1) {
					
					System.out.println("El producto no existe en nuestro inventario.");
					
				} else {
					
					double valorSi = cantidad * precioUnitario[valorP];
					double valorCi = valorSi* 1.19;
					System.out.println("El total a pagar es de: " +valorCi);
				}

				int ProductoMasBarato = encontrarProductoMasBarato(precioUnitario);
				System.out.println("El producto mas barato es: " + productos[ProductoMasBarato]);
				
				System.out.println("Desea ingresar otro articulo? \n 1. SI \n 2. NO");
				answer = reader.nextInt();
				
			}while (answer == 1);
		}

		public static int buscarProducto(String[] productos, String producto) {
			
			for (int i = 0; i < productos.length; i++) {
				
				if (productos[i].equalsIgnoreCase(producto)) {
					
					return i;
				}
			}
			return -1;
		}


		public static int encontrarProductoMasBarato(double[] precios) {
			
			int valorP = 0;
			
			for (int i = 1; i < precios.length; i++) {
				
				if (precios[i] < precios[valorP]) {
					
					valorP = i;
				}
			}
			return valorP;
		}
	}

