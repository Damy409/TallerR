Algoritmo OPERARIO
	
	Definir sueldo, sueldon Como Real
	Escribir " digite su sueldo"
	leer sueldo
	
	Si sueldo<= 1000 Entonces
		sueldon<-sueldo*0.10
		sueldo<-sueldo-sueldon
		Escribir "valor total es igual a ",sueldo
		Escribir "Descuento ", sueldon " % "
	SiNo
		Si sueldo>1000 & sueldo<2000 Entonces
			sueldon<-sueldo*0.05
			sueldo<-sueldo-sueldon
			Escribir "valor total es igual a ",sueldo
			Escribir "Descuento ", sueldon " % "
		SiNo
			Si sueldo>2000 Entonces
				sueldon<-sueldo*0.03
				sueldo<-sueldo-sueldon
				Escribir "valor total es igual a ",sueldo
				Escribir "Descuento ",sueldon " % "
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
