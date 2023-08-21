Algoritmo hamburguesasDamy
	Definir hamburguesa, numadd, total, totalD, p Como Entero
	Definir adicion, propina Como Caracter
	Definir pago, cambio Como Real
	Definir continuar Como Caracter
	Escribir " Digite el numero dependiendo de la Hamburguesa que desea "
	Escribir " 1) Sencilla "
	Escribir " 2) Doble "
	Escribir " 3) triple "
	leer hamburguesa
	
	Segun hamburguesa Hacer
		1:
			Escribir " El costo de su hamburguesa es de 10.000 "
			hamburguesa <- 10000
		2:
			Escribir " El costo de su hamburguesa es de 15.000 "
			hamburguesa <- 15000
		3:
			Escribir " El costo de su hamburguesa es de 20.000 "
			hamburguesa <- 20000
		De Otro Modo:
			Escribir " ERROR "
	Fin Segun
	
	Escribir " Desea adicionarle algun tipo de ingrediente "
	leer adicion 
	
	Repetir
		
		Si adicion = "si" Entonces
			Escribir "Digite el numero dependiendo del ingrediente que desea agregar"
			Escribir "1) Queso"
			Escribir "2) Pepinillos"
			Escribir "3) Tocineta"
			leer numadd
			Segun numadd Hacer
				1:
					Escribir " La adicion tiene un costo de 2.000 "
					numadd <- 2000
					total <- numadd + hamburguesa
					Escribir " El total de su compra seria de ", total
				2:
					Escribir " La adicion tiene un costo de 1.000 "
					numadd <- 1000
					total <- numadd + hamburguesa
					Escribir " El total de su compra seria de ", total
				3:
					Escribir " La adicion tiene un costo de 3.000 "
					numadd <- 3000
					total <- numadd + hamburguesa
					Escribir " El total de su compra seria de ", total
				De Otro Modo:
					Escribir " El total de su factura se mantiene segun el precio de hamburguesa"
			Fin Segun
		SiNo
			total <- hamburguesa
			Escribir " El total de su compra es de ", hamburguesa
		Fin Si
		
		Escribir "¿Desea adicionar otro ingrediente? (Si=s, No=n)"
		leer continuar
		
	Hasta Que continuar = "n" o continuar = "N"
	
	
	Escribir "¿Desea adicionar propina?"
	leer propina
	
	Si propina = "si" Entonces
		p <- total * 0.10
		Escribir " La propina a pagar es de ", p
		totalD <- p + total
		Escribir " El total a pagar seria de ", totalD
		Escribir " Digite con cuanto pagara la cuenta "
		leer pago
		cambio <- pago - totald
		Escribir " El cambio a devolver es de ", cambio
	SiNo
		Escribir " El total de su compra es de ", total
		Escribir " Digite con cuanto pagara la cuenta "
		leer pago
		cambio <- pago - total
		Escribir " El cambio a devolver es de ", cambio
	Fin Si
	
FinAlgoritmo
