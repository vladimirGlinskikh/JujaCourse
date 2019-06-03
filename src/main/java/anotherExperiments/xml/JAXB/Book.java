package anotherExperiments.xml.JAXB;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement(name = "name")
public class Book {
    private String author;
    private String genre;
    private String name;
    private Date publishDate;
    private String ISBN;

    public Book() {
    }

    public Book(String author, String genre, String name, Date publishDate, String ISBN) {
        this.author = author;
        this.genre = genre;
        this.name = name;
        this.publishDate = publishDate;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", name='" + name + '\'' +
                ", publishDate=" + publishDate +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
