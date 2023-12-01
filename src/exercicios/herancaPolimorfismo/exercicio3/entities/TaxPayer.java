package exercicios.herancaPolimorfismo.exercicio3.entities;

public abstract class TaxPayer {
    
    private String name;
    private Double AnualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        AnualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return AnualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        AnualIncome = anualIncome;
    }

    public abstract Double taxesPaid();

    

}
