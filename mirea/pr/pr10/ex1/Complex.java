package ru.mirea.pr.pr10.ex1;

public class Complex {          //класс, представляющий комплексное число
    private int real, image;    //закрытые поля комплексного числа

    public Complex() {          //конструктор
        this.real = 0;          //присвоение полю значения нуля
        this.image = 0;         //присвоение полю значения нуля
    }
    public Complex(int real, int image) {   //перегруженный конструктор
        this.real = real;                   //присвоение полю значения параметра
        this.image = image;                 //присвоение полю значения параметра
    }

    @Override
    public String toString() {              //переопределённый метод toString
        return "Complex = " +               //возврат строки
                "(" + real + ") + (" +
                image + ")i";
    }
}

