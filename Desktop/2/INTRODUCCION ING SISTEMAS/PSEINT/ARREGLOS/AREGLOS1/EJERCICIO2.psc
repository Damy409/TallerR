Algoritmo EJERCICIO2
	//Entrada: numero del grupo de estudiantes, edades.
    //Ejercicio 2: Uso inicial de arreglos
	//Ingresar en un arreglo las edades de un grupo de estudiantes
	//Decir cuál es la edad menor y en que posición se encuentra
	//Decir cuál es la edad mayor y en que posición se encuentra
	//Calcular el promedio de las edades del grupo
	//Analisis: Pedimos al usuario que digite el numero de estudiantes a los que se les va a pedir la edad, dimensionamos el arreglo, que 
	//serian las edades y con ayuda de un Para pedimos la edad de cada estudiante, y comparamos las edades para saber cual es la mayor y 
	//la menor y en que posicion del arreglo se encuentran, y finalmente calculamos el promedio de todas las edades del grupo.
	//Salidas: edad mayor y su posicion, edad menor y su posicion, promedio de las edades.
	Definir edades, n, i, pos, posi, edMe, edMa, promedio  Como Entero
	
	//Pedimos al usuario que digite el grupo de estudiantes a los que se les va a pedir la edad
	
	Escribir "Digite a cuantos estudiantes se les va a pedir la edad"
	leer n
	n <- n + 1 
	Dimension edades[n]
	
	//Pedimos al usuario que digite las edades de los estudiantes dependiendo de el numero del grupo 
	
	Para i <- 1 Hasta n-1 Con Paso 1 Hacer
		Escribir "Digite la edad del estudiante"
		leer edades[i]
		promedio <- promedio + edades[i]
	Fin Para
	
	//Comparamos edades para saber cual es la mayor, cual es menor y en que posicion se encuentran
	
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
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
	
	//Mostramos en pantalla cual es la edad mayor y su posicion 
	Mostrar " La edad mayor es " edMa " y la posicion en la que esta es " pos
	//Mostramos en pantalla cual es la edad menor y su posicion 
	Mostrar " La edad menor es " edMe " y la posicion en la que esta es " posi
	
	//Calculamos el promedio de las notas
	promedio <- promedio / (n-1)
	//Mostramos el promedio de las notas
	Mostrar "El promedio de todas las edades es de: " promedio
	
FinAlgoritmo
