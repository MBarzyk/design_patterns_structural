package decorator.zad2;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class CustomPizza extends Pizzeria implements IPizza {
    private final IPizza pizza;


    public CustomPizza(IPizza pizza, String... ingredients) {
        this.pizza = pizza;
        this.additionalIngredientsList.addAll(Arrays.asList(ingredients));
    }

    private List<String> additionalIngredientsList = new ArrayList<>();

    private double additionalPrice;

    public List<String> getIngredientsList () {
        List<String> ingredientsList = new ArrayList<>(pizza.getIngredients());
        ingredientsList.addAll(additionalIngredientsList);

        return ingredientsList;
    }

    public double getPizzaPrice () {
        double price = pizza.getPrice();
        return price + (2.50*additionalIngredientsList.size());
    }


    @Override
    public List<String> getIngredients() {
        return getIngredientsList();
    }

    @Override
    public double getPrice() {
        return getPizzaPrice();
    }

    public void addIngredient(String ingredient) {
        additionalIngredientsList.add(ingredient);
    }
}
