public class Print3DArr {
    public static void main(String[] args) {
        int[][][] a = { { { 1, 4, 7 }, { 8, 5, 2, 1, 2, 3 }, { 9, 6, 3, 2, 1, 4, 7 } } };
        for (int i[][] : a) {
            for (int j[] : i) {
                for (int k : j)
                    System.out.print(k + " ");
                System.out.println();
            }
        }
    }
}
