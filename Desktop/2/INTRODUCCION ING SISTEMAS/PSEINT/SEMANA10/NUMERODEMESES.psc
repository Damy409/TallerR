Algoritmo NUMERODEMESESYDIAS
	// Escribe un programa que pida un n�mero entero entre uno y doce
	//imprima el n�mero de d�as que tiene el mes correspondiente
	Definir num Como Entero
	Escribir " Digite un numero entre 1 y 12 "
	leer num
	
	Si num=1 o num=3 o num=5 o num=7 o num=8 o num=10 o num=12 Entonces
		Escribir " Este mes tiene 31 dias"
	SiNo
		Si num = 2 Entonces
			Escribir " Este mes tiene 28 dias "
		SiNo
			Escribir " Este mes tiene 30 dias "
		Fin Si
	Fin Si
FinAlgoritmo
