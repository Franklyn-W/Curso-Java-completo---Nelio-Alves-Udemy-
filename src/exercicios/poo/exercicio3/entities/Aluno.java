package exercicios.poo.exercicio3.entities;

public class Aluno {

    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double calcularNota() {
        double nota = n1 + n2 + n3;
        return nota;
    }

    public void aprovacao() {

        if (calcularNota() > 60) {
            System.out.println("PASS");
        } else {
            System.out.printf("FAILED\nFALTAM %.2f PONTOS", (60 - calcularNota()));
        }
    }

}
