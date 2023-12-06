# Exercício de fixação - Tratamento de exceções

Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta mesma conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta. Implemente a conta bancária conforme o projeto

| Account                                                                                   |
| ----------------------------------------------------------------------------------------- |
| - number : Integer<br>- holder : String<br>- balance : Double<br>- withdrawLimit : Double |
| + deposit(amount : Double) : void<br>+ withdraw(amount : Double) : void                   |

**Exemplo de entradas e saídas**

Enter account data
Number: <font color="red"> **8021** </font>  
Holder: <font color="red"> **Bob Brown** </font>  
Initial balance: <font color="red"> **500.00** </font>  
Withdraw limit: <font color="red"> **300.00** </font>  

Enter amount for withdraw: <font color="red"> **100.00** </font>
New balance: <font color="red"> **400.00** </font>

---

Enter account data
Number: <font color="red"> **8021** </font>  
Holder: <font color="red"> **Bob Brown** </font>  
Initial balance: <font color="red"> **500.00** </font>  
Withdraw limit: <font color="red"> **300.00** </font>  

Enter amount for withdraw: <font color="red"> **400.00** </font>
Withdraw error: The amount exceeds withdraw limit