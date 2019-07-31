package decorator.zad5;

import java.util.Random;

public class DecoratedChristmasTree extends SimpleChristmasTree {
    private final SimpleChristmasTree tree;

    public DecoratedChristmasTree(SimpleChristmasTree tree) {
        this.tree = tree;
    }

    public void printTree() {
        for (int i = 0; i < tree.getHeight(); i++) {
            printBranch(i);
        }
    }
    @Override
    public void printBranch(int i) {
        int random = new Random().nextInt(10) + 1;

        for (int j = tree.getHeight(); j > i; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j < (i * 2) - 1; j++) {
            if (random < 7) {
                System.out.print("*");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
    }
}
