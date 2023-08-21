Algoritmo sin_titulo
	Definir num, numpar, contador Como Entero
	Escribir " Digite un numero "
	leer num
	
	contador = num 
	Repetir
		numpar = contador mod 2
		Si numpar <> 0 Entonces
			mostrar contador
		Fin Si
		contador = contador - 1
	Hasta Que contador = 0 
	
FinAlgoritmo
