import java.time.Year;

public class Book {
    private final String isbn;
    private final String title;
    private final String genre;
    private final String author;
    private final Year published;
    private final String description;
//    private constructor
    private Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.genre = builder.genre;
        this.author = builder.author;
        this.published = builder.published;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Year getPublished() {
        return published;
    }

    public String getDescription() {
        return description;
    }

//   static inner builder class
    public static class Builder {
        private final String isbn;
        private final String title;
        private String genre;
        private String author;
        private Year published;
        private String description;

        public Builder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder published(Year published) {
            this.published = published;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("isbn='").append(isbn).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", published=").append(published);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}