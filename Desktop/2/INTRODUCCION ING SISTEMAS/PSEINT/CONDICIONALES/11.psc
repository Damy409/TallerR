Algoritmo EDAD
	//Entradas: Edad.
	//Hacer un programa que muestre un mensaje de acuerdo a la edad ingresada de la siguiente manera: 
	//Si la edad es de 0 a 10 a�os "ni�o", si la edad es de 11 a 14 a�os "p�ber", si la edad es de 15 a 18 a�os "adolescente",
	//si la edad es de 19 a 25 a�os "joven", si la edad es de 26 a�os en adelante "adulto".
	//Analisis: Dependiendo de la edad registrada por el usuario, y con la ayuda de el condicional si Entonces
	//sabremos si la persona es un Ni�o, Puber, Adulto, Joven o Adolecente.
	//Salidas: Si es Ni�o, Puber, Adulto, Joven o Adolecente.
	Definir edad Como Entero
	
	Escribir "Digite la edad"
	leer edad
	
	Si edad>=0 & edad<= 10  Entonces
		Escribir "Ni�o"
	SiNo
		Si edad>=11 & edad<=14 Entonces
			Escribir "Puber"
		SiNo
			Si edad>= 15 & edad <= 18 Entonces
				Escribir "Adolecente"
			SiNo
				Si edad>=19 & edad<=25 Entonces
					Escribir "Joven"
				SiNo
					si edad > 25 Entonces
						Escribir "Adulto"
					FinSi
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
