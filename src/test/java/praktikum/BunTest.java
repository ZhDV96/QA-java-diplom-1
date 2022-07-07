package praktikum;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BunTest {

    Database database = new Database();

    @Before
    public void setUp() {

    }

    @Test
    public void compareNameTest() {
        List<Bun> buns = database.availableBuns();
        String actualName = buns.get(0).getName();
        String expectedName = "black bun";
        assertEquals(expectedName, actualName);
    }

    @Test
    public void comparePriceTest() {
        List<Bun> buns = database.availableBuns();
        float actualPrice = buns.get(0).getPrice();
        float expectedPrice = 100;
        assertEquals(expectedPrice, actualPrice, 0.1);
    }


}
