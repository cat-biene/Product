package product.dao;

import product.model.Food;

import java.util.Arrays;
import java.util.Comparator;

public class ProductImpl implements Product {

    // fields
    private Food[] foods;
    private int size;

    // constructor
    public ProductImpl(int capacity) {
        foods = new Food[capacity];
    }

    @Override
    public boolean addProduct(Food food) {
        if (food == null || size == foods.length || findProduct(food.getBarCode()) != null) {
            return false;
        }
        foods[size++] = food;
        return true;
    }

    @Override
    public Food findProduct(int barCode) {
        for (int i = 0; i < size; i++) {
            if (foods[i].getBarCode() == barCode) {
                return foods[i];
            }

        }
        return null;
    }

    @Override
    public Food removeProduct(int barCode) {
        for (int i = 0; i < size; i++) {
            if(foods[i].getBarCode() == barCode) {
                Food removeProduct = foods[i];
                foods[i] = foods[size - 1];
                foods[size - 1] = null;
                size--;
                return removeProduct;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public Food[] findProductsByExpDate(String expDate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(foods[i].getExpirationDate().equals(expDate)) {
                count++;
            }
        }
        Food[] res = new Food[count];
        for (int i = 0, j =0; j < res.length; i++) {
            if (foods[i].getExpirationDate().equals(expDate)) {
                res[j++] = foods[i];
            }
        }
        return res;
    }
}
