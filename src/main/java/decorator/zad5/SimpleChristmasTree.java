package decorator.zad5;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SimpleChristmasTree {
    private int height;

    public void printTree() {
        for (int i = 0; i < height; i++) {
            printBranch(i);
        }
    }

    public void printBranch (int i) {
        for (int j = height; j > i; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j < (i * 2) - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


}
