package modelo;

public class Calculos
{
    public double calcular(Double num1, Double num2, String operacao)
    {
        if(operacao.equals("+"))
            return(num1 + num2);
        if(operacao.equals("-"))
            return(num1 - num2);
        if(operacao.equals("*"))
            return(num1 * num2);
        if(operacao.equals("/"))
            return(num1 / num2);
        return 0;
    }
}