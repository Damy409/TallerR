Algoritmo HorarioDeUnTrabajador
	
	Definir salario, salariot Como Real
	Definir h Como Entero
	
	Escribir " Digite su salario"
	leer salario
	Escribir "Horas trabajadas"
	Leer h 
	
	Si h <= 180 Entonces
		salariot <- salario*(salario*h)
		Escribir salariot " su salario mensual va a ser de ",salariot " pesos " 
	SiNo
		Si h > 180 Entonces
			salariot <- salario*(h*0.5)
			Escribir salariot " su salario mensual va a ser de ",salariot " pesos "
		Fin Si
	Fin Si
	
	
FinAlgoritmo
