Algoritmo 15
	Definir dias, meses, años Como entero
	Definir num1, resultado Como Entero
	
	Escribir "Digite un numero de dias"
	leer num1
	
	Si num1>365 Entonces
		años <- trunc (num1/365)
		resultado <- num1 mod 365
		meses <- trunc (resultado/30)
		dias <- resultado mod 30
		Escribir "el numero ",num1 " equivale a ", " años= ",años, " meses= ", meses " dias= ",dias
	SiNo
		Si num1<365 & num1>30 Entonces
			meses <- trunc (num1/30)
			dias <- num1 mod 30
			Escribir "el numero ",num1 "equivale a ", " meses= ",meses " dias=", dias
		SiNo
			Si num1<30 Entonces
				Escribir "el numero ", num1 "equivale a ", " dias= ", dias
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
