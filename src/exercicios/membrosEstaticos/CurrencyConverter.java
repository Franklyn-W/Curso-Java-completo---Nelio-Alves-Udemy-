package exercicios.membrosEstaticos;

public class CurrencyConverter {

    public static final double IOF = 1.06;
    
    public static double valorFinal (double valor1Dolar, double valorMontante){
        return valor1Dolar * valorMontante * IOF;
    }
}
