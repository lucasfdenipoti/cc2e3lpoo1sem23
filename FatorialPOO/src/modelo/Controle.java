package modelo;

public class Controle extends absPropriedades
{
    public Controle(String numero)
    {
        super(numero);
    }

    @Override
    public void executar()
    {
        Estaticos.mensagem = "";
        absPropriedades validacao = new Validacao(this.numero);
        if(Estaticos.mensagem.equals(""))
        {
            absPropriedades calcularfatorial = new CalcularFatorial(validacao.num);
            Estaticos.mensagem = calcularfatorial.toString();
        }
        else
        {
            Estaticos.mensagem = Estaticos.mensagem;        }
        }

    @Override
    public String toString()
    {
        return this.numero;
    }
    
    
}
