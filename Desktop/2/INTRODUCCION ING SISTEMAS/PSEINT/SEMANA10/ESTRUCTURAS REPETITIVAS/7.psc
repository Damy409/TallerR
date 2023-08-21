Algoritmo sin_titulo
	Definir num, contador, multiN Como Entero
	
	Escribir "Digite un numero entero positivo, para calcular su factorial"
	Leer num
	
	contador <- num
	
	Repetir
		
		Si contador = 1 Entonces
			Mostrar Sin Saltar contador " = "
		SiNo
			Mostrar Sin Saltar contador " * "
		FinSi
		
		Si contador = num Entonces
			multiN = multiN + contador
		SiNo
			multiN = multiN * contador
		FinSi
		
		contador = contador - 1
		
	Hasta Que contador = 0
	
	
	Mostrar multiN
	
FinAlgoritmo