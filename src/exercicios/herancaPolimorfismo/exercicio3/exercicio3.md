# Exercício sobre classes e métodos abstratos

Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica, e depois mostrar o valore do imposto pago por cada uma. bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde.   
Os dados de pessoa jurídica são: nome, renda anual, e número de funcionários.  
As regras para cálculo de impostos são as seguintes:

#### Pessoa física: 
* Pessoas cuja renda foi abaixo de 20.000,00 pagam 15% de imposto.
* Pessoas com renda de 20.000,00 em diante pagam 25% de imposto.
* Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.

**Exemplo:** Uma pessoa cuja renda foi de 50.000,00 e teve 2.000,00 em gastos de saúde, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11.500,00

#### Pessoa jurídica
* Pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.

**Exemplo:** Uma empresa cuja renda foi de 400.000,00 e possui 25 funcionários, o imposto fica: 400000 * 14% = 56.000,00

## Entradas e saídas esperadas

Enter the number of tax payers: <font color="red"> **3** </font>  
**Tax payer #1 data:**  
Individual or company (i/c)? <font color="red"> **i** </font>  
Name: <font color="red"> **Alex** </font>  
Anual income: <font color="red"> **50000,00** </font>  
Heath expenditures: <font color="red"> **2000,00** </font>  
**Tax payer #2 data**  
Individual or company (i/c)? <font color="red"> **c** </font>  
Name: <font color="red"> **SoftTech** </font>  
Anual income: <font color="red"> **400000,00** </font>  
Number of employees: <font color="red"> **25** </font>  
**Tax payer #3 data:**  
Individual or company (i/c)? <font color="red"> **i** </font>  
Name: <font color="red"> **Bob** </font>  
Anual income: <font color="red"> **120000,00** </font>  
Heath expenditures: <font color="red"> **1000,00** </font>  

TAXES PAID:
Alex: $ 11500,00  
SoftTech: $ 56000,00  
bob: $ 29500,00

TOTAL TAXES: $ 97000,00