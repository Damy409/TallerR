Algoritmo hamburguesasDamy2
	Definir hamburguesa, numadd, total, totalD, p, q, s, t Como Entero
	Definir adicion, propina, queso, pepinillo, tocineta Como Caracter
	Definir pago, cambio, result Como Real
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
	
	Si adicion = "si" Entonces
		
		Escribir "¿Desea adicionar queso?"
		leer queso
		Si queso = "si" Entonces
			Escribir " La adicion tiene un costo de 2.000 "
			q <- 2000
			total <- q + hamburguesa
		Fin Si
		
		Escribir "¿Desea adicionar pepinillos?"
		leer pepinillo
		
		Si pepinillo = "si" Entonces
			Escribir " La adicion tiene un costo de 1.000 "
			s <- 1000
			total <- s + hamburguesa
		Fin Si
		
		Escribir "¿Desea adicionar tocineta?"
		leer tocineta
		
		Si tocineta = "si" Entonces
			Escribir " La adicion tiene un costo de 3.000 "
			t <- 3000
			total <- t + hamburguesa
		Fin Si
		result <- hamburguesa + t + q + s
		Escribir " El total de su compra es de ", result
	SiNo
		total <- hamburguesa
		Escribir " El total de su compra es de ", hamburguesa
	Fin Si
	
	Escribir "¿Desea adicionar propina?"
	leer propina
	
	Si propina = "si" Entonces
		p <- result * 0.10
		Escribir " La propina a pagar es de ", p
		totalD <- p + result
		Escribir " El total a pagar seria de ", totalD
		Escribir " Digite con cuanto pagara la cuenta "
		leer pago
		cambio <- pago - totald
		Escribir " El cambio a devolver es de ", cambio " pesos"
	SiNo
		Escribir " El total de su compra es de ", result
		Escribir " Digite con cuanto pagara la cuenta "
		leer pago
		cambio <- pago - result
		Escribir " El cambio a devolver es de ", cambio " pesos"
	Fin Si
	
FinAlgoritmo