package product.dao;

import product.model.Food;

public interface Product {

    boolean addProduct(Food food);
    Food findProduct(int barCode);
    Food removeProduct(int barCode);
    int quantity();
    Food[] findProductsByExpDate(String expDate);
}
