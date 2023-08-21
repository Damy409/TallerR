Algoritmo NivelContaminacionCarros
	
	//En un centro de diagnóstico automotor de la ciudad de Cali se mide el nivel de contaminación de un automóvil 
	//en una escala de 1 a 100,para poder aprobar la revisión se debe contar con una calificación de al menos 85.
	// El centro recibe un número variable de vehículos al día, de cada vehículo se registra:
	//Marca (1-Mazda, 2-Chevrolet, 3-Renault, 4-Kia, 5-Hyundai)
	//Modelo
	//Placa
	//Calificación obtenida
	
	//Entrada: marca, modelo, placa, calificacion
	//Salida: promedio, porcentajeA, porcentajeDes, marca mas frecuente, marca menos frecuente, numero de vehículos evaluados
	
	//Analisis: Se inicia un ciclo con Repetir, este tendrá la condicion de terminar cuando el usuario no desee ingresar
	//mas autos; dentro del ciclo se pide ´la marca, dependiendo de esta se sumara a cada tipo de marca un 1, para verificar luego
	//cual marca es la mas y menos frecuente, luego se pide el modelo, la placa y la calificacion, la cual tendrá una condicion, en 
	//caso de ser mayor o igual a 85 y menor o igual a 100, se sumará 1 en el contador de vehiculos aprobados y se acumulará esa calificacion 
	//para promediar la calificacion de todos los autos aprobados, por otro lado, si la calificacion es menor a 85, se sumará 1 a los
	//vehiculos no aprobados, se termina el ciclo y se procede con los procesos para encontrar el promedio de las calificaciones de carros 
	//aprobados, con el acumulado de las calificaciones de los vehiculos aprobados sobre el total de autos aprobados
	//el porcentaje de autos aprobados y desaprobados se obtiene multiplicando los vehiculos aprobados/desaprobados por 100 y dividiendo por 
	//el total de vehiculos; y como ultimo punto, para obtener la marca de vehiculo mas frecuente y la menos frecuente se comparan los
	//los contadores que cuentan cuantos carros se ingresaron por marca. 
	
	
	Definir calificacion, marca, modelo, apro, desa, suma, masF, menosF Como Entero
	Definir placa, continuar, marcaG Como Caracter
	Definir promedio, porcentajeA, porcentajeDes Como Real
	
	Repetir
		Escribir " Digite la marca de su vehículo (1=Mazda, 2=Chevrolet, 3=Renault, 4=Kia, 5=Hyundai) "
		Leer marca
		Segun marca Hacer
			1:
				mazda = mazda + 1
			2:
				chevrolet = chevrolet + 1 
			3:
				renault = renault + 1 
			4: 
				kia = kia + 1
			De Otro Modo:
				
				hyundai = hyundai + 1 
		Fin Segun
		
		Escribir " Digite el modelo se su vehículo "
		Leer modelo 
		Escribir " Digite la placa de su vehículo "
		leer placa
		Escribir " Digite la calificacion obtenida "
		Leer calificacion
		
		Si calificacion >= 85 y calificacion <= 100 Entonces
			Escribir " Se aprueba la revision "
			apro = apro +1
			promedio = promedio + calificacion
		SiNo
			Escribir " No se aprueba la revision "
			desa = desa + 1 
		Fin Si
		
		Escribir " ¿Desea agregar otro vehículo? (Si=s, No=n) "
		Leer continuar
		
	Hasta Que continuar = "n" o continuar = "N"
	
	promedio = promedio /  apro 
	Mostrar " El promedio de las calificaciones de los vehículos aprobados es de: " promedio
	porcentajeA = (100 * apro) / (apro + desa)
	Mostrar " El porcentaje de los vehículos aprovados es de: " porcentajeA
	porcentajeDes = (100 * desa) / (apro + desa)
	Mostrar " El porcentaje de los vehículos desaprovados es de: " porcentajeDes
	suma = suma + mazda + chevrolet + renault + kia + hyundai 
	Mostrar " El numero de vehículos que fueron evaluados es de: " suma
	
	masF = mazda
	marcaG = "mazda"
	
	Si masF < chevrolet Entonces
		masF = chevrolet
		marcaG = "chevrolet"
	Fin Si
	Si masF < renault Entonces
		masF = renault
		marcaG = "renault"
	Fin Si
	Si masF < kia Entonces
		masF = kia
		marcaG = "kia"
	Fin Si
	Si masF < hyundai Entonces
		masF = hyundai
		marcaG = "hyundai"
	Fin Si
	
	Mostrar " La marca mas frecuente es: " marcaG
	
	menosF = mazda
	marcaG = "mazda"
	
	Si menosF > chevrolet Entonces
		menosF = chevrolet
		marcaG = "chevrolet"
	Fin Si
	Si menosF > renault Entonces
		menosF = renault
		marcaG = "renault"
	Fin Si
	Si menosF > kia Entonces
		menosF = kia
		marcaG = "kia"
	Fin Si
	Si menosF > hyundai Entonces
		menosF = hyundai
		marcaG = "hyundai"
	Fin Si
	
	Mostrar " La marca menos frecuente es: " marcaG
	
FinAlgoritmo