package LibraryManagement;

public class RemoveDuplicate {
    

    public static int removeDuplicateBook(int[] book, int n) {

        if (n == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < n; j++) {

            if (book[j] != book[i]) {
                i++;
                book[i] = book[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] book = {10, 10, 20, 40, 40, 89, 90, 90};
        int n = book.length;

        int ans = removeDuplicateBook(book, n);

        System.out.println("Unique Books = " + ans);

        for (int i = 0; i < ans; i++) {
            System.out.println(book[i]);
        }
    }
}

