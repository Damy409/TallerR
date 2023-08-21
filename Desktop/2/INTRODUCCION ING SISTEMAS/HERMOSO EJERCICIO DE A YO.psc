Algoritmo CALCULARMATRICULA 
	
	Definir nivel, estrato, numH Como Entero
	Definir promNotas, valorBase, valorm, descuento Como Real
	
	
	Escribir "Ingrese el numero segun al grado que desea ingresar"
	Escribir "1) Nivel inicial"
	Escribir "2) Nivel preescolar"
	Escribir "3) Nivel Basica"
	Escribir "4) Nivel media"
	leer nivel 
	
	Segun nivel Hacer
		1:
			Escribir " El valor base de la matricula es de 500.000"
			valorm<-500000
		2:
			Escribir " El valor base de la matricula es de 700.000"
			valorm<-700000
		3:
			Escribir " El valor base de la matricula es de 650.000"
			valorm<-650000
			Escribir " Digite el promedio de notas del anterior año"
			leer promNotas
			Si promNotas >= 4.5 Entonces
				descuento<- valorm * 0.2
				Escribir "El descuento es de:",descuento
			SiNo
				Si promNotas < 4.5 & promNotas >= 4 Entonces
					descuento<- valorm * 0.15
					Escribir "El descuento es de: ",descuento
				SiNo
					Si promNotas < 4 Entonces
						Escribir "No hay descuento"
					Fin Si
					
				Fin Si
			Fin Si
			
		De Otro Modo:
			Escribir " El valor base de la matricula es de 680.000"
			valorm<-680000
			Escribir " Digite el promedio de notas del anterior año"
			leer promNotas
			
			Si promNotas >= 4.5 Entonces
				descuento<-valorm * 0.2
				Escribir " El descuento es de: ",descuento
			SiNo
				Si promNotas < 4.5 & promNotas >= 4 Entonces
					descuento<- valorm * 0.15
					Escribir "El descuento es de:", descuento
				SiNo
					Si promNotas < 4 Entonces
						Escribir "No hay descuento"
					Fin Si
				Fin Si
			Fin Si
	Fin Segun
	
	Escribir " Digite el numero de hermanos que tiene en el colegio"
	leer numH
	Escribir " ¿ Cual es su estrato socio-economico ? "
	leer estrato
	
	Si numH <= 3 Entonces
		Segun estrato Hacer
			1,2:
				descuento <- valorm *(numH*0.10)
				Escribir " El descuento es de: ", descuento 
			3:
				descuento <- valorm *(numH*0.05)
				Escribir " El descuento es de: ", descuento 
			4,5:
				descuento <- valorm* (numH*0.02)
				Escribir " El descuento es de: ", descuento
			6:
				Escribir " No hay descuento"
		Fin Segun
	SiNo
		Segun estrato Hacer
			1,2:
				descuento <- valorm * (3*0.10)
				Escribir " El descuento es de: ", descuento
			3:
				descuento <- valorm *(3*0.05)
				Escribir " El descuento es de: ", descuento
			4,5:
				descuento <- valorm* (3*0.02)
				Escribir " El descuento es de: ", descuento
			De Otro Modo:
				Escribir " No hay descuento "
		Fin Segun
	Fin Si
	
	
	
FinAlgoritmo