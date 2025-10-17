package principle.segregationInterface.errado;

public class Robots implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Robot está trabalhando");
    }

    @Override
    public void comer() {
        // Robots não comem, mas são forçados a implementar este método
        throw new UnsupportedOperationException("Robots não comem");
    }

    @Override
    public void dormir() {
        // Robots não dormem, mas são forçados a implementar este método
        throw new UnsupportedOperationException("Robots não dormem");
    }
}
