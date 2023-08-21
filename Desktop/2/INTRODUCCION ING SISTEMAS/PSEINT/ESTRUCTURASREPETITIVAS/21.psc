Algoritmo PromedioPeso
	
	//Una persona debe realizar un muestreo con N sujetos para determinar el promedio de peso de los niños,
	//jóvenes, adultos y viejos que existen en su zona habitacional,se determinan las categorías con base en la siguiente tabla.
	
	//Categorias  edad
	//Niños        1-12
	//jovenes      13-29
	//adultos       30-59
	//viejos         60+
	
	//Entrada: peso, edad
	//Salida: promedioN, promedioJ, promedioA, promedioV
	//Analisis: Se pide al usuario que digite el peso y la edad de la persona, si el niño esta entre 1 y 12 años, si es joven esta entre 13 y 29 años,
	//Si es adulto esta entre 30 y 59 años, por ultimo si es viejo esta entre 60 o mas años, dependiendo de la categoria a la cual pertenezca la edad, 
	//El peso que se registra se acumulara para luego ser dividido por el total de niños, jovenes, adultos y viejos, dependendiendo de la categoria,
	//y se ingresa una condicion para verificar si ingreso al menos un niño, joven, adulto o viejo con el fin de que no haya un fallo en el programa 
	//y divida entre cero 
	
	Definir edad, ninos, jovenes, adultos, viejos Como Entero
	Definir peso, promedioN, promedioJ, promedioA, promedioV Como Real
	Definir continuar Como Caracter
	Repetir
		Escribir " Digite su edad "
		leer edad 
		Escribir " Digite su peso "
		leer peso
		
		Si edad >=1 y edad <= 12 Entonces
			ninos = ninos + 1
			promedioN = promedioN + peso
		Fin Si
		Si edad >= 13 y edad <= 29  Entonces
			jovenes = jovenes + 1
			promedioJ = promedioJ + peso 
		Fin Si
		Si edad >= 30 y edad <= 59  Entonces
			adultos = adultos + 1 
			promedioA = promedioA + peso
		Fin Si
		Si edad >= 60 Entonces
			viejos = viejos + 1 
			promedioV = promedioV + peso 
		Fin Si
		Escribir " ¿Desea agregar otro sujeto? ( Si = s, No = n ) "
		leer continuar 
	Hasta Que continuar = "n" o continuar = "N"
	
	Si ninos = 0  Entonces
		promedioN = 0 
	SiNo
		promedioN <- promedioN/ninos
	Fin Si
	Si jovenes = 0 Entonces
		promedioJ = 0 
	SiNo
		promedioJ <- promedioJ/jovenes
	Fin Si
	Si adultos = 0 Entonces
		promedioA = 0
	SiNo
		promedioA <- promedioA/adultos
	Fin Si
	Si viejos = 0 Entonces
		promedioV = 0 
	SiNo
		promedioV <- promedioV/viejos
	Fin Si
	
	mostrar " El promedio del peso de los niños es: " promedioN
	mostrar " El promedio del peso de los jovenes es: " promedioJ
	mostrar " El promedio del peso de los adultos es: " promedioA 
	mostrar " El promedio del peso de los viejos es: " promedioV
FinAlgoritmo