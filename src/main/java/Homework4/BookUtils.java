package Homework4;

import java.util.ArrayList;

public class BookUtils {

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
            if (book.getAuthor().toLowerCase().equals(author.toLowerCase())){
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
            if (book.getPublisher().toLowerCase().equals(publisher.toLowerCase())){
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
