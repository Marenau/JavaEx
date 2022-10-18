package ru.mirea.pr.pr10.ex2;

public class MagicChair implements Chair {
    public MagicChair() {}

    public void doMagic() {
        System.out.println("Magic happened!");
    }

    @Override
    public String toString() {
        return "MagicanChair";
    }
}