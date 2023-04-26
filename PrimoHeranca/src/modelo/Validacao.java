package modelo;

public class Validacao extends Propriedades
{
    public Validacao(String numero)
    {
        this.numero = numero;
        this.executar();
    }
        
    private void executar()
    {
        this.mensagem = "";
        try
        {
            this.num = Integer.parseInt(this.numero);
            if(this.num <= 0)
                this.mensagem = "Número Inválido";
            else if(this.num == 1)
                this.mensagem = "Não é foda";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de Conversão";
        }
    }
}
