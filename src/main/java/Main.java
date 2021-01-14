import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        int[] digits = {2, 45, 7, 3, 5, 1, 8, 9, -34};
        int result = 100;
        printSumPairs(digits, result);
        findPair(digits, result);
    }


    public static void printSumPairs(int[] input, int result) {
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for (int j : input) {
            if (pairs.containsKey(j)) {
                System.out.println(j + " + " + pairs.get(j) + " = " + result);
            } else
                pairs.put(result - j, j);
        }

    }

    public static void findPair(int[] input, int result) {
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




