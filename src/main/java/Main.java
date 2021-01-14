import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        int[] digits = {5, 7, 1, 2, 8, 4, 3};
        int result = 18;
        printSumPairs(digits, result);
        findPair(digits, result);
    }

    private static void printSumPairs(int[] input, int result) {
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for (int j : input) {
            if (pairs.containsKey(j)) {
                System.out.println(j + " + " + pairs.get(j) + " = " + result);
            } else
                pairs.put(result - j, j);
        }
    }

    private static void findPair(int[] input, int result) {
        int pairsCount = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == result) {
                    System.out.println("Pair found at index " + i + " and " + j);
                    pairsCount++;
                }
            }
        }
        if (pairsCount == 0)
            System.out.println("Pair not found");
    }
}




