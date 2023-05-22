package modelo;

public class ControleFatorial extends absPropriedades
{
    public ControleFatorial(String numero)
    {
        super(numero);
    }

    @Override
    public void executar()
    {
        absPropriedades validacao = new ValidacaoFatorial(this.numero);
        if(Estaticos.mensagem.equals(""))
        {
            absPropriedades calcularfatorial = new CalculoFatorial(validacao.num);
            this.numero = calcularfatorial.toString();
        }
        this.resposta = this.numero;
    }
}
