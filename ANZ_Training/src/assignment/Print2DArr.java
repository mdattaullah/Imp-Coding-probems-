import java.util.*;

class Print2DArr {
    public static void main(String[] args) {
        int[][] a = { { 5, 6, 3, 2, 4 }, { 9, 10, 60 }, { 64, 62, 25, 23, 21 } };
        // Arrays.sort(a);
        for (int i[] : a) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }

    }
}