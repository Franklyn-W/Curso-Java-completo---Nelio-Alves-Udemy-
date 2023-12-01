package exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities;

import exercicios.herancaPolimorfismo.metodosAbstratos.exercicio1.entities.enums.EnumCores;

public class Circulo extends Formato{

    private Double raio;

    
    
    public Circulo() {
        super();
    }

    public Circulo(EnumCores cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }
    
    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI*Math.pow(raio, 2.0);
        
    }

    

}
