Algoritmo pollo_farzante
	
	//Entradas: genero, calificacion de comida masculino, calificacion de comida femenino, 
	//calificacion de meseros masculino, calificacion de meseros femenino.
	
	//Analisis: Le pedimos al usuario ingresar su genero y la calificacion de (0 - 5) que obtuvo de la comida
	//y de los meseros, si la calificacion fue menor a 3, el sistema le pedira ingresar el numero de telefono, por
	//lo que se considera un cliente insatisfecho, despues preguntamos al usuario si desea ingresar otra respuesta,
	//el ciclo sigue hasta que la respuesta sea igual a "no". Al finalizar el ciclo, se mostraran cada una de las salidas
	//(promedios, cantidad de encuestados y numeros de telefonos) con su respectivo valor, tambien agregamos un arreglo Para 
	//almacenar los numeros telefonicos y mostrarlos al final por dichos numeros, por ultimo realizamos los promedios generales
	//y los promedios por genero.
	
	//Salidas:clientes encuestados, promedio calificacion comida y meseros por genero, promedio de la calificacion de
	//comida y meseros en general, cantidad de clientes con calificacion menor a 3, numeros de telefono de los clientes con
	//calificacion menor a 3.
	
	Definir gen, continuar Como Caracter
		Definir califC, califM, contC, contM, promGC, promGM, califMM, califMC, califFM, califFC Como Real
		Definir tel, cont, contT, contF, contMS Como Entero
		Definir a_numeros Como Entero
		Dimension a_numeros[100]
		i<-1
		Repetir
			
			Escribir "Ingrese su genero (Femenino = F, Masculino = M)"
			Leer gen
			gen<-Mayusculas(gen)
			cont <- cont + 1
			
			Si gen = "F"  Entonces
				
				contF <- contF + 1
				
				Escribir "Digite su calificacion de la comida (0-5)"
				Leer califC 
				contC <- contC + califC
				califFC <- califC + califFC
				
				Escribir "Digite su calificacion de su mesero (0-5)"
				Leer califM
				contM <- contM + califM
				califFM <- califM + califFM
				
			SiNo
				Si gen = "M" Entonces
					
					contMS <- contMS + 1 
					
					Escribir "Digite su calificacion de la comida (0-5)"
					Leer califC 
					contC <- contC + califC
					califMC <- califMC + califC
					
					Escribir "Digite su calificacion de su mesero (0-5)"
					Leer califM
					contM <- contM + califM
					califMM <- califMM + califM
				FinSi
			Fin Si
			
			
			Si califC < 3 o califM < 3 Entonces
				
				contT = contT + 1 
				Escribir "Porfavor digite su numero telefonico para conocer su opinion"
				Leer a_numeros[i]
				i<-i+1
				
			Fin Si
			
			Escribir "Desea ingresar otra respuesta (Si = s, No = n)"
			leer continuar
			
		Hasta Que continuar = "n" o continuar = "N"
		
		//Mostramos la cantidad de clientes
		Escribir "La cantidad de clientes encuestados fue de: " cont
		
		//Mostramos la cantidad de clientes insatisfechos 
		Escribir "La cantidad de clientes cuya clasificación fue menor a 3 es de: " contT
		
		//Mostramos promedio general de la calificacion de comida
		promGC = contC / cont 
		Escribir "El promedio general de la calificación de la comida es: " promGC
		
		//Mostramos promedio general de la calificacion del servicio de meseros 
		promGM = contM / cont
		Escribir "El promedio general de la calificación del servicio de meseros es: " promGM 
		
		//Mostramos el promedio de la calificacion meseros genero femenino
		califFM = califFM / contF
		Escribir "El promedio de la calificacion de los meseros del genero femenino es:" califFM
		
		//Mostramos el promedio de la calificacion de la comida del genero femenino
		califFC = califFC / contF
		Escribir "El promedio de la calificacion de la comida del genero femenino es: " califFC 
		
		//Mostramos el promedio de la calificacion de los meseros del genero masculino 
		califMM = califMM / contMS
		Escribir "El promedio de la calificacion de los meseros del genero masculino es:" califMM
		
		//Mostramos el promedio de la calificaccion de la comida del genero masculino
		califMC = califMC / contMS
		Escribir "El promedio de la calificacion de la comida del genero masculino es: " califMC
		
		//Mostramos los numeros telefonicos de los clientes insatisfechos por medio de un arreglo
		Escribir "Números telefonicos de los clientes insatisfechos: "
		para i<-1 hasta contT
			Mostrar a_numeros[i]
		FinPara
		
FinAlgoritmo


