Algoritmo REPETICIONES
	
	Definir num, numpar, contador Como Entero
	Escribir " Digite un numero "
	leer num 
	
	contador = 1 
	
	Repetir
		numpar = contador mod 2
		Si numpar <> 1 Entonces
			mostrar contador
		Fin Si
		contador = contador + 1
	Hasta Que contador > num
FinAlgoritmo
