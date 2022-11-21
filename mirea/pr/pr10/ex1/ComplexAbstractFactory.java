package ru.mirea.pr.pr10.ex1;

interface ComplexAbstractFactory {              //интерфейс фабрики
    Complex createComplex();                    //метод создания комплексного числа
    Complex CreateComplex(int real, int image); //перегруженный метод создания комплексного числа
}