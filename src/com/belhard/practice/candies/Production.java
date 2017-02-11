package com.belhard.practice.candies;


public abstract class Production {
    private String name;
    private String type;
    private double cost;
    private int weight;

    public Production(String name, String type, double cost, int weight) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {

        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                name + "    " + type + "    " + cost + "    "+ weight+ "    ";
    }
}
