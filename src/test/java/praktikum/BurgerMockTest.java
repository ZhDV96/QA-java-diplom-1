package praktikum;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerMockTest {

    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredient;

    @Test
    public void burgerCheckGetPrice() {

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));
        Burger burger = new Burger();
        ingredient = ingredients.get(0);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(100F);
        float actualQuantity = burger.getPrice();
        float expectedQuantity = 300F;
        assertEquals(expectedQuantity, actualQuantity, 0.1);
        assertNotNull(bun);

    }

    @Test
    public void burgerCheckGetRecipe() {

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        ingredients.add(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        ingredients.add(new Ingredient(IngredientType.FILLING, "sausage", 300));
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredients.get(0));
        burger.addIngredient(ingredients.get(1));
        burger.addIngredient(ingredients.get(2));
        Mockito.when(bun.getPrice()).thenReturn(100F);
        Mockito.when(bun.getName()).thenReturn("white bun");
        System.out.println(burger.getReceipt().toString());
        String actualText = burger.getReceipt().toString();
        String expectedText = "(==== white bun ====)\n" +
                "= sauce sour cream =\n" +
                "= filling dinosaur =\n" +
                "= filling sausage =\n" +
                "(==== white bun ====)\n" +
                "\n" +
                "Price: 900,000000\n";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void burgerMoveIngredient() {

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredients.get(0));
        burger.addIngredient(ingredients.get(1));
        burger.removeIngredient(1);
        Mockito.when(bun.getPrice()).thenReturn(100F);
        float actualQuantity = burger.getPrice();
        float expectedQuantity = 300F;
        assertEquals(expectedQuantity, actualQuantity, 0.1);
        assertNotNull(bun);

    }


}
