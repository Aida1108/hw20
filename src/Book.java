import java.util.Objects;

public class Book {
    //Задание 1
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Author getAuthor(){
        return author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    //Задание 2
    public String toString() {
        return "Название книги " + title + " Автор " + author + " Год " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}
