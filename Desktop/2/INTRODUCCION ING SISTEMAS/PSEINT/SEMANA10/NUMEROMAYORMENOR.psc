Algoritmo numeroMayorMenor
	Definir num1, num2, num3 como entero
	
	Escribir " Digite el primer numero "
	leer num1 
	Escribir " Digite el segundo numero "
	leer num2 
	Escribir " Digite el tercer numero "
	leer num3 
	
	Si num1 > num2 & num2 > num3  Entonces
		Escribir num1 " > ", num2 " > ", num3
	SiNo
		Si num1 > num3 & num3 > num2 Entonces
			Escribir num1 " > ", num3 " > ", num2
		SiNo
			Si num2 > num1 & num1 > num3 Entonces
				Escribir num2 " > ", num1 " > ", num3
			SiNo
				Si num2 > num3 & num3 > num1 Entonces
					Escribir num2 " > ", num3 " > ", num1
				SiNo
					Si num3 > num2 & num2 > num1 Entonces
						Escribir num3 " > ", num2 " > ", num1
					SiNo
						Si num3 > num1 & num1 > num2  Entonces
							Escribir num3 " > ", num1 " > ", num2
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
