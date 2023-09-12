package exercicios.poo.exercicio1.entities;

public class Retangulo {

    public double altura;
    public double largura;

    public double calcularArea() {

        double area = altura * largura;
        return area;
    }

    public double calcularPerimetro() {

        double perimetro = 2 * (altura + largura);
        return perimetro;

    }

    public double calcularDiagonal() {

        double diagonal = Math.sqrt(Math.pow(largura, 2.0) + Math.pow(altura, 2.0));
        return diagonal;
    }
}
