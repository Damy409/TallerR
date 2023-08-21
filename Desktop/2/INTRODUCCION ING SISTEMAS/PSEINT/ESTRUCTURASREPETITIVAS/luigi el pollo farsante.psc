 	Algoritmo luigi
		
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
		
		promGC = contC / cont 
		promGM = contM / cont
		califFC = califFC / contF
		califFM = califFM / contF
		califMC = califMC / contMS
		califMM = califMM / contMS
		
		
		Escribir "La cantidad de clientes encuestados fue de: " cont
		Escribir "La cantidad de clientes cuya clasificación fue menor a 3 es de: " contT
		Escribir "El promedio general de la calificación de la comida es: " promGC
		Escribir "El promedio general de la calificación del servicio de meseros es: " promGM 
		Escribir "El promedio de la calificacion de los meseros del genero femenino es:" califFM
		Escribir "El promedio de la calificacion de la comida del genero femenino es: " califFC 
		Escribir "El promedio de la calificacion de los meseros del genero masculino es:" califMM
		Escribir "El promedio de la calificacion de la comida del genero masculino es: " califMC 
		Escribir "Números telefonicos de los clientes insatisfechos: "
		para i<-1 hasta contT
			Mostrar a_numeros[i]
		FinPara
		
		
FinAlgoritmo


