package exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities;

import exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities.enums.EnumCores;

public class Retangulo extends Formato{
    
    private Double largura;
    private Double altura;


    public Retangulo() {
        super();
    }

    public Retangulo(EnumCores cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }
  
    public Double getLargura() {
        return largura;
    }
    public void setLargura(Double largura) {
        this.largura = largura;
    }
    
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

      @Override
    public Double area() {
        return altura * largura;
    }
}
