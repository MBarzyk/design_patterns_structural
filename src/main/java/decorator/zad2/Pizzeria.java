package decorator.zad2;

public abstract class Pizzeria {

    public static IPizza createMargharita () {
        return new SimplePizza();
    }

    public static IPizza createHawaiian () {
        return new CustomPizza(new SimplePizza(), "pineapple", "ham");
    }

    public static IPizza createPepperoni () {
        return new CustomPizza(new SimplePizza(), "salami", "pepperoni", "olives");
    }
    public static IPizza createQuatroFormaggi () {
        return new CustomPizza(new SimplePizza(), "gorgonzola", "parmigiana", "cheddar");
    }
    public static IPizza createMeatLove () {
        return new CustomPizza(new SimplePizza(), "salami", "bacon", "beef", "ham", "sausage");
    }

    public static IPizza addMoreIngredients (IPizza iPizza, String... ingredients) {
        return new CustomPizza(iPizza, ingredients);
    }
}
