Algoritmo sin_titulo
	Definir num, multiplicacion, contador Como Entero 
	
	Escribir " Digite un numero " 
	leer num 
	
	contador <- num 
	Repetir
		Mostrar Sin Saltar contador 
		
		Si contador = 1 Entonces
			Escribir Sin Saltar " = " 
		SiNo
			Escribir Sin Saltar " * " 
		Fin Si
		
		Si contador = num Entonces
			multiplicacion <- contador 
		SiNo
			multiplicacion <- multiplicacion * contador
		Fin Si
		
	Hasta Que contador = 0 
	
	Mostrar Sin Saltar multiplicacion
		
FinAlgoritmo
