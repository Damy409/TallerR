Algoritmo tiposdeltriangulosegunellado
	
	Definir lado1, lado2, lado3 Como Entero
	
	Escribir " digite el primer lado del triangulo"
	leer lado1
	Escribir " digite el segundo lado del triangulo"
	leer lado2
	Escribir " digite el tercer lado del triangulo"
	leer lado3
	
	Si lado1 = lado2 & lado1 = lado3 Entonces
		Escribir " triangulo equilatero"
	Fin Si
	
	Si lado1= lado2 & lado2<> lado3 Entonces
		Escribir "triangulo isoceles" 
	SiNo
		si lado1 = lado3 & lado1 <> lado2 Entonces
			Escribir " triangulo isoceles"
		SiNo
			si lado2 = lado3 & lado1 <> lado3 Entonces
				Escribir " triangulo isoceles "
			FinSi
		FinSi
	Fin Si
	
	si lado1 <> lado2 & lado1 <> lado3 & lado2 <> lado3 Entonces
		Escribir " triangulo escaleno" 
 	FinSi
	
FinAlgoritmo
