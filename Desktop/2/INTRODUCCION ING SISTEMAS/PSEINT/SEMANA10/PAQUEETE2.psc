Algoritmo PAQUETE2
	definir num Como caracter
	Escribir " Digite el numero dependiendo el lugar al cual desea enviar el paquete"
	Escribir " 1) America del Norte"
	Escribir " 2) America central "
	Escribir " 3) America del Sur "
	Escribir " 4) Europa "
	Escribir " 5) Asia "
	leer num 
	
	Si num = " 1 " Entonces
		Escribir " El costo del envio es de 24.00 euros "
	SiNo
		Si num = " 2 " Entonces
			Escribir " El costo del envio es de 20.00 euros "
		SiNo
			Si num = " 3 "  Entonces
				Escribir " El costo del envio es de 21.00 euros"
			SiNo
				Si num = " 4 "  Entonces
					Escribir " El costo del envio es de 10.00 euros "
				SiNo
					Si num = " 5 "  Entonces
						Escribir " El costo del envio es de 18.00 euros "					
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo