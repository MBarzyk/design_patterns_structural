package decorator.zad2;

public class Main {
    public static void main(String[] args) {
        IPizza pizza = new SimplePizza();


        pizza = new CustomPizza(pizza, "salami", "bacon", "olives", "tomatoes");

        pizza.getIngredients().forEach(System.out::println);
        System.out.println(pizza.getPrice());

        System.out.println("Menu: ");

        System.out.println(Pizzeria.createQuatroFormaggi().getPrice());

        IPizza multipleIngredientsPizza;

       multipleIngredientsPizza = new CustomPizza(Pizzeria.addMoreIngredients(Pizzeria.createMeatLove(), "tomatoes", "garlic sauce"));
       System.out.println(multipleIngredientsPizza);

       IPizza newPizza = Pizzeria.addMoreIngredients(multipleIngredientsPizza, "artichokes", "prawns");
       System.out.println(newPizza.getPrice());

    }


}
