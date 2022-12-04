package dio.lab.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Robô está se movendo agressivamente.");
    }
}
