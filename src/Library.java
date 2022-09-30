public class Library {
    private Book[] books;
    private int index = 0;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index != books.length) {
            books[index] = book;
            index++;
            return;
        }
        System.out.println("Положить книгу некуда :(");
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void getBookInfo(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book.getTitle() + " by " + book.getAuthorName() + " was published in "
                        + book.getYearPublishing());
            }
        }
    }

    public void changeYearPublishing(String title, int newYearPublishing) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setYearPublishing(newYearPublishing);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Library:\n");

        for (int i = 0; i < index; i++) {
            str.append(books[i]).append("\n");
        }
        return str.toString();
    }
}
