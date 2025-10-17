package principle.segregationInterface.errado;

public class Funcionario implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Funcionario está trabalhando");
    }

    @Override
    public void comer() {
        System.out.println("Funcionario está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Funcionario está dormindo");
    }
}
