package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class BurgerPriceTest {

    private Burger burger;

    private Bun bun;

    private Ingredient ingredient;

    private final float bunPrice;

    private final float ingredientPrice;

    private final float expectedResult;

    public BurgerPriceTest(float bunPrice, float ingredientPrice, float expectedResult) {
        this.bunPrice = bunPrice;
        this.ingredientPrice = ingredientPrice;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters (name = "bunPrice = {0}\ningredientPrice = {1}\nexpectedResult = {2}")
    public static Object[][] data() {
        return new Object[][] {
                {0f, 0f, 0f},
                {1f, 1f, 3f},
                {9.99f, 9.99f, 29.97f},
                {1000.01f, 1000.01f, 3000.03f}
        };
    }

    @Before
    public void setUp() {
        burger = Mockito.spy(Burger.class);
        bun = Mockito.mock(Bun.class);
        ingredient = Mockito.mock(Ingredient.class);
    }

    @Test
    public void checkBurgerPriceTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(bunPrice);
        Mockito.when(ingredient.getPrice()).thenReturn(ingredientPrice);
        float totalPrice = burger.getPrice();
        Assert.assertEquals(0, Float.compare(expectedResult, totalPrice));
    }
}
