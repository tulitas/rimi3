class Main
{
    // Naive method to find a pair in an array with a given sum
    public static void findPair(int[] A, int sum)
    {
        // consider each element except the last
        for (int i = 0; i < A.length - 1; i++)
        {
            // start from the i'th element till the last element
            for (int j = i + 1; j < A.length; j++)
            {
                // if the desired sum is found, print it and return
                if (A[i] + A[j] == sum)
                {
                    System.out.println("Pair found at index " + i + " and " + j);
                    return;
                }
            }
        }

        // No pair with the given sum exists in the array
        System.out.println("Pair not found");
    }

    public static void main (String[] args)
    {
        int[] A = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;

        findPair(A, sum);
    }
}