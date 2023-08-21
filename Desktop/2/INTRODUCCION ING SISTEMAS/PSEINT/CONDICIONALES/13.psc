Algoritmo VALORCOMPRA
	//Entradas: Valos de la compra.
	//En los almacenes es muy común que en ciertas épocas del año se realicen descuentos en las compras. 
    //En ocasiones dichos descuentos pasan de un determinado monto.  Elabore un programa que permita calcular 
    //el descuento y el total a pagar a partir de las siguientes políticas previstas para las compras: Si el valor 
	//de la compra es menor de $100.000 no tiene descuento. Si el valor de la compra esta entre $100.000 y $200.000 
	//el descuento que aplica es del 5% y Si el valor de compra es mayor que $200.000 el descuento que aplica es del 10%.
	//Analisis: Con la ayuda de un condicional, encontraremos el descuento y el total a pagar de una compra, dependiendo el 
	//descuento de que tan trande o no fue el valor de la compra.
	//Salidas: Descuento y el Total a pagar.
	
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
