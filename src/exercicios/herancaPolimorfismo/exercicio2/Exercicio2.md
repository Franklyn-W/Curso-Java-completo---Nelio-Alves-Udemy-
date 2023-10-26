# Exercicio 2

Fazer um programa para ler os dados de N
produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos
importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação.

Estes dados específicos devem ser
acrescentados na etiqueta de preço conforme exemplo. 
Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.

Implementar o programa conforme o projeto abaixo

| Classe Produto             | Classe ProdutoImportado    | Classe ProdutoUsado        |
| -------------------------- | -------------------------- | -------------------------- |
| - nome : String            | - txAlfandega : Double     | - dtFabricacao : Date      |
| - preco : Double           | <center>--</center>        | <center>--</center>        |
| + etiquetaProduto : String | + etiquetaProduto : String | + etiquetaProduto : String |
| <center>--</center>        | + precoFinal : Double      | <center>--</center>        |


### Exemplo de entradas e saidas

Informe a quantidade de produtos: **3**  
Produto 1:  
Novo, Usado ou Importado (N/U/I)? **I**  
Nome: **Tablet**  
Preço: **260,0**  
Taxa alfandegaria: **20,0**  
Produto 2:  
Novo, Usado ou Importado (N/U/I)? **N**  
Nome: **Notebook**  
Preço: **1100,0**  
Produto 3:  
Novo, Usado ou Importado (N/U/I)? **u**  
Nome: **Iphone**  
Preço: **400,0**  
Data de fabricação (dd/mm/aaaa): **15/03/2017**  

Etiqueta dos produtos:  
Tablet $ 280,00 (Taxa alfandegaria: $ 20,00)  
Notebook $ 1100,00  
Iphone (usado) $ 400,00 (Data de fabricação: 15/03/2017)  



|[DecimalFormat1](https://jenkov.com/tutorials/java-internationalization/decimalformat.html)|[DecimalFormat2](https://receitasdecodigo.com.br/java/numberformat-ou-decimalformat-formatar-numeros-reais-em-java)|[DecimalFormat3](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/text/DecimalFormat.html, "Documentação Oficial")|
|-|-|-|


