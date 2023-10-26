package exercicios.herancaPolimorfismo.exercicio1.entities;

public class FuncionarioTerceirizado extends Funcionario {
    private Double tarifaAdicional;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String name, Integer horasTrabalhadas, Double valorHora, Double tarifaAdicional) {
        super(name, horasTrabalhadas, valorHora);
        this.tarifaAdicional = tarifaAdicional;
    }

    public Double getTarifaAdicional() {
        return tarifaAdicional;
    }

    public void setTarifaAdicional(Double tarifaAdicional) {
        this.tarifaAdicional = tarifaAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + (tarifaAdicional * 1.1);
    }
}
