x = 2
y = 2
x*y

install.packages("ggplot2")
library(ggplot2)
library(ggplot2)

library(readr)
bank_full <- read_csv("C:/Users/gomit/Downloads/bank-full.csv")
library(readr)
bank_full <- read_delim("C:/Users/gomit/Downloads/bank-full.csv", 
                        delim = ";", escape_double = FALSE, trim_ws = TRUE)
View(bank_full)

library(readxl)
Lista_de_clientes_con_nombre_y_direccion <- read_excel("C:/Users/gomit/Downloads/Lista-de-clientes-con-nombre-y-direccion.xlsx")
View(Lista_de_clientes_con_nombre_y_direccion)

###PRIMERA FORMA

str(bank_full)

###SEGUNDA FORMA

class(bank_full$age)

bank_full$day2 = as.character(bank_full$day)

class(bank_full$day2)

bank_full$day3 = as.numeric(bank_full$day)

class(bank_full$day3)


######### FACTOR A NUMERIC

bank_full$age_sim = as.factor(bank_full$age)
class(bank_full$age_sim)

bank_full$age_sim2 = as.numeric(bank_full$age)
class(bank_full$age_sim2)


