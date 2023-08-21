Algoritmo Unidimensional
	
	//Entradas: Tamaño del arreglo, edad, dato que el usuario desea buscar, dato que el usuario desea buscar para remplazarlo.
	
	//Analisis:Solicitamos al usuario que digite el tamaño que va a tomar el arreglo, y lo dimensionamos, segun sea el numero que digite, con 
	//la estructura repititiva (Para), le pedimos al usuario que digite las edades, definiendo a (i <- 1), para que cada edad que sea registrada
	//vaya tomando una poscion en el arreglo, para asi mostrar esto con ayuda de otro para. Luego le pedimos al usuario que digite el dato que desea 
	//buscar, utilizamos la misma estructura repetitiva y le adicionamos un condicional (Si,Entonces), para saber si el dato que fue ingresado, se 
	//encuentra en el arreglo o no, en caso de que no se encuentre se escribira "El dato no se encuentra en el arreglo". Repetimos los pasos anteriores 
	//pero ahora, para remplazar ese dato que el usuario digito, con ayuda de el condicional si entonces, el arreglo podra determinar que datos ingresados
	//son mayores a 18 y asi estos se podran mostrar en pantalla, despues determinamos la suma de todas las edades, el promedio de todas las 
	//edades, el promedio de las edades que son mayores a 18, el porcentaje y saber cual es la edad mayor, la menor y en que posicion se encuentran. Por
	//ultimo ordenamos el arreglo de manera ascendente con el metodo de la burbuja, que es adicionar adentro de un para, otro para.
	
	//Salidas: Elementos que son mayores de edad, suma de todas las edades, promedio de todas las edades, promedio de las edades mayores,
	//porcentaje, cual es la edad mayor, la edad menor y en que posicion se encuentran, el arreglo ordenado de forma ascendente o descendente.
	
	Definir A, n, i, dato, noD, si18, suma, cambio, j Como Entero
	Definir edMa, edMe, pos, posi Como Entero
	Definir prom, promedio Como Real
	
	//Definir el tamaño del arreglo
	Escribir "Digite el tamaño del arreglo"
	leer n 
	n <- n +1
	Dimension A[n]
	
	//LLenar el arreglo 
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		Escribir "Digite la edad"
		leer A[i]
	Fin Para
	
	//Mostrar el contenido del arreglo 
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		Mostrar i ". " A[i]
	Fin Para
	
	//Buscar un dato del arreglo 
	Escribir "Digite el dato que desea buscar"
	leer dato
	
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		
		Si dato = A[i] Entonces
			Escribir " El dato " dato " se encuentra en la posicion " i
		SiNo
			noD = noD + 1
		Fin Si
		
	Fin Para
	
	Si noD = n-1 Entonces
		Escribir "El dato no se encuentra en el arreglo"
	Fin Si
	
	//Reemplazar un dato en el arreglo 
	
	noD = 0
	
	Escribir "Digite el dato que desea buscar para reemplazarlo"
	leer dato
	
	Para i <- 1 Hasta n-1 Con Paso 1 Hacer
		
		Si dato = A[i] Entonces
			Escribir " El dato " dato " esta en la posicion " i
			Escribir "¿Porque dato desea reemplazarlo?"
			Leer A[i]
		SiNo
			noD <- noD + 1
		Fin Si
	Fin Para
	
	Si noD = n - 1 Entonces
		Escribir "El dato no se encuentra en el arreglo"
	Fin Si
	
	Para i <- 1 Hasta n-1 Con Paso 1 Hacer
		Mostrar A[i]
	Fin Para
	
	//Contar los elementos del arreglo que cumplen una condicion determinada, (Cuantos son mayores de edad)
	
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		
		Si A[i] >= 18 Entonces
			si18 <- si18 + 1
			//Calcular sumatoria  
			suma <- suma + A[i]
			//Calcular promedio
			promedio <- (promedio + A[i])
		Fin Si
		
	Fin Para
	
	Mostrar "Los elementos que son mayores de edad son: " si18
	Mostrar "La sumatoria de los elementos que son mayores de edad es: " suma
	
	//Promedio de todas las edades
	prom <- prom / n 
	Mostrar "El promedio de todas las edades dentro del arreglo es de: " prom 
	
	//Promedio de las edades mayores de 18
	promedio <- (promedio / si18)
	Mostrar "EL promedio de las edades mayores dentro del arreglo es de: " promedio 
		
	//Porcentaje de los elementos mayores a 18
	porcentaje <- n / ( si18 * 100 )
	Mostrar "El porcentaje de los elementos mayores de edad es de: " porcentaje "%"
	
	//Determinar cual es el elemento de mayor y menor valor y en que posicion se encuentran
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		Si i = 1 Entonces
			edMa <- A[i]
			edMe <- A[i]
			pos <- i
			posi <- i
		SiNo
			Si edMa > A[i] Entonces
				edMa <- A[i]
				pos <- i
			Fin Si
			Si edMe < A[i] Entonces
				edMe <- A[i]
				posi <- i
			Fin Si
		Fin Si
	Fin Para
	
	Mostrar "La edad mayor es " edMa " y se encuentra en la posicion " pos
	Mostrar "La edad menor es " edMe " y se encuentra en la posicion " posi
	
	//Ordenar el arreglo en forma ascendente o descendente, mostrando al final como queda
	//el arreglo ordenado.
	
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		Para j <- 1 Hasta n - 1 Con Paso 1 Hacer
			Si j <> n - 1 Entonces
				Si A[j] > A[j+1] Entonces
					cambio <- A[j]
					A[j] <- A[j+1]
					A[j+1] <- cambio
				Fin Si
			Fin Si
		Fin Para
	Fin Para
	
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		Mostrar i ". " A[i]
	Fin Para
	
FinAlgoritmo
