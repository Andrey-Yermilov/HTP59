package Homework4;

/**
 * create class Book and display
 * a)all books by author
 * b)all books by publisher
 * c)all books published after given year
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public Book(int id, String title, String author, String publisher, int yearOfPublishing, int numberOfPages, int price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }
    public Book(int id, String title, String author, String publisher, int yearOfPublishing, int numberOfPages,  String bindingType) {
        this(id,title,author,publisher,yearOfPublishing,numberOfPages,0,bindingType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (id != book.id) return false;
        if (yearOfPublishing != book.yearOfPublishing) return false;
        if (numberOfPages != book.numberOfPages) return false;
        if (price != book.price) return false;
        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        if (!publisher.equals(book.publisher)) return false;
        return bindingType.equals(book.bindingType);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publisher.hashCode();
        result = 31 * result + yearOfPublishing;
        result = 31 * result + numberOfPages;
        result = 31 * result + price;
        result = 31 * result + bindingType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\n"+"Book{" +
                "id:" + id +
                ", Title:'" + title + '\'' +
                ", Author:'" + author + '\'' +
                ", Publisher:'" + publisher + '\'' +
                ", Year of publishing:" + yearOfPublishing +
                ", Number of Pages:" + numberOfPages +
                ", Price:" + price +
                ", Binding type:'" + bindingType + '\'' +
                '}';
    }
}
