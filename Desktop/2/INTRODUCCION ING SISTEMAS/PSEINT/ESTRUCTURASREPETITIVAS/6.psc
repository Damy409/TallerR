Algoritmo Factorialnum
	
	//Calcular el factorial de un número
	//Entrada: num 
	//Salida: multiplicacion
	//Analisis: Se le pide al usuario que digite un numero, a contador se le asigna el valor de num 
	//y con el condicional Repetir, multiplicacion toma el valor de contador y la multiplicacion
	//de el contador por la multiplicacion seria el valor de el factorial de el numero, asignando a contador
	//el valor de -1, hasta que el contador sea igual a 0 
	//Se finaliza el Proceso y se muestra la multiplicacion
	
	Definir num, contador, multiplicacion Como Entero
	
	Escribir " Digite un numero "
	leer num 
	
	contador <- num
	
	Repetir
		mostrar Sin Saltar contador
		Si contador = 1 Entonces
			Mostrar Sin Saltar " = "
		SiNo
			Mostrar Sin Saltar " * "
		Fin Si
		
		Si contador = num Entonces
			multiplicacion = contador
		SiNo
			multiplicacion = contador * multiplicacion 
		Fin Si
		contador<- contador - 1
	Hasta Que contador = 0 
	
	Mostrar Sin Saltar multiplicacion
	
FinAlgoritmo