package product.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import product.dao.Product;
import product.dao.ProductImpl;
import product.model.Food;
import product.model.MeatFood;
import product.model.MilkFood;

import static org.junit.jupiter.api.Assertions.*;

class ProductImplTest {

    Product product;
    Food[] food;

    @BeforeEach
    void setUp() {
        product = new ProductImpl(4);
        food = new Food[3];
        food[0] = new Food(101, "Tea", "01.01.2024", 1.99);
        food[1] = new MeatFood(102, "Sausages", "01.12.2023", 8.99, "Beef");
        food[2] = new MilkFood(103, "Butter", "14.02.2024", 4.99, "Cow");

        for (int i = 0; i < food.length; i++) {
            product.addProduct(food[i]);

        }

    }

    @Test
    void addProduct() {
        //null
        assertFalse(product.addProduct(null));
        // not add existing
        assertFalse(product.addProduct(food[1]));
        // add product
        Food food1 = new Food(104, "Coffee", "25.01.2024", 4.99);
        assertTrue(product.addProduct(food1));
        // cannot to exceeded capacity
        Food food2 = new Food(105, "Apple", "25.11.2024", 0.99);
        assertFalse(product.addProduct(food2));
    }

    @Test
    void findProduct() {
        // find product
        assertEquals(food[1], product.findProduct(102));
    }

    @Test
    void removeProduct() {
        // remove product
        assertEquals(food[1], product.removeProduct(102));
        // not find remove product
        assertNull(product.findProduct(102));
    }

    @Test
    void quantity() {
        // size
        assertEquals(3, product.quantity());
    }

    @Test
    void findProductsByExpDate() {
        // find product by EXP
        Food[] expected = product.findProductsByExpDate("01.01.2024");
        Food[] actual = {food[0]};
        assertArrayEquals(expected, actual);
    }
}