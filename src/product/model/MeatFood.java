package product.model;

import java.util.Objects;

public class MeatFood extends Food{

    // fields of meat
    private String typeMeat;

    // constructor
    public MeatFood(int barCode, String title, String expirationDate, double price, String typeMeat) {
        super(barCode, title, expirationDate, price);
        this.typeMeat = typeMeat;
    }

    // getter and setter
    public String getTypeMeat() {
        return typeMeat;
    }

    public void setTypeMeat(String typeMeat) {
        this.typeMeat = typeMeat;
    }

    //method toString
    @Override
    public String toString() {
        return "MeatFood{" +
                "typeMeat='" + typeMeat + '\'' +
                "} " + super.toString();
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        MeatFood meatFood = (MeatFood) object;
        return Objects.equals(typeMeat, meatFood.typeMeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMeat);
    }
}
