package exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities;

import exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities.enums.EnumCores;

public abstract class Formato {

    private EnumCores cor;

    public Formato() {
    }

    public Formato(EnumCores cor) {
        this.cor = cor;
    }

    public EnumCores getCor() {
        return cor;
    }

    public void setCor(EnumCores cor) {
        this.cor = cor;
    }

    public abstract Double area();

}
