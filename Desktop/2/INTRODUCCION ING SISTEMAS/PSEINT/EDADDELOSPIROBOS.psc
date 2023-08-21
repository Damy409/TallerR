Algoritmo EDADDELOSPIROBOS
	
	Definir edad Como Entero
	definir sexo Como Caracter
	
	Escribir "Digite el sexo"
	leer sexo
	Escribir "Digite la edad"
	leer edad
	
	Si edad>=0 & edad<= 10  Entonces
		Escribir "Niño"
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
						Escribir "Usted es un viejo malparido"
					FinSi
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
