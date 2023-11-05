package product.model;

import java.util.Objects;

public class MilkFood extends Food{

    // fields of class
    private String typeMilk;

    // constructor
    public MilkFood(int barCode, String title, String expirationDate, double price, String typeMilk) {
        super(barCode, title, expirationDate, price);
        this.typeMilk = typeMilk;
    }

    // getter and setter
    public String getTypeMilk() {
        return typeMilk;
    }

    public void setTypeMilk(String typeMilk) {
        this.typeMilk = typeMilk;
    }

    // method toString
    @Override
    public String toString() {
        return "MilkFood{" +
                "typeMilk='" + typeMilk + '\'' +
                "} " + super.toString();
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        MilkFood milkFood = (MilkFood) object;
        return Objects.equals(typeMilk, milkFood.typeMilk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMilk);
    }
}
