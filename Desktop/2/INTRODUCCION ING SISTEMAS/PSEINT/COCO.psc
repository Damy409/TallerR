Algoritmo COCO
	
	Definir edad, seg, op Como Real
	Definir sexo Como Caracter
	Escribir "Digite su edad"
	leer edad
	Escribir "Digite su sexo"
	leer sexo
	Escribir "Digite los segundos aereobicos"
	leer seg
	
	Si sexo = "femenino" Entonces
		op<-(210 - edad)/10
		Escribir op
	SiNo
		Si sexo = "masculino" Entonces
			op<-(210-edad)/10
			Escribir op
		Fin Si
	Fin Si
	
FinAlgoritmo
