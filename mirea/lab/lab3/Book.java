package ru.mirea.lab.lab3;

public class Book implements Priceable {
    private String name;
    private String author;
    private int page_count;
    private double price;

    { price = 100; };

    public Book() {
        name = "Default";
        author = "Default";
        page_count = 0;
    };
    public Book(String name, String author, int page_count) {
        this.name = name;
        this.author = author;
        this.page_count = page_count;
    };

    public void SetName(String first_name) { this.name = name; };
    public void SetAuthor(String author) { this.author = author; };
    public void SetPC(int page_count) { this.page_count = page_count; };

    public String GetName() { return name; };
    public String GetAuthor() { return author; };
    public int GetPC() { return page_count; };

    @Override
    public double getPrice() { return price; };

    public String toString() { return "Название: " + name + " Автор: " + author + " Количество страниц: " + page_count; };
}