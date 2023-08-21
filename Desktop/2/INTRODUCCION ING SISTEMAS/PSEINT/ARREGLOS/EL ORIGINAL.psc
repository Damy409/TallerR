Algoritmo sin_titulo
	// Ejercicio 1: Operaciones básicas con arreglos
	// Ingresar datos a un arreglo
	// Listar o mostrar el contenido del arreglo
	// Buscar un dato en un arreglo
	// Reemplazar un dato en un arreglo
	Definir A,n,i,busqueda,noD Como Entero
	Escribir ' Digite el tamaño del arreglo '
	Leer n
	n <- n+1
	Dimension A[n]
	Para i<-1 Hasta n-1 Hacer
		Escribir ' Digite un numero'
		Leer A[i]
	FinPara
	Para i<-1 Hasta n-1 Hacer
		Mostrar  A[i]
	FinPara
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
	
	Escribir 'Digite el dato que desea buscar para reemplazarlo'
	Leer busqueda
	Para i<-1 Hasta n-1 Hacer
		Si busqueda=A[i] Entonces
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
