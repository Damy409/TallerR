Algoritmo compañiavendedores
	//Entrada: ventas, trab
	//Se le solicita al usuario que digite el total de ventas de un trabajador 
	//A partir de las ventas de obtiene la comision que es el total de ventas por el 9%
	//Y el pago seria el valor del sueldo que es 500000 mas la comision 
	//Despues agregamos un contador, parqa saber el numero de trabajadores
	//Y con esto saber a cuantos se les pago mas de 800000
	//Por ultimo preguntamos si quiere ingresar otro trabajador
	//Cuando ingrese "n" o "N" se finaliza el Algoritmo y mostramos el pago total de vendedores
	//Y a quienes se les pago mas de 800000
	//Salidas: pago, cuantos trabajadores se les pago
	Definir ventas, pago, trab, trab800 Como Real
	Definir continuar Como Caracter
	
	Repetir
		Escribir " Digite el total de ventas del vendedor " 
		leer ventas 
		
		pago <- 500000 + (ventas*0.09)
		
		trab <- trab + 1
		
		Mostrar " Se le pago al vendedor " pago
		
		Si pago > 800000 Entonces
			trab800 <- trab800 + 1
		Fin Si
		
		Escribir " ¿Desea ingresar otro vendedor? (Si=s, No=n) "
		
	Hasta Que continuar = "N" o continuar = "n"
	
	Mostrar " Se le pago a " trab " vendedor(es)"
	Mostrar " Hubieron " trab800 " vendedor(es) a los que se les pago mas de 800000" 
FinAlgoritmo
