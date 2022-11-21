package ru.mirea.pr.pr10.ex1;

public class ConcreteFactory implements ComplexAbstractFactory {    //класс-фабрика
    /* переопределённый мед создания комплексного числа
     *  возвращает объект класса Complex с полями 0, 0 */
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    /* переопределённый мед создания комплексного числа
     *  возвращает объект класса Complex с полями, заданными пользователем */
    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}