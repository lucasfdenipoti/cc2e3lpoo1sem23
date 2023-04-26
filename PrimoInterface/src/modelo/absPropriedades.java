package modelo;

public abstract class absPropriedades implements intMetodos
{
    public String numero;
    public String mensagem;
    public String resposta;
    public int num;

    public absPropriedades(String numero)
    {
        this.numero = numero;
        this.executar();
    }

    public absPropriedades(int num)
    {
        this.num = num;
        this.executar();
    }
}
