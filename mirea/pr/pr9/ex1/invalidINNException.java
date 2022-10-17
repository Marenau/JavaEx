package ru.mirea.pr.pr9.ex1;

import java.math.BigInteger;

public class invalidINNException extends Exception {
    private BigInteger number;

    public invalidINNException(BigInteger number) {
        super("ИНН с номером: " + number + " не действителен!");
        this.number = number;
    }
}