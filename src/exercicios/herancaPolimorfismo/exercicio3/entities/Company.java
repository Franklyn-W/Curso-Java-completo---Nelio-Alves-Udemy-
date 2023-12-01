package exercicios.herancaPolimorfismo.exercicio3.entities;

public class Company extends TaxPayer{

    private int numberEmployees;

    public Company() {
    }

    public Company(String name, Double anualIncome, int numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double taxesPaid() {
        Double taxPaid = getAnualIncome() * 0.16;

        if (numberEmployees > 10) {
            taxPaid = getAnualIncome() * 0.14;
        }
        
        return taxPaid;
    }

    

    
    
}
