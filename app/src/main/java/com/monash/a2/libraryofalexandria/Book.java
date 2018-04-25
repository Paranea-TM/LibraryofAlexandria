package com.monash.a2.libraryofalexandria;

/**
 * Created by Panda on 2018/4/24.
 */

public class Book {
    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private int edition;
    private int year_of_publication;
    private String genre;
    private String description;

    public Book() {
        this.title = "TITLE";
        this.isbn = "ISBN";
        this.author = "AUTHOR";
        this.publisher = "PUBLISHER";
        this.edition = 1;
        this.year_of_publication = 2018;
        this.genre = "Tech";
        this.description = "DESCRIPTION";
    }

    public Book(String title, String isbn, String author, String publisher, int edition, int year_of_publication, String genre, String description){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.year_of_publication = year_of_publication;
        this.genre = genre;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(int year_of_publication) {
        this.year_of_publication = year_of_publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String showDetail() {
        return "Title: "+title+"\nISBN: "+isbn+"\nAuthor: "+author+"\nPublisher: "+publisher+"\nEdition:"+edition+
                "\nYear of Publication: "+year_of_publication+"\nGenre: "+genre+"\nDescription: "+description;
    }

}
