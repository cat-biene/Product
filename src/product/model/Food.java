package product.model;

import java.util.Objects;

public class Food implements Comparable<Food> {

    // fields of class
    private int barCode;
    private String title;
    private String expirationDate;
    private double price;

    // constructor


    public Food(int barCode, String title, String expirationDate, double price) {
        this.barCode = barCode;
        this.title = title;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    // getter and setter
    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // methods toString
    @Override
    public String toString() {
        return "Food{" +
                "barCode=" + barCode +
                ", title='" + title + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", price=" + price +
                '}';
    }

    // methods equals and hashCode

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Food food = (Food) object;
        return barCode == food.barCode && Double.compare(price, food.price) == 0 && Objects.equals(title, food.title) && Objects.equals(expirationDate, food.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode, title, expirationDate, price);
    }

    // method compareTo
    @Override
    public int compareTo(Food o) {
        return Integer.compare(this.barCode, o.barCode);
    }
}
