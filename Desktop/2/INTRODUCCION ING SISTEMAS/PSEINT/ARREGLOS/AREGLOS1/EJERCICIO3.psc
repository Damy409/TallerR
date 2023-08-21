Algoritmo EJERCICIO3
	//Entradas: Numero de estudiantes a los que se les va a pedir el nombre y la edad, Nombre de cada uno de los 
	//estudiantes, Edad de cada uno de los estudiantes.
    //Ejercicio 3: Usando dos arreglos
	//Ingresar en otro arreglo el nombre de los estudiantes del grupo (en el mismo orden del ejercicio anterior, es decir, 
	//en la primera posición del arreglo de nombres se colocará la edad del primer estudiante y así sucesivamente)
	//Decir el nombre del estudiante con menor edad
	//Decir el nombre del estudiante con mayor edad
	//Analisis: Pedimos al usuario que digite el numero de estudiantes a los que se les va a pedir el nombre y la edad, dimensionamos el arreglo,
	//que serian las edades y el nombre y con ayuda de un Para pedimos la edad y el nombre de cada estudiante, comparamos  con los nombres de los
	//estudiantes las edades para saber cual es la mayor y la menor y en que posicion del arreglo se encuentran.
	//Salidas: Nombre del estudiante con mayor y menor edad, y la posicion en la que se encuentran
	
	Definir edades, i, n, edMa, edMe, pos, posi Como Entero
	Definir nombres Como Caracter
	
	//Pedimos al usuario que digite el numero de estudiantes
	Escribir "Digite a cuantos estudiantes se les va a pedir el nombre y la edad"
	leer n
	n <- n + 1
	
	//Dimensionamos el arreglo
	Dimension edades[n]
	Dimension nombres[n]
	
	Para i <- 1 Hasta n-1 Con Paso 1 Hacer
		//Pedimos al usuario que digite el nombre del estudiante
		Escribir "Digite el nombre del estudiante"
		Leer nombres[i]
		//Pedimos al usuario que digite la edad del estudiante
		Escribir "Digite la edad del estudiante"
		leer edades[i]
		
	Fin Para
	
	//Comparamos las edades segune el nombre para saber cual es el que tiene la mayor y la menor edad
	Para i <- 1 Hasta n-1 Con Paso 1 Hacer
		Si i = 1 Entonces
			edMa <- edades[i]
			edMe <- edades[i]
			pos <- i
			posi <- i
		SiNo
			Si edMa < edades[i] Entonces
				edMa <- edades[i]
				pos <- i
			Fin Si
			Si edMe > edades[i] Entonces
				edMe <- edades[i]
				posi <- i
			Fin Si
		Fin Si
	Fin Para
	
	//Mostramos el nombre del estudiante con mayor edad y su posicion 
	Mostrar " El nombre del estudiante con la edad mayor es " nombres[pos] " con la edad de " edMa " y la posicion en la que esta es " pos
	//Mostramos el nombre del estudiante con menor edad y su posicion 
	Mostrar " El nombre del estudiante con la edad menor es " nombres[posi] " con la edad de " edMe " y la posicion en la que esta es " posi
	
	

FinAlgoritmo
