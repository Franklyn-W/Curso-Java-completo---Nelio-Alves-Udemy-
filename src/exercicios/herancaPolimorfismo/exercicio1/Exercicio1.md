# Exercicio 1

Uma empresa possui funcionários próprios e terceirizados.
Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizado
possuem ainda uma despesa adicional.

O pagamento dos funcionários corresponde ao valor da hora
multiplicado pelas horas trabalhadas, sendo que os
funcionários terceirizados ainda recebem um bônus
correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N
fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

Construa o programa conforme projeto ao lado.


| Classe Funcionario |
|-|
|- nome : String|
|- horas : Integer|
|- valorPorHora : Double|
|+ pagamento() : Double|


| Classe FuncionarioTerceirizado extend Funcionario|
|-|
|- cobrançaAdicional : Double|

### Exemplo de entradas e saidas

Quantidade funcionarios: **3**  
Dados do 1° funcionario:  
Terceirizado (s/n): **n**  
Nome: **Alex**  
Horas trabalhadas: **50**  
Valor da hora trablhada: **20**  
Dados do 2° funcionario:  
Terceirizado (s/n): **s**
Nome: **Bob**  
Horas trabalhadas: **100**  
Valor da hora trablhada: **15**  
Tarifa do terceirizado: **200**  
Dados do 3° funcionario:  
Terceirizado (s/n): **n**  
Nome: **Maria**  
Horas trabalhadas: **60**  
Valor da hora trablhada: **20**  

Pagamentos
Alex - $1000,00  
Bob - $1720,00  
Maria - $1200,00  
