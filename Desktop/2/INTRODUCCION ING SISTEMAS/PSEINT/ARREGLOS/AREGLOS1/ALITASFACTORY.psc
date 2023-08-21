Algoritmo ALITASFACTORY
	Definir pedido, mesa, menu Como Caracter
	Definir A, i, n, numproductos, orden Como Entero
	Definir menus Como Entero
	Dimension A[10]
	
	Escribir "Bienvenido al sistema de Alitas Factory" 
	Escribir " ¿Desea ver el menu? "
	Leer menu 
	Si menu = "si" Entonces
		Escribir " Aqui esta "
		Escribir "1) Hamburguesa"
		Escribir "2) Pizza" 
		Escribir "3) Salchipapa"
		
		Escribir "¿Despues de haber visto nuestro menu desea ordenar?"
		Leer pedido 
		
		
		Si pedido = "si" Entonces
			Escribir "¿Que desea ordenar?"
			leer orden 
			Segun orden Hacer 
				1:
					Escribir "Hamburguesa"
					Si orden = 1 Entonces
						Escribir " ¿Que combo de nuestra hamburguesa desea llevar? "
						Escribir " Tenemos 2 "
						Escribir "1) Combo clasico"
						Escribir "2) Combo doble"
						leer orden
						Si orden = 1 Entonces
							Escribir "Tiene un costo de 10000"
						SiNo
							Escribir "Tiene un costo de 15000"
						Fin Si
					Fin Si
				2:
					Escribir "Pizza"
					Si orden = 2 Entonces
						Escribir "Tenemos dos tipos de pizzas"
						Escribir "1)Hawayaina"
						Escribir "2)Pollo"
						Escribir "¿Cual desea llevar"
						leer orden
						Si orden = 1 Entonces
							Escribir "La porcion tiene un costo de 5000"
						SiNo
							Escribir "La porcion tiene un costo de 6000"
						Fin Si
					Fin Si
				3:
					Escribir "Salchipapa"
					Si orden = 3 Entonces
						Escribir "Tenemos dos tipos de salchipapa"
						Escribir "1)Sencilla"
						Escribir "2)Doble"
						Escribir "¿Cual desea llevar?"
						leer orden
						Si orden = 1 Entonces
							Escribir "Tiene un costo de 8000"
						SiNo
							Escribir "Tiene un costo de 10000"
						Fin Si
					Fin Si
			Fin Segun
		SiNo
			Escribir "Esta bien, fue un gusto atenderlos"
		Fin Si
	
	SiNo
		Escribir "Fue un gusto atenderlos, vuelva pronto"
	Fin Si

	
	
FinAlgoritmo
