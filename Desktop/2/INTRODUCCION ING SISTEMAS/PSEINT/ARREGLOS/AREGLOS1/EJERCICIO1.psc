Algoritmo EJERCICIO1
	//Entradas: tamaño del arreglo, datos del arreglo, dato que se va a buscar, dato que se va a buscar para remplazarlo.
	// Ejercicio 1: Operaciones básicas con arreglos
	// Ingresar datos a un arreglo
	// Listar o mostrar el contenido del arreglo
	// Buscar un dato en un arreglo
	// Reemplazar un dato en un arreglo
	//Analisis: Solicitamos al usuario que digite el tamaño del arreglo, dimensionamos el arreglo, y luego pedimos al usuario que digite los numeros
	//que van a ir dentro del arreglo, para luego mostrar su contenido y la posicion en la que se encuentran, preguntamos al usuario el dato que desea buscar
	//y el dato que quiere buscar para que pueda ser remplazado, todo esto con ayuda de condicionales y paras.
	//Salidas: contenido del arreglo, nuevo dato que se va a remplazar.
	Definir A, n, i, busqueda, noD Como Entero 
	
	//Solicitamos el tamaño del arreglo
	Escribir ' Digite el tamaño del arreglo '
	Leer n
	n <- n+1
	Dimension A[n]
	
	//Solicitamos al usuario que digite los numeros que van a ir en el arreglo
	Para i<-1 Hasta n-1 Hacer
		Escribir ' Digite un numero'
		Leer A[i]
	FinPara
	
	//Mostramos el contenido del arreglo
	Para i<-1 Hasta n-1 Hacer
		Mostrar  A[i]
	FinPara
	
	//Solicitamos al usuario que digite el dato que desea buscar
	Escribir 'Digite el dato que desea buscar'
	Leer busqueda
	
	Para i<-1 Hasta n-1 Hacer
		Si busqueda=A[i] Entonces
			Escribir 'El dato esta dento del arreglo, se encuentra en la posicion ' i
		SiNo
			noD <- noD+1
		FinSi
	FinPara
	
	Si noD = n-1 Entonces
		Escribir 'El dato no se encuentra en el arreglo'
	FinSi
	
	noD = 0
	
	//Solicitamos al usuario que digite el dato que desea buscar para remplazarlo 
	Escribir 'Digite el dato que desea buscar para reemplazarlo'
	Leer busqueda
	
	Para i<-1 Hasta n-1 Hacer
		
		Si busqueda=A[i] Entonces
			//Mostramos si el dato esta en el arreglo y la posicion en la que se encuentra
			Escribir 'El dato esta dento del arreglo, se encuentra en la posicion ' i
			Escribir "Digite el valor por el cual desea reemplazar este dato"
			Leer A[i]
			
		SiNo
			noD <- noD+1
		FinSi
		
	FinPara
	
	Si noD = n-1 Entonces
		Escribir 'El dato no se encuentra en el arreglo, por lo cual no se reemplazara'
	FinSi
	
	Para i<-1 Hasta n-1 Hacer
		Mostrar  A[i]
	FinPara
	

	
FinAlgoritmo
