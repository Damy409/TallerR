Proceso ejemplo1 
	//dados dos numeros, mostrar la suma, resta, division y multiplicaciom de ambos.
	//entradas:num1,num2 Entero
	//salidas:resulsuma, resulresta,resulMulti, resulDiv, Real
	//analisis:Pedir los dos numeros, realizar las operaciones y mostrar los resultados.
	Definir num1,num2 Como Entero 
	Definir resulSuma, resulResta, resulMulti, resulDiv Como Real
	
	//pedir los dos numeros
	
	Escribir "Digite el primer numero"
	Leer num1 
	Escribir "Digite el segundo numero"
	leer num2
	//Realizar las operaciones 
	
	resulSuma<- num1+num2
	resulResta<- num1-num2
	resulMulti<-num1*num2
	resulDiv<-num1/num2
	
	//mostrar resultados
	
	Escribir num1 "+" num2 "=" resulSuma
	escribir num1 "-" num2 "=" resulResta
	Escribir num1 "*" num2 "=" resulMulti
	Escribir num1 "/" num2 "=" resulDiv
	
FinProceso
