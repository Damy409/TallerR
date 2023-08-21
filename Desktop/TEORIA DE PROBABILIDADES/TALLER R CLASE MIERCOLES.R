
library(readr)
Pokemon <- read_csv("C:/Users/gomit/Downloads/Pokemon.csv")
View(Pokemon)

###Generation to character
Pokemon$Generation = as.character(Pokemon$Generation)
class(Pokemon$Generation)

##### Tablas de frecuencia (table)
table(Pokemon$`Type 1`)
### Sacar el porcentaje de una tabla de frecuencia
prop.table(table(Pokemon$`Type 1`))*100

tabla_relativa = as.data.frame(prop.table(table(Pokemon$`Type 1`))*100)

###Tabla Frecuencia absoluta
tabla_absoluta = as.data.frame(table(Pokemon$`Type 1`))

#### Se une todas las tablas en una sola, pegando la relativa en la absoluta

tabla_absoluta$relativa = tabla_relativa$Freq

######## Distribucion de Frecuencias
install.packages("agricolae")

library(agricolae)

hist(Pokemon$Total)

ditribucion_frecuencias = table.freq(hist(Pokemon$Total))


### Media
mean(Pokemon$Attack) ### Es el promedio de la media

### Mediana 
median(Pokemon$Attack)

### Moda

mode1 <- function(x) {
  return(as.numeric(names(which.max(table(x)))))
}

mode1(Pokemon$Attack)
