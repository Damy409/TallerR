Algoritmo SALARIO
	
	//Entradas: Salario, Numero de horas trabajadas 
	//Una empresa calcula el salario mensual de un trabajador según la cantidad de horas trabajadas, 
	//si trabaja hasta 180 horas se le pagará cada hora al valor de su tarifa, si trabaja más de 180 horas 
	//al mes se le pagará un recargo de un 50% adicional a su tarifa por cada hora adicional trabajada.
	//Analisis: Con la ayuda de el condicional Si Entonces, calcularemos cual va a ser el salario de un 
	//trabajador mensualmente, dependidendo de las horas en que este trabaje.
	//Salidas: El valor del salario mensual 
	
	Definir Salario, Sal Como Real
	Definir h Como Entero
	
	Escribir " Digite su salario"
	leer salario
	Escribir "Horas trabajadas"
	Leer h 
	
	Si h <= 180 Entonces
		sal <- salario* (salario * h)
		Escribir  " su salario mensual va a ser de ",salariot " pesos " 
	SiNo
		Si h > 180 Entonces
			salariot <- salario*(h*0.5)
			Escribir  " su salario mensual va a ser de ",salariot " pesos "
		Fin Si
	Fin Si
	
	
FinAlgoritmo

