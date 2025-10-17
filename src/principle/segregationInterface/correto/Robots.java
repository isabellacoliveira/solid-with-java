package principle.segregationInterface.correto;

public class Robots implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Robot está trabalhando");
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
