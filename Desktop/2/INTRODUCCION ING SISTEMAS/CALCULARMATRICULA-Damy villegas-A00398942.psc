Algoritmo calcularMatricula
	//Entradas: nivelg, estrato, nhermanos Como Entero
	//Promp, matricula Como Real
	//Salidas: matriculaD, PromD, EstD Como Real
	//Analisis: Se pide el nivel al que se quiere ingresar y se determina el valor base de la matricula. Si el nivel es de básica o media se solicitará
	// el promedio del periodo anterior para calcular el primer descuento a ser aplicado. Luego se pide el estrato y el numero de hermanos para determinar
	// el segundo descuento, teniendo en cuenta que los estrato 6 no tienen derecho a este segundo descuento.
	
	Definir numH, nivel, estrato Como Entero
	Definir descuento, promedio, finM, desprom, valorm, desEstrato Como Real
	
	
	Escribir "Ingrese el numero dependiendo al grado que desea ingresar"
	Escribir "1) Inicial "
	Escribir "2) Preescolar "
	Escribir "3) Básica "
	Escribir "4) Media "
	Leer nivel
	
	segun nivel hacer
		1: 
			Escribir "El valor de la matricula es de: 500.000"
			valorm <- 500000
		2: 
			Escribir "El valor de la matricula es de: 700.000"
			valorm <- 700000
		3: 
			Escribir "El valor de la matricula es de: 650.000"
			valorm <- 650000
		4: 
			Escribir "El valor de la matricula es de: 680.000"
			valorm <- 680000
	FinSegun
	
	Si valorm = 650000 o valorm = 680000
		Entonces Escribir "Digite el promedio de sus notas del anterior año"
		Leer promedio
	FinSi
	
	Si promedio >= 4.5 
		desprom<- valorm * 0.20
	SiNo
		Si promedio < 4.5 y promedio >= 4
			desprom<- valorm * 0.15
		SiNo
			si promedio < 4 Entonces
				desprom<- 0
			FinSi
		FinSi
	FinSi
	
	Escribir "¿Cual es su estrato socio-economico?"
	Leer estrato
	
	Escribir " ¿Cuantos hermanos tiene? "
	Leer numH
	
	si numH <= 3 Entonces
		Segun estrato  Hacer
			
			1,2: desEstrato<- valorm *(numH * 0.10)
				
			3: desEstrato<- valorm *(numH * 0.05)
				
			4,5: desEstrato<- valorm *(numH * 0.02)
				
			6: desEstrato<- 0
				
				
		Fin Segun
		
	SiNo
		Si numH > 3 Entonces
			
			segun estrato hacer
				
				1,2: desEstrato<- valorm * (3 * 0.10)
					
				3: desEstrato<- valorm * (3* 0.05)
					
				4,5: desEstrato<- valorm * (3*0.02)
					
				6: desEstrato<- 0
			FinSegun
			
		FinSi
		
	FinSi
	
	
	finM<- valorm - desEstrato - desprom
	descuento<- desEstrato + desprom
	
	Escribir "El valor total de la matricula es de: ", finM
	Escribir "El descuento total es de: ", descuento
	
FinAlgoritmo
