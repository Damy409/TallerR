Algoritmo sin_titulo
	Definir n, contador, sumatoria Como Entero
	Repetir
		Escribir " Ingrese un numero entero positivo "
		leer n 
	Hasta Que n > 0 
	sumatoria <- 0 
	contador <-1
	Mientras contador<n Hacer
		si (n%contador) = 0 Entonces
			Escribir contador
			sumatoria <- sumatoria + contador
		FinSi
		contador <- contador + 1
	FinMientras
	Escribir "La suma de los divisores es: ", sumatoria
	si n = sumatoria Entonces
		Escribir "Es un numero perfecto"
	SiNo
		Escribir "No es un numero perfecto"
	FinSi
FinAlgoritmo
