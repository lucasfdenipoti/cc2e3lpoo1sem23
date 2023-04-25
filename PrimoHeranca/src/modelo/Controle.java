package modelo;

public class Controle extends Propriedades
{
    public Controle(String numero)
    {
        this.numero = numero;
        this.executar();
    }
    
    private void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.numero);
        
        if(validacao.mensagem.equals(""))
        {
            Primo primo = new Primo(validacao.num);
            this.resposta = primo.mensagem;
        }
        else
        {
            this.resposta = validacao.mensagem;
        }
    }
}
