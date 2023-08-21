Algoritmo EDADES
	//Entradas: Edad de Hugo, Edad de Paco, Edad de Luis.
	
	//Hugo, Paco y Luis son hermanos, y su tío quiere darle un regalo acorde al orden de sus edades y necesita 
	//identificar quien es el mayor, quien está en el medio y cuál es el menor, pues está sufriendo de problemas 
	//de memoria y no logra recordar las edades de los tres. De lo que está seguro es que sus edades son distintas. 
	//Nos piden ayudarlo elaborando un algoritmo que solicite las edades de los sobrinos, presente un mensaje si detecta 
	//la introducción de edades iguales e identifique quien es el mayor, el del medio y el menor.
	//Analisis: Elaborar un Algoritmo que solicite las edades de los tres hermanos y poder identificar, quien es el mayor
	//de los tres, quien es el menor, o si alguno de ellos tienen la misma edad, todo esto lo hacemos con un condicional si Entonces
	
	//Salidas: Que hermano es mayoro que Hermano es menor, tambien si alguno de los hermanos tiene la misma edad,
	
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
