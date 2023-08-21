Algoritmo Fotografia
	
	//El curso de Fotografía se califica con dos parciales (el primero tiene un peso de 30% y el segundo 35%)
	//una nota de laboratorios (25%) y una nota del trabajo final del curso (10%). 
	//Calcular la nota definitiva de cada uno de los estudiantes para un grupo de n estudiantes.
	//Entrada: estudiante, nota 
	//Salida: porcentaje
	//Analisis: Se pide digitar el nombre del estudiante, la nota de el primer parcial y se calcula el porcentaje 
	//con la nota por el 30%, se pide la nota del segundo parcial y se calcula el porcentaje con la nota por el 35%, nota del laboratorio
	//y se calcula el porcentaje con la nota por el 25%, nota de trabajo final y se calcula el porcentaje con la nota por el 10%
	//Se muestra el nombre del estudiante y la nota definitiva 
	
	Definir nota, porcentaje Como Real
	Definir estudiante, continuar Como Caracter
	
	
	Repetir
		Escribir " Digite el nombre del estudiante "
		Leer estudiante 
		
		Escribir " Digite nota del primer parcial "
		leer nota
		porcentaje = porcentaje + ( nota * 0.3 ) 
		
		Escribir " Digite la nota del segundo parcial "
		leer nota
		porcentaje = porcentaje + ( nota * 0.35 ) 
		
		Escribir " Digite la nota del laboratorio "
		leer nota 
		porcentaje = porcentaje + ( nota * 0.25 ) 
		
		Escribir " Digite la nota del trabajo final del curso "
		leer nota
		porcentaje = porcentaje + ( nota * 0.1 ) 
		
		Escribir " el estudiante " estudiante " saco de nota definitiva " porcentaje
		
		Escribir " Desea añadir otro estudiante (si = s, no = n)"
		leer continuar
		
	Hasta Que continuar = "n" o continuar = "N"
	
FinAlgoritmo