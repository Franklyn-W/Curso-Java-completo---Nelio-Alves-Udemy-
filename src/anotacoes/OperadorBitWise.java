package anotacoes;

public class OperadorBitWise {
    
    /*
     * Operadores que realizam validação logica bit a bit em valores
     * 
     * Possuem declaração "semelhante" ao operadores logicos
     * 
     * Operador &
     * Significado: Operação "E" bit a bit
     * 
     * Operador |
     * Significado: Operação "OU" bit a bit
     * 
     * Operador ^
     * Significado: Operação "Ou-exclusivo" bit a bit
     * 
     * Exemplos
     * 
     *  C1 | C2 | & | | | ^
     *   F |  F | F | F | F
     *   F |  V | F | V | V
     *   V |  F | F | V | V
     *   V |  V | V | V | F
     * 
     * 
     * Exemplo pratico
     * 
     * 89 - 0101 1001
     * 60 - 0011 1100
     * 
     * &  - 0001 1000 - Resultado 24
     * |  - 0111 1101 - Resultado 125
     * ^  - 0110 0101 - Resultado 101
     */

     public static void main(String[] args) {
        
        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
     }
}
