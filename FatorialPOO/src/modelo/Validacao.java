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
        Estaticos.mensagem = "";
        try
        {
            this.num = Integer.valueOf(numero);
            if(this.num == 0 || this.num == 1)
                this.num = 1;
            if(this.num < 0)
                Estaticos.mensagem = "Digite um Número Válido";
        }
            catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Erro de Conversão";
        }
    }   
}
