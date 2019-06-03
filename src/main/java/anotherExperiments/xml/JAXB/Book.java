package anotherExperiments.xml.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "name")
public class Book {
    private String author;
    private String genre;
    private String name;
    private String publishDate;
    private String ISBN;

    public Book() {
    }

    public Book(String author, String genre, String name, String publishDate, String ISBN) {
        this.author = author;
        this.genre = genre;
        this.name = name;
        this.publishDate = publishDate;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }
    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    @XmlElement
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @XmlElement(name = "publish_date")
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getISBN() {
        return ISBN;
    }

    @XmlElement
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "[" + author +
                genre +
                name +
                publishDate +
                ISBN + "]";
    }
}
