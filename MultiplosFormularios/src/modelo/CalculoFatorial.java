package modelo;

public class CalculoFatorial extends absPropriedades
{
    public CalculoFatorial(Integer num)
    {
        super(num);
    }

    @Override
    public void executar()
    {
        for(var i = num - 1; i >= 1; i--)
            num *= i;
        this.resposta = this.num.toString();
    }
}
