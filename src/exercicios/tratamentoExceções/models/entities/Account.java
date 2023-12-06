package exercicios.tratamentoExceções.models.entities;

import exercicios.tratamentoExceções.models.exceptions.DomainException;

public class Account {

    private Integer numberAccount;
    private String holderAccount;
    private Double balanceAccount;
    private Double withdrawLimitAccount;

    public Account(Integer numberAccount, String holderAccount, Double balanceAccount, Double withdrawLimitAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        this.balanceAccount = balanceAccount;
        this.withdrawLimitAccount = withdrawLimitAccount;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public Double getBalanceAccount() {
        return balanceAccount;
    }

    public Double getWithdrawLimitAccount() {
        return withdrawLimitAccount;
    }

    public void Deposit(Double amount) {
        balanceAccount += amount;
    }

    public void Withdraw(Double amount) throws DomainException {

        if (amount > withdrawLimitAccount) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balanceAccount) {
            throw new DomainException("Withdraw error: The amount exceeds balance");
        }

        balanceAccount -= amount;
    }
}
