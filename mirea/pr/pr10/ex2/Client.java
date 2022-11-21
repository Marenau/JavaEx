package ru.mirea.pr.pr10.ex2;

public class Client {   //класс клиента
    public Chair chair; //стул клиента

    public void sit() {};   //метод сидения на стуле

    public void setChair(Chair chair) {
        this.chair = chair;
    }   //метод установки стула клиенту

    @Override
    public String toString() {          //переопределённый метод toString
        return "Client { " +            //возврат строки
                "chair = " + chair +
                '}';
    }
}