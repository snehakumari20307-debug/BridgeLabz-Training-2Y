package LibraryManagement;

public class SortByPrice {
    

    public static int selectionSort(int[] prices) {

        int n = prices.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (prices[j] < prices[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = prices[i];
                prices[i] = prices[minIndex];
                prices[minIndex] = temp;

                swapCount++;
            }
        }

        return swapCount;
    }

    public static void main(String[] args) {

        int[] prices = {450, 200, 600, 150, 300};

        int swaps = selectionSort(prices);

        System.out.println("Sorted Prices:");

        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println();
        System.out.println("Number of swaps = " + swaps);
    }
}

