package ru.geekbrains.lesson1;

public class lemonade extends Product{
    private String lemonadeColor;
    private int weight;

    public String getlemonadeColor() {
        return lemonadeColor;
    }
    public void setlemonadeColor(String lemonadeColor) {
        this.lemonadeColor = lemonadeColor;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public lemonade(String brand, String name, double price, String lemonadeColor, int weight) {
        super(brand, name, price);
        this.lemonadeColor = lemonadeColor;
        this.weight = weight;
    }
    @Override
    public String displayInfo() {

        return String.format("[Лемонад]%s - %s - %f [вес: %d; цвет %s]", brand, name, price, weight, lemonadeColor);
    }
}