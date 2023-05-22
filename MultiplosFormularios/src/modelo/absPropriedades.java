package modelo;

public abstract class absPropriedades implements intMetodos
{
    protected String numero;
    protected Integer num;
    
    protected String lado1;
    protected String lado2;
    protected String lado3;
    protected String resposta;
    protected Double l1;
    protected Double l2;
    protected Double l3;

    public absPropriedades(String numero)
    {
        this.numero = numero;
        this.executar();
    }

    public absPropriedades(Integer num)
    {
        this.num = num;
        this.executar();
    }

    public absPropriedades(String lado1, String lado2, String lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.executar();
    }

    public absPropriedades(Double l1, Double l2, Double l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.executar();
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }
}
