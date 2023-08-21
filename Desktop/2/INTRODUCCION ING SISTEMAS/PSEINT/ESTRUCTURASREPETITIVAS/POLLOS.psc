Algoritmo luigi
	
	Definir gen, continuar Como Caracter
	Definir califC, califM, contC, contM, promGC, promGM, califMM, califMC, califFM, califFC Como Real
	Definir tel, cont, contT, contF, contMS Como Entero
	
	Repetir
		
		Escribir "Ingrese su genero (Femenino = F, Masculino = M)"
		Leer gen
		cont <- cont + 1
		
		Si gen = "F" o gen = "f" Entonces
			
			contF <- contF + 1
			
			Escribir "Digite su calificacion de la comida (0-5)"
			Leer califC 
			contC <- contC + califC
			
			
			Escribir "Digite su calificacion de su mesero (0-5)"
			Leer califM
			contM <- contM + califM
			
		SiNo
			Si gen = "M" o gen = "m" Entonces
				
				contMS <- contMS + 1 
				Escribir "Digite su calificacion de la comida (0-5)"
				Leer califC 
				contC <- contC + califC
				
				Escribir "Digite su calificacion de su mesero (0-5)"
				Leer califM
				contM <- contM + califMS
				
			FinSi
		Fin Si
		
		
		Si califC < 3 Entonces
			
			Escribir "Porfavor digite su numero telefonico para conocer su opinion"
			Leer tel
			
		SiNo
			Si califM < 3 Entonces
				
				Escribir "Porfavor digite su numero telefonico para conocer su opinion"
				Leer tel
				contT <- contT + 1
			Fin Si
		Fin Si
		
		Escribir "Desea ingresar otra respuesta (Si = s, No = n)"
		leer continuar
		
	Hasta Que continuar = "n" o continuar = "N"
	
	promGC = contC / cont 
	promGM = contM / cont
	
	Escribir "La cantidad de clientes encuestados fue de: " cont
	Escribir "El promedio general de la calificación de la comida es: " promGC
	Escribir "El promedio general de la calificación del servicio de meseros es: " promGM 
	Escribir "La cantidad de clientes cuya clasificación fue menor a 3 es de: " contT
	
	
	
FinAlgoritmo
