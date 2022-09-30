public class Book {
    private String title;
    private Author author;
    private int yearPublishing;

    public Book(String title, Author author, int yearPublishing) {
        this.title = title;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public Book(String title, Author author) {
        this(title, author, 0);
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorName() {
        return author.getFirstName() + " " + author.getLastName();
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Book: " + title + ": " + author + ": " + yearPublishing;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return title.equals(otherBook.getTitle())
                && author.equals(otherBook.getAuthor())
                && yearPublishing == otherBook.getYearPublishing();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, yearPublishing);
    }
}
