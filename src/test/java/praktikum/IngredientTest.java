package praktikum;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class IngredientTest {

    Database database = new Database();

    @Before
    public void setUp() {

    }

    @Test
    public void compareNameTest() {
        List<Ingredient> ingredients = database.availableIngredients();
        String actualName = ingredients.get(0).getName();
        String expectedName = "hot sauce";
        assertEquals(expectedName, actualName);
    }

    @Test
    public void comparePriceTest() {
        List<Ingredient> ingredients = database.availableIngredients();
        float actualPrice = ingredients.get(0).getPrice();
        float expectedPrice = 100;
        assertEquals(expectedPrice, actualPrice, 0.1);
    }

    @Test
    public void compareIngredientTypeTest() {
        List<Ingredient> ingredients = database.availableIngredients();
        IngredientType actualType = ingredients.get(0).getType();
        IngredientType expectedType = IngredientType.SAUCE;
        assertEquals(expectedType, actualType);
    }

}
