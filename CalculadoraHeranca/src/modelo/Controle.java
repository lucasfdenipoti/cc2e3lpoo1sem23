package modelo;

public class Controle extends Propriedades
{
    public Controle(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        this.executar();
    }
    
    private void executar()
    {
        this.mensagem = "";
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
            this.resposta = calculos.getResultado().toString();
       }
       else
       {
            this.mensagem = validacao.getMensagem();
       }
    }

    public String getResultado()
    {
        return resposta;
    }
}
