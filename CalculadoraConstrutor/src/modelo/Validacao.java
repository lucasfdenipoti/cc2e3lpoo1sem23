package modelo;

public class Validacao
{
    private String numero1;
    private String numero2;
    private String operacao;
    private String mensagem;
    private Double num1;
    private Double num2;

    public Validacao(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        executar();
    }
    
    private void executar()
    {
        this.mensagem = "";
        try
        {
            this.num1 = Double.valueOf(numero1);
            this.num2 = Double.valueOf(numero2);
            if(operacao.equals("/") && this.num2.equals(0.0))
                this.mensagem = "Não é possível dividir por zero";

        }
        catch (Exception e)
        {
            this.mensagem = "Erro de conversão";
        }        
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Double getNum1()
    {
        return num1;
    }

    public Double getNum2()
    {
        return num2;
    }
}
