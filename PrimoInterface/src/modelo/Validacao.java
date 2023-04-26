package modelo;

public class Validacao extends absPropriedades
{
    public Validacao(String numero)
    {
        super(numero);
    }

    @Override
    public void executar()
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
