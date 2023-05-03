package modelo;

public class CalcularFatorial extends absPropriedades
{
    public CalcularFatorial(Integer num)
    {
        super(num);
    }

    @Override
    public void executar()
    {
        for(var i = num - 1; i >= 1; i--)
            num *= i;
    }

    @Override
    public String toString()
    {
        return this.num.toString();
    }
}
