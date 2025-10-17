package liskov.substituition.principle.problema;

import liskov.substituition.principle.problema.quadrado.Quadrado;
import liskov.substituition.principle.problema.retangulo.Retangulo;

public class Main {
    public static void main(String[] args) {
        // ✅ Um retângulo funciona como esperado
        Retangulo retangulo = new Retangulo();
        ajustarRetangulo(retangulo);
        // Esperado: 5 * 10 = 50

        System.out.println("--------------------");

        // ❌ Um quadrado não respeita o comportamento esperado de um retângulo
        Retangulo quadrado = new Quadrado();
        ajustarRetangulo(quadrado);
        // Esperado: 50, mas sai 100, pois altura e largura são sempre iguais
    }

    // Método que espera um Retângulo
    static void ajustarRetangulo(Retangulo r) {
        r.setLargura(5);  // define largura
        r.setAltura(10);  // define altura
        System.out.println("Área calculada: " + r.getArea());
    }
}
