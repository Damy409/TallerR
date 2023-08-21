Algoritmo numeroalrevez
	
	//Crea un programa que invierta el orden de las cifras de un numero por medio de diviciones 
	//Entradas: num 
	//salidas: numero invertido
	//Analisis: se le pide al usuario que digite un numero para que este sea invertido
	//luego se le asigna a num dividido por 10, se muestra la cifra, con num asignado truncar (num/10)
	//con la operacion realizada se invierte el numero y se Escribe el resultado 
	
	Definir num Como Real
	
	Escribir " Ingrese un numero " 
	leer num 
	
	Repetir
		Escribir Sin Saltar (num%10)
		num <- trunc ( num / 10 ) 
	Hasta Que num = 0 
	
	
	
FinAlgoritmo
