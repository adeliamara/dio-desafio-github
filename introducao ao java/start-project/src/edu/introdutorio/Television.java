package edu.introdutorio;
/**
 * Class Description
@author Adélia Mara
@version 1.0
@since 2022-11-03
*/

public class Television {
    boolean isTurnOn = false;
    int channel = 1;
    int volume = 10;

    public void turnOn(){
        isTurnOn = true;
    }

    public void turnOff(){
        isTurnOn = false;
    }

    public int increaseVolume(){
        return volume++;
    }

    public int decreaseVolume(){
        return volume--;

    }

    public int increaseChannel(){
        return channel++;
    }

    public int decreaseChannel(){
        return channel--;
    }

    /**
     * Método para mudar canal
     * @param newChannel representa o novo canal que será acessado
     */
    public void changeChannel(int newChannel){
        channel = newChannel;
    }

}
