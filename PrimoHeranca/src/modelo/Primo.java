package modelo;

import java.math.BigInteger;

public class Primo extends Propriedades 
{
    public Primo(BigInteger num)
    {
        this.num = num;
        this.mensagem = this.executar();
    }
    
    private String executar()
    {
        int contador = 0;
        BigInteger i = BigInteger.ONE;
        while(i.compareTo(num) < 1)
        {
            if(num.remainder(i).equals(BigInteger.ZERO))
                contador++;
            if(contador > 2)
                break;
            i = i.add(BigInteger.ONE);
        }
        if(contador == 2)
            return Constante.EH_PRIMO;
        else
            return Constante.NAO_EH_PRIMO;

    }
}
