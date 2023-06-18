package assignment;

public class StringGenerator {
	public static String generateString(int A, int B, String S1, String S2) {
        if (A < 1 || A > 10 || B < 1 || B > 10) {
            return "Input value provided is out of range";
        }
        StringBuilder result = new StringBuilder();
        int s1Count = 0, s2Count = 0;
        for (int i = 0; i < A + B; i++) {
            if (s1Count == 2) {
                result.append(S2);
                s1Count = 0;
                s2Count++;
            } else if (s2Count == 2) {
                result.append(S1);
                s2Count = 0;
                s1Count++;
            } else if ((A - s1Count) > (B - s2Count)) {
                result.append(S1);
                s1Count++;
            } else {
                result.append(S2);
                s2Count++;
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(generateString(5, 3, "a", "b"));
        System.out.println(generateString(3, 3, "a", "b"));
        System.out.println(generateString(1, 4, "a", "b"));
        System.out.println(generateString(0, 3, "a", "b"));
        System.out.println(generateString(3, 0, "a", "b"));// output: aabaabab
    }
}
