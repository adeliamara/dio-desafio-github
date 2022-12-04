package dio.lab.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Robô está se movendo defensivamente.");
    }
}
