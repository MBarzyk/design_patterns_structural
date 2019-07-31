package adapter.zad_2;

public class Main {
    public static void main(String[] args) {
        PeopleRegistry registry = new PeopleRegistry();

        registry.getListOfAllPeople().forEach(System.out::println);
    }
}
