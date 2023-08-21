Algoritmo 13
	
	Definir vc  Como Entero
	definir descuento, totalapagar Como Real
	
	Escribir "Digite el valor de la compra"
	leer vc
	
	Si vc<100000 Entonces
		Escribir "Producto sin descuento"
	SiNo
		Si vc>=100000 & vc<=200000 Entonces
			descuento<-vc*0.05
			totalapagar<-vc-descuento
			Escribir "el descuento es de ", descuento
			Escribir "el total a pagar es de ", totalapagar
		SiNo
			Si vc>200000 Entonces
				descuento<-vc*0.1
				totalapagar<-vc-descuento
				Escribir "el descuento es de ", descuento
				Escribir "el total a pagar es de ",totalapagar
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
