Algoritmo SumatoriaDeNumero
	
	//Se solicita un numero al usuario y se muestra en pantalla la sumatoria desde 1 hasta dicho numero
	//Entrada: num
	//Salida: suma
	//Analisis: Se pide al usuario que ingrese un numero, y se inicia la suma con valor de 1
	//iniciamos un ciclo con la condicion Repetir Hasta Que el contador sea igual al numero ingresado, y 
	//cuando el ciclo termine, muestre el contador
	
	Definir suma, num, contador Como Entero
	
	Escribir " Digite un numero "
	leer num 
	
	contador<- 0
	Repetir
		
		contador <- contador + 1
		Mostrar Sin Saltar contador
		
		Si contador = num Entonces
			Mostrar Sin Saltar " = "
		SiNo
			Mostrar Sin Saltar " + "
		Fin Si
		
		suma <- suma + contador 
	Hasta Que contador = num 
	
	Mostrar suma
	
FinAlgoritmo
