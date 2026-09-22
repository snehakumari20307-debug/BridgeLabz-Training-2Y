package LibraryManagement;

public class SearchByPrice {
    

    public static int findBookByPrice(int[] prices, int targetPrice) {

        int left = 0;
        int right = prices.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (prices[mid] == targetPrice) {
                return mid;
            } 
            else if (prices[mid] < targetPrice) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] prices = {100, 150, 200, 250, 300, 350, 400};

        int targetPrice = 250;

        int index = findBookByPrice(prices, targetPrice);

        if (index != -1) {
            System.out.println("Book found at index: " + index);
        } else {
            System.out.println("Book not found.");
        }
    }
}

