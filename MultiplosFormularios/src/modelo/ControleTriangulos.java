package modelo;

public class ControleTriangulos extends absPropriedades
{
    public ControleTriangulos(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
    }

    @Override
    public void executar()
    {
        ValidacaoTriangulos validacao = new ValidacaoTriangulos(
                this.lado1, this.lado2, this.lado3);
        if(Estaticos.mensagem.equals(""))
        {
            Triangulos triangulos = new Triangulos(
                    validacao.l1, validacao.l2, validacao.l3);
            this.resposta = triangulos.resposta;
        }
        else
        {
            this.resposta = Estaticos.mensagem;
        }
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }    
}
