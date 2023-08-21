Algoritmo ExamenClasificatorio
	
	//Para ingresar al curso de Estudio de suelos se realizó un examen clasificatorio.
	//Se tienen los resultados de dicho examen por aspirante (una nota comprendida entre 0.0 y 5.0).
	//Se desea saber cuántos aspirantes aprobaron el examen, cuántos lo perdieron (nota menor que 3.0)
	//y cuál fue el promedio de todo el grupo de aspirantes.No sabemos cuántos aspirantes son,
	//pero sabemos que cuando se quiera indicar que se finalizó el ingreso de notas se digitará un valor negativo.
	//Entrada: result
	//Salida: promedio
	//Analisis: Se pide al usuario que digite la nota del examen, si el resultado de la nota es mayor que 0, no se digitaran mas notas,pero
	//Si el resultado total es mayor que 3 y menor o igual a 0 Entonces se acumulan las notas y se divide por el total,
	//AL final se muestra el promedio
	
	Definir result, promedio, resulAcum Como Real
	Definir aspirantesPas, aspirantesPer Como Entero
	Repetir
		Escribir " Digite su nota del examen, si se desea finalizar digite un numero negativo"
		leer result 
		
		Si result < 0 Entonces
			Escribir " Ya no se digitaran mas notas "
		SiNo
			Si result < 3.0 y result >= 0 Entonces
				aspirantesPer <- aspirantesPer + 1
				resultAcum <- resultAcum + result
			SiNo
				aspirantesPas <- aspirantesPas + 1 
				resultAcum <- resultAcum + result 
			Fin Si
		Fin Si
		
	Hasta Que result < 0 
	
	promedio <- resultAcum / ( aspirantesPer + aspirantesPas)
	mostrar "El promedio de todo el grupo de aspirantes es " promedio
FinAlgoritmo