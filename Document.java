package com.company;

public class Document {
    private int ID;
    private String name;
    private String author;
    private int year;

    public Document(int id, String nume, String autor, int an) {
        this.ID = id;
        this.name = nume;
        this.author = autor;
        this.year = an;
    }

    /**
     * prints the document's info
     */
    public void print() {
        System.out.println("ID: " + this.ID + ", name: " + this.name + ", author: " + this.author + ", year: " + this.year + ";");
    }

    /**
     * @return document's ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @return document's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return document's publication year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return document's author
     */
    public String getAuthor() {
        return author;
    }
}
