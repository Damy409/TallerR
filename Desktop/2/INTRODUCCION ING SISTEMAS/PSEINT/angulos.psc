Algoritmo angulos
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
