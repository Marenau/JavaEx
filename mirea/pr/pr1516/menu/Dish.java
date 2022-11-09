package ru.mirea.pr.pr1516.menu;

import java.util.Objects;

public class Dish implements Item {
    private String name;
    private String description;
    private double cost;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }
    public Dish(String name, String description, double cost) {
        if (cost < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getCost() { return cost; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setCost(double cost) { this.cost = cost; }

    @Override
    public int compareTo(Object o) {
        return (int) (this.cost - ((Dish) o).cost);
    }

}