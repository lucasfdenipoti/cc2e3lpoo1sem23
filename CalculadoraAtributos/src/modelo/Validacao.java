package modelo;

public class Validacao
{
    public String numero1;
    public String numero2;
    public String operacao;
    public Double num1;
    public Double num2;
    public String mensagem;
    
    public void validar()
    {
        this.mensagem = "";
        try
        {
            this.num1 = Double.valueOf(numero1);
            this.num2 = Double.valueOf(numero2);
            if(this.operacao.equals("/") && this.num2.equals(0.0))
                this.mensagem = "Não é possível dividir por zero";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de conversão";
        }
    }
}
