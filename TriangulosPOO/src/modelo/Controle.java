package modelo;

public class Controle extends absPropriedades
{
    public Controle(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
    }

    @Override
    public void verificar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(
                this.lado1, this.lado2, this.lado3);
        if(validacao.mensagem.equals(""))
        {
            Triangulos triangulos = new Triangulos(
                    validacao.l1, validacao.l2, validacao.l3);
            this.resposta = triangulos.resposta;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
