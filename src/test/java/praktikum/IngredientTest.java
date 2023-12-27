package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IngredientTest {

    private Ingredient ingredient;

    @Before
    public void setUp() {
        ingredient = new Database().availableIngredients().get(0);
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(0, Float.compare(ingredient.price, ingredient.getPrice()));
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals(ingredient.name, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        Assert.assertEquals(ingredient.type, ingredient.getType());
    }
}
