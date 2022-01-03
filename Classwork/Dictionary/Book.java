package Classwork.Dictionary;

public class Book {
    private int pages;

    public Book() {
        pages = 500;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "This Book has " + pages + " pages.";
    }
}
