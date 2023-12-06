# Criação de exceções personalizadas

### Problema exemplo

Fazer um programa para ler os dados de uma reserva de hotel(número do quarto, data de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras.
- A data de saída deve ser maior que a data de entrada.

| Reservation                                                                  |
| ---------------------------------------------------------------------------- |
| - roomNumber: Integer<br> - checkIn: Date<br>  - checkout: Date              |
| + duration(): Integer<br> + updateDates(checkIn: Date, checkOut: Date): void |

**Exemplo1**

Room number: <font color="red"> **8021** </font>  
Check-in date: (dd/MM/yyyy): <font color="red"> **23/09/2019** </font>  
Check-out date (dd/MM/yyyy): <font color="red"> **26/09/2019** </font>  
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights  

Enter data to update the reservation:  
Check-in date: (dd/MM/yyyy): <font color="red"> **24/09/2019** </font>  
Check-out date (dd/MM/yyyy): <font color="red"> **29/09/2019** </font>  
Reservation: Room 8021, check-in: 24/09/2019, check-out: 29/09/2019, 5 nights

----

Room number: <font color="red"> **8021** </font>  
Check-in date: (dd/MM/yyyy): <font color="red"> **23/09/2019** </font>  
Check-out date (dd/MM/yyyy): <font color="red"> **21/09/2019** </font>  
Erro in reservation: Check-out date must be after check-in date.

----

**Exemplo2**

Room number: <font color="red"> **8021** </font>  
Check-in date: (dd/MM/yyyy): <font color="red"> **23/09/2019** </font>  
Check-out date (dd/MM/yyyy): <font color="red"> **26/09/2019** </font>  
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights  

Enter data to update the reservation:  
Check-in date: (dd/MM/yyyy): <font color="red"> **24/09/2015** </font>  
Check-out date (dd/MM/yyyy): <font color="red"> **29/09/2015** </font>  
Erro in reservation: Reservation dates for updates must be future dates

---

Room number: <font color="red"> **8021** </font>  
Check-in date: (dd/MM/yyyy): <font color="red"> **23/09/2019** </font>  
Check-out date (dd/MM/yyyy): <font color="red"> **26/09/2019** </font>  
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights  

Enter data to update the reservation:  
Check-in date: (dd/MM/yyyy): <font color="red"> **24/09/2020** </font>  
Check-out date (dd/MM/yyyy): <font color="red"> **22/09/2020** </font>  
Erro in reservation: Check-out date must be after check-in date

Existem 3 soluções para esses problemas
* Solução muito ruim: lógica de validação no programa principal
* Solução ruim: método retornando String
* Solução boa: tratamento de exceções

## Resumo da aula

* **Solução muito ruim**: lógica de validação no programa principal
  * Lógica de validação não delegada à reserva

* **Solução ruim**: método retornando String
  * A semântica da operação é prejudicada
      * Retornar string não tem nada haver com atualização de reserva
      * E se a operação tivesse que retornar uma String?
    * Ainda não é possível tratar exceções em construtores
    * Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve erro
    * A lógica fica estruturada em condicionais aninhadas

* **Solução boa**: tratamento de exceções

* Cláusula *throws*: propaga a exceção ao invés de trata-la
* Cláusula *throw*: lança a exceção / "corta" o método

* Exception: compilador obriga a tratar ou propagar o erro
* RunTimeException: compilador não obriga o tratamento

* O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas
* Vantagens:
  * Lógica delegada
  * Construtores podem ter tratamento de exceções
  * Possibilidade de auxílio do compilador (Exception)
  * Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for disparada, a execução é interrompida e cai no bloco *catch* correspondente
  * É possível capturar inclusive outras exceções de sistema