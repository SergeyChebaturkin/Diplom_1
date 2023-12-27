package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BunTest {

    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("Гиперпространственная булка", 2.99f);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Названиия булок не совпадают", "Гиперпространственная булка", bun.getName());
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(0, Float.compare(2.99f, bun.getPrice()));
    }
}
