package exercicios.poo.exercicio2.entities;

public class Funcionario {
    
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiguido(){
        double salarioLiguido = salarioBruto - imposto;

        return salarioLiguido;
    }

    public void reajustarSalario(double taxaAumento){
        this.salarioBruto += salarioBruto * (taxaAumento/100);

    }


    public String toString() {
        return nome + ", " + salarioLiguido();
    }


    













}
