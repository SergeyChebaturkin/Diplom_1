package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BunTest {

    private Bun bun;

    @Before
    public void setUp() {
        bun = new Database().availableBuns().get(0);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals(bun.name, bun.getName());
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(0, Float.compare(bun.price, bun.getPrice()));
    }
}
