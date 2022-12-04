package dio.lab.strategy;

public class Robo {
    //comportamento é a strategy
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }


}
