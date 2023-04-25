package modelo;

public class Calculos extends Propriedades
{
    public Calculos(Double num1, Double num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        executar();
    }
    
    private void executar()
    {
        if(operacao.equals("+"))
            resultado = num1 + num2;
        if(operacao.equals("-"))
            resultado = num1 - num2;
        if(operacao.equals("*"))
            resultado = num1 * num2;
        if(operacao.equals("/"))
            resultado = num1 / num2;
    }

    public Double getResultado()
    {
        return resultado;
    }
}
