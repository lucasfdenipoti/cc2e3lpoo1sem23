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
        absPropriedades validacao = new Validacao(this.numero);
        if(Estaticos.mensagem.equals(""))
        {
            absPropriedades calcularfatorial = new CalcularFatorial(validacao.num);
            this.numero = calcularfatorial.toString();
        }
    }

    @Override
    public String toString()
    {
        return this.numero;
    }
}
