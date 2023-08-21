Algoritmo sin_titulo
	Definir A, n, i, dato Como Entero
	Dimension A[1000]
	Repetir
		Escribir "Digite el numero de elementos que tendra el arreglo"
		Leer n 
	Hasta Que n > 0 
	
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Escribir "Digite el elemento ", i 
		Leer A[i]
	FinPara
	
	Escribir "Dato a buscar"
	leer dato 
	i <- 1
	Repetir
		Si dato = A[i] Entonces
			sw <- 1
			pos <- 1 
		FinSi
		i <- i + 1
	Hasta Que sw = 1 o i > n
	Si sw = 1 Entonces
		Escribir " El dato " dato " esta en la posicion " pos
	SiNo
		Escribir " El dato " dato " no esta en el arreglo"
	FinSi
	
	
FinAlgoritmo
