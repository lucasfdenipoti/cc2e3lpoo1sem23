package modelo;

import java.math.BigInteger;

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
            this.num = new BigInteger(this.numero);
            if(num.compareTo(BigInteger.ZERO) < 1)
                this.mensagem = Constante.EH_INVALIDO;
            else if(num.equals(BigInteger.ONE))
            {
                this.mensagem = Constante.NAO_EH_PRIMO;
            }
        }
        catch (Exception e)
        {
            this.mensagem = Constante.ERRO;
        }
    }
}
