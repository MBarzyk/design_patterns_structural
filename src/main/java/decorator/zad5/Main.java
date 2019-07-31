package decorator.zad5;

public class Main {
    public static void main(String[] args) {
        SimpleChristmasTree nakedTree = new SimpleChristmasTree(10);
        nakedTree.printTree();
        System.out.println("--------------------------\n");

        DecoratedChristmasTree clothedTree = new DecoratedChristmasTree(nakedTree);
        clothedTree.printTree();
    }
}
