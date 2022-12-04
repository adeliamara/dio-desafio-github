package dio.lab.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Robô está se movendo normalmente.");
    }
}
