package org.lessons.java.catalog;

public class Book {
    private String title;
    private int pageCount;
    private String author;
    private String publisher;

    public Book(String title, int pageCount, String author, String publisher) throws IllegalArgumentException {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("The title cannot be empty.");
        } else if (pageCount <= 0) {
            throw new IllegalArgumentException("Number of pages cannot be less than 1");
        } else if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author field cannot be empty");
        } else if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("Publisher field cannot be empty");
        }

        setTitle(title);
        setPageCount(pageCount);
        setAuthor(author);
        setPublisher(publisher);
    }

    //getter and setter per title

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("The title cannot be empty.");
        }
        this.title = title;
    }

    // getter and setter pagecount
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) throws IllegalArgumentException {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Number of pages cannot be less than 1");
        }
        this.pageCount = pageCount;
    }

    //getter and setter author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author field cannot be empty");
        }
        this.author = author;
    }

    //getter and setter publisher
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException {
        if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("Publisher field cannot be empty");
        }
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "title: " + title + ", " +
                "pages: " + pageCount + ", " +
                "author: " + author + ", " +
                "editor: " + publisher + ", ";
    }
}