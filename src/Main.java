public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Rafael", "Sabatini");
        Author author2 = new Author("Stephen", "King");

        Book book1 = new Book("Captain Blood: His Odyssey", author1, 1922);
        Book book2 = new Book("The Fortunes of Captain Blood", author1, 1936);
        Book book3 = new Book("The Stand", author2);
        Book book4 = new Book("The Green Mile", author2, 1996);

        Library library = new Library(3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.showBooks();
        library.getBookInfo("The Fortunes of Captain Blood");
        library.changeYearPublishing("The Stand", 1978);
        library.getBookInfo("The Stand");

    }
}