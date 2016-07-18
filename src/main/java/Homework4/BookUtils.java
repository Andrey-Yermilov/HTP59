package Homework4;

import java.util.ArrayList;

public class BookUtils {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "The Fault in Our Stars", "John Green", "Dutton Books", 2012, 313, 25, "Paperback"));
        books.add(new Book(2, "The Book Thief", "Markus Zusak", "Knopf Books", 2006, 552, 37, "Hardcover"));
        books.add(new Book(3, "The Giving Tree", "Shel Silverstein", "HarperCollins Publishers", 1964, 63, 15, "Paperback"));
        books.add(new Book(4, "Gone with the Wind", "Margaret Mitchell", "Grand Central Publishing", 1999, 1050, 78, "Hardcover"));
        books.add(new Book(5, "Animal Farm", "George Orwell", "NAL", 2003, 102, 25, "Paperback"));
        books.add(new Book(6, "The Inheritors", "William Golding", "HarperCollins Publishers", 2005, 414, 50, "Hardcover"));
        books.add(new Book(7, "Rites of Passage", "William Golding", "Washington Square Press", 2004, 283, 25, "Paperback"));
        books.add(new Book(8, "Lord of the Flies", "William Golding", "Penguin Books", 1999, 182, 20, "Hardcover"));
        books.add(new Book(9, "Crime and Punishment", "Fyodor Dostoyevsky", "Penguin Books", 2002, 545, 30, "Hardcover"));
        books.add(new Book(10, "The Brothers Karamazov", "Fyodor Dostoyevsky", "Penguin Books", 2003, 718, 35, "Hardcover"));
        String author = "William Golding";
        String publisher = "Penguin Books";
        int yearOfPublishing = 2003;
        System.out.println("All books of the author "+author+findBookByAuthor(author,books));
        System.out.println("All books of the publisher "+publisher+findBookByPublisher(publisher,books));
        System.out.println("All books published after "+yearOfPublishing+" year"+findBookByMinYear(yearOfPublishing,books));
    }

    /**
     * find book by author
     * @param author author
     * @param books ArrayList of books
     * @return ArrayList of results
     */
    public static ArrayList<Book> findBookByAuthor(String author, ArrayList<Book> books) {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book:books
             ) {
            if (book.getAuthor().equals(author)){
                results.add(book);
            }
        }
        return results;
    }

    /**
     * find book by publisher
     * @param publisher publisher
     * @param books ArrayList of books
     * @return ArrayList of results
     */
    public static ArrayList<Book> findBookByPublisher(String publisher, ArrayList<Book> books) {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book:books
                ) {
            if (book.getPublisher().equals(publisher)){
                results.add(book);
            }
        }
        return results;
    }

    /**
     * find books published after given year
     * @param year year
     * @param books ArrayList of books
     * @return ArrayList of results
     */
    public static ArrayList<Book> findBookByMinYear(int year, ArrayList<Book> books) {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book:books
                ) {
            if (book.getYearOfPublishing() > year){
                results.add(book);
            }
        }
        return results;
    }
}
