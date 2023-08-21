Algoritmo PAQUETE
	Definir num, peso como entero
	Escribir " Digite el numero dependiendo el lugar al cual desea enviar el paquete"
	Escribir " 1) America del Norte "
	Escribir " 2) America Central "
	Escribir " 3) America del Sur "
	Escribir " 4) Europa "
	Escribir " 5) Asia "
	leer num
	
	Segun num Hacer
		1:
			Escribir "El costo del envio a America del Norte es de 24.00 euros"
		2:
			Escribir "El costo del envio a America Central es de 20.00 euros"
		3:
			Escribir "El costo del envio a America del Sur es de 21.00 euros"
		4:
			Escribir "El costo del envio a Europa es de 10.00 euros"
		5:
			Escribir "El costo del envio a Asia es de 18.00 euros"
		De Otro Modo:
			Escribir " ERROR "
	Fin Segun
	
	Escribir "¿Cual es el peso del paquete que quiere enviar? "
	leer peso
	
	Si peso > 5 Entonces
		Escribir "Su paquete por ser muy pesado no va a ser transportado "
	SiNo
		Escribir "Su paquete es aceptado para realizar la entrega "
	Fin Si
FinAlgoritmo
