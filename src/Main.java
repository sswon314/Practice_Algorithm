import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] dpTable = new int[n + 1];
        dpTable[0] = 0;
        dpTable[1] = 0;

        for (int i = 2; i < n + 1; i++) {
            dpTable[i] = dpTable[i - 1] + 1;

            if (i % 3 == 0) {
                dpTable[i] = Math.min(dpTable[i], dpTable[i / 3] + 1);
            }
            if (i % 2 == 0) {
                dpTable[i] = Math.min(dpTable[i], dpTable[i / 2] + 1);
            }
        }

        System.out.println(dpTable[n]);
    }
}
