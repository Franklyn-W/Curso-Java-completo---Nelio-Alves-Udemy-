package exercicios.composicao.exemplo.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exercicios.composicao.exemplo.entities.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {

        double sum = baseSalary; 
        // Variavel sum recebe o salario base
        Calendar cal = Calendar.getInstance(); 
        // Instancia um calendario

        for (HourContract contract : contracts) { 
            // Percorre todos os contratos do trabalhador

            cal.setTime(contract.getDate());
            // Define a data do calendario como a data do contrato
            int c_year = cal.get(Calendar.YEAR);
            // Define a variavel ano como o ano do calendario;
            int c_month = 1 + cal.get(Calendar.MONTH);
            // Define a variavel mes como o mes do calendario

            if (year == c_year && month == c_month) {
                // Se o mes e o ano informado for igual ao mesmo e o ano do contrato, adicona o valor total do trabalho a variavel sum
                sum += contract.totalValue();
            }
        }
        return sum;

    }

}
