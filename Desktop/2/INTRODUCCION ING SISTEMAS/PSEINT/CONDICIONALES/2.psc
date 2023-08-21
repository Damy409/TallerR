Algoritmo ANGULOS
	//Entradas: La medida de un angulo.
	//Determinar el tipo de ángulo según su medida: ( Agudo si es menor a 90°,  
	//Recto si es igual a 90°,  Obtuso si es mayor que 90° pero menor que 180°,
	//Llano si es igual a 180°, Cóncavo si es mayor que 180° pero menor que 360° y Completo si es igual a 360°).
	//Analisis: Con la ayuda de el condicional Si Entonces, identificaremos los 
	//diferentes tipos de angulos, dependiendo de la medida de el angulo que digite el usuario.
	//Salida:Angulo agudo, Angulo Recto, Angulo Obtuso, Angulo LLano, Angulo concavo, Angulo completo.
	
	Definir ang Como Entero
	
	Escribir  "digite un angulo"
	leer ang
	
	Si ang < 90  Entonces
		Escribir " angulo agudo"
	SiNo
		si ang = 90 Entonces
			Escribir " angulo recto"
		SiNo
			si ang > 90 & ang < 180 Entonces
				Escribir " angulo obtuso "
			SiNo
				si ang = 180 Entonces
					Escribir " angulo llano"
				SiNo
					si ang>180 & ang > 360 Entonces
						Escribir  " angulo concavo"
					sino
						si ang = 360 Entonces
							Escribir " angulo completo"
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	Fin Si
FinAlgoritmo
