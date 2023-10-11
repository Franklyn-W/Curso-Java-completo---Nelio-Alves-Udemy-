package exercicios.listas;

public class Funcionarios {

    private Integer idFuncionario;
    private String nomeFuncionario;
    private Double salarioFuncionario;

    public Funcionarios(int idFuncionario, String nomeFuncionario, double salarioFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public void ajustarSalario(double taxaReajuste) {
        salarioFuncionario += salarioFuncionario * (taxaReajuste / 100);
    }

    
    public int getIdFuncionario() {
        return idFuncionario;
    }
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    
    @Override
    public String toString() {
        return idFuncionario + ", " + nomeFuncionario + ", " + salarioFuncionario;
    }
    
    
}
