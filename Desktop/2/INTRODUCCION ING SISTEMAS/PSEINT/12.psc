Algoritmo 12
	definir ingresos, preciocasa Como Entero
	definir cuotainicial, cuotamensual Como real
	
	Escribir "Digite valor de la casa"
	leer preciocasa
	Escribir "Digite sus ingresos"
	leer ingresos
	
	Si ingresos<1000000 Entonces
		cuotainicial<-0.15*preciocasa
		cuotamensual<-(preciocasa-cuotainicial)/120
		Escribir "la cuota inicial es de ",cuotainicial
		Escribir "Los pagos mensuales a pagar son de ",cuotamensual
	SiNo
		cuotainicial<-0.3*preciocasa
		cuotamensual<-(preciocasa-cuotainicial)/(7*12)
		Escribir "la cuota inicial es de ", cuotainicial
		Escribir "Los pagos mensuales a pagar son de ",cuotamensual
		
	Fin Si
	
FinAlgoritmo
