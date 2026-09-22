package LibraryManagement;


    public class LibraryBooks {

    public static int minBooksToBorrow(int targetCost, int[] prices) {

        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < prices.length; right++) {

            currentSum += prices[right];

            while (currentSum >= targetCost) {

                minLength = Math.min(minLength, right - left + 1);

                currentSum -= prices[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        int[] prices = {2, 3, 1, 2, 4, 3};
        int targetCost = 7;

        int answer = minBooksToBorrow(targetCost, prices);

        System.out.println("Minimum books to borrow = " + answer);
    }
}

