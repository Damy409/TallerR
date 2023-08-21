Algoritmo articulos
	
	//En un supermercado un ama de casa pone en su carrito los art�culos que va tomando de los estantes.
	//La se�ora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado, por lo que cada vez que toma un
	//art�culo anota su precio junto con la cantidad de art�culos que ha tomado y determina cu�nto dinero gastara en ese art�culo,
	//a esto le suma lo que ira gastando en los dem�s art�culos, hasta que decide que ya tomo todo lo que necesitaba.
	//Ay�dale a esta se�ora a obtener el total de sus compras
	//Entrada: numArticulo
	//Salida: total
	//Analisis: Se le pregunta al asuario el articulo que escogio, cuantos escogio, y el precio de ellos.
	//el total de la compra se suma con el numero del articulo y se multiplica por el precio, luego se pregunta
	//si se llevara otro articulo, hasta que no se coloque no se mostrata el valor total de la compra
	
	Definir  numArticulo, suma, precio Como Entero
	Definir total Como Real
	Definir articulo, continuar Como Caracter
	
	Repetir
		Escribir " �Que articulo toma? "
		leer articulo 
		Escribir " �Cuantos articulos va a llevar? "
		leer numArticulo
		Escribir " �Cual es el precio del articulo? "
		leer precio 
		total= total + (numArticulo * precio )
		
		Escribir " Desea llevar otro articulo ( Si = s, No = n ) "
		leer continuar
	Hasta Que continuar = "n" o continuar = "N"
	
	Escribir " El total de la compra es de: " mostrar total
	
FinAlgoritmo