package decorator.zad2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public final class SimplePizza implements IPizza {
    private List<String> ingredientsList;
    private double price;

    public SimplePizza() {
        this.ingredientsList = new ArrayList<>(Arrays.asList("sauce", "cheese"));
        this.price = 10;
    }

    @Override
    public List<String> getIngredients() {
        return ingredientsList;
    }
}