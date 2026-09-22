package LibraryManagement;

public class PartialTitleSearch {
  

    public static void partialTitleSearch(String[] books, String searchWord) {

        searchWord = searchWord.toLowerCase();
        boolean found = false;

        for (int i = 0; i < books.length; i++) {

            if (books[i].toLowerCase().contains(searchWord)) {
                System.out.println(books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    public static void main(String[] args) {

        String[] books = {
            "Java Programming",
            "Data Structures",
            "Advanced JAVA",
            "Python Basics",
            "Database Management System"
        };

        String searchWord = "java";

        partialTitleSearch(books, searchWord);
    }
}

