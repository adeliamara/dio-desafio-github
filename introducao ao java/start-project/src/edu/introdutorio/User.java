package edu.introdutorio;

public class User {

    public static void main(String[] args) {
        Television television = new Television();

        System.out.print(television.isTurnOn);
        System.out.print(television.channel);
        System.out.print(television.volume);

        television.turnOn();
        television.decreaseChannel();
        television.increaseVolume();

        System.out.print(television.isTurnOn);
        System.out.print(television.channel);
        System.out.print(television.volume);


    }
}
