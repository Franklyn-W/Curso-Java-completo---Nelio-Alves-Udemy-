package exercicios.herancaPolimorfismo.exercicio3.entities;

public class Individual extends TaxPayer{
    
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxesPaid() {

        Double taxPaid = 0.0;
        
        if (getAnualIncome() < 20000.00) {
            taxPaid = getAnualIncome()*0.15;
        }else{
            taxPaid = getAnualIncome() * 0.25;
        }

        if (healthExpenditures > 0.0) {
            taxPaid = taxPaid - (healthExpenditures * 0.5);
        }
        return taxPaid;
    }

    

    

}
