package liskov.substituition.principle.problema.quadrado;


import liskov.substituition.principle.problema.retangulo.Retangulo;

public class Quadrado extends Retangulo {
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
        this.largura = altura;
    }
}

