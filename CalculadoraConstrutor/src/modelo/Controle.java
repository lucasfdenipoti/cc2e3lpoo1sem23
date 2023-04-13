package modelo;

public class Controle
{
    private String numero1;
    private String numero2;
    private String operacao;
    private String resultado;

    public Controle(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        executar();
    }
    
    private void executar()
    {
        Validacao validacao = new Validacao(
                this.numero1, 
                this.numero2, 
                this.operacao);
        if(validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos(
                    validacao.getNum1(),
                    validacao.getNum2(), 
                    this.operacao);
            this.resultado = calculos.getResultado().toString();
        }
        else
        {
            validacao.getMensagem().equals("");
        }
    }

    public String getResultado()
    {
        return resultado;
    }
}
