package ru.mirea.pr.pr10.ex2;

public class Test {
    public static void main(String[] arg) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();
        Chair chair = chairFactory.createMagicanChair();
        ((MagicChair)chair).doMagic();
        client.setChair(chair);
        System.out.println(client);
        chair = chairFactory.createVictorianChair();
        chair = (VictorianChair)chair;
        client.setChair(chair);
        System.out.println(client);
    }
}