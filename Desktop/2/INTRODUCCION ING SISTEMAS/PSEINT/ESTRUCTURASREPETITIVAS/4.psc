Algoritmo Numero1
	
	//Escribir un programa el cual le permita al usuario ingresar numeros hasta que el usuario digite el numero -1
	//Informandose cuantos numeros fueron ingresados 
	//Entrada: num 
	//Salida: total de numeros ingresados 
	//Analisis: Al contador se le asigna el valor de 0, se pide al usuario que digite un numero 
	// a contador se le suma 1, Hasta Que el numero ingresado sea igual a -1, al final se muestra 
	//contador 
	
	Definir num, contador Como Entero
	contador <- 0
	
	Repetir
		
		Escribir " Digite un numero "
		leer num 
		contador <- contador + 1
		
	Hasta Que num = -1
	
	Escribir " La cantidad de numeros ingresados antes de -1 es: " contador 
	
FinAlgoritmo
