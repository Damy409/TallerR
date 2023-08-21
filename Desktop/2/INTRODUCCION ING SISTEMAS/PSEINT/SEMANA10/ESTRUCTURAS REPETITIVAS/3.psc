Algoritmo sin_titulo
	definir num, contador, suma Como Entero
	Escribir " Escriba un numero "
	leer num
	
	contador = 1
	Repetir
		suma <- contador + suma
		mostrar contador
		contador = contador + 1 
	Hasta Que contador > num 
	mostrar suma
FinAlgoritmo
