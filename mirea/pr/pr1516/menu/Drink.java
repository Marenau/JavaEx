package ru.mirea.pr.pr1516.menu;

public final class Drink implements Item {
    private String name;
    private String description;
    private double cost;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }
    public Drink(String name, String description, double cost) {
        if (cost < 0 || name == "" || description == "")
            throw new IllegalArgumentException();
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getCost() { return cost; }

    @Override
    public int compareTo(Object o) {
        return (int) (this.cost - ((Drink) o).cost);
    }
}