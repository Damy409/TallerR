Algoritmo Edaddehugopacoyluis
	Definir edadh, edadp, edadl Como Caracter
	
	Escribir "digite la edad de hugo"
	leer edadh
	Escribir "digite la edad de paco"
	leer EdadDeDosPersonas
	Escribir "digite la edad de luis"
	leer edadl
		
	si edadh=edadl & edadh = edadP Entonces
		Escribir "tienen la misma edad"
	SiNo
		si edadL = edadp Entonces
			Escribir "tienen la misma edad"
		FinSi
	FinSi
	Si edadh < edadl y edadh < edadp Entonces
		Escribir " hugo es menor"
	SiNo
		Escribir "hugo es mayor"
	Fin Si
	Si edadl<edadh y edadl<edadp Entonces
		Escribir "luis es menor"
	SiNo
		escribir "luis es mayor"
	Fin Si
	Si edadp<edadh y edadp<edadl Entonces
		Escribir "Paco es menor"
	SiNo
		Escribir "paco es mayor"
	Fin Si
FinAlgoritmo
