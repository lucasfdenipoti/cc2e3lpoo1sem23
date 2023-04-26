package modelo;

import java.util.Objects;

public class Triangulos extends absPropriedades
{
    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
    }
    
    @Override
    public void verificar()
    {
        if((Objects.equals(this.l1, this.l2)) && 
                (Objects.equals(this.l1, this.l3)))
            this.resposta = "É um Triângulo Equilátero";
        else if((Objects.equals(this.l1, this.l2)) || 
                (Objects.equals(this.l1, this.l3)) || 
                (Objects.equals(this.l3, this.l2)))
            this.resposta = "É um Triângulo Isósceles";
        else
            this.resposta = "É um Triângulo Escaleno";
    }    
}
