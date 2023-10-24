package org.lessons.java.catalog;

public class Book {
    private String title;
    private int pageCount;
    private String Author;
    private String publisher;

    public Book(String title, int pageCount, String author, String publisher) {
        setTitle(title);
        setPageCount(pageCount);
        setAuthor(author);
        setPublisher(publisher);
    }

    //getter and setter per title

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // getter and setter pagecount


    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    //getter and setter author

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
    //getter and setter publisher


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
