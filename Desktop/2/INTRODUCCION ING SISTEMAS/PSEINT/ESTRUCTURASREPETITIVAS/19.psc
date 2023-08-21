Algoritmo articulos
	
	//En un supermercado un ama de casa pone en su carrito los artículos que va tomando de los estantes.
	//La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado, por lo que cada vez que toma un
	//artículo anota su precio junto con la cantidad de artículos que ha tomado y determina cuánto dinero gastara en ese artículo,
	//a esto le suma lo que ira gastando en los demás artículos, hasta que decide que ya tomo todo lo que necesitaba.
	//Ayúdale a esta señora a obtener el total de sus compras
	//Entrada: numArticulo
	//Salida: total
	//Analisis: Se le pregunta al asuario el articulo que escogio, cuantos escogio, y el precio de ellos.
	//el total de la compra se suma con el numero del articulo y se multiplica por el precio, luego se pregunta
	//si se llevara otro articulo, hasta que no se coloque no se mostrata el valor total de la compra
	
	Definir  numArticulo, suma, precio Como Entero
	Definir total Como Real
	Definir articulo, continuar Como Caracter
	
	Repetir
		Escribir " ¿Que articulo toma? "
		leer articulo 
		Escribir " ¿Cuantos articulos va a llevar? "
		leer numArticulo
		Escribir " ¿Cual es el precio del articulo? "
		leer precio 
		total= total + (numArticulo * precio )
		
		Escribir " Desea llevar otro articulo ( Si = s, No = n ) "
		leer continuar
	Hasta Que continuar = "n" o continuar = "N"
	
	Escribir " El total de la compra es de: " mostrar total
	
FinAlgoritmo