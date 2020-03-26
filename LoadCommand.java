package com.company;

public class LoadCommand implements GenericCommand {
    private Catalog catalog;
    private int id;
    private String name;
    private String author;
    private int year;

    public LoadCommand(Catalog cat, int id, String name, String author, int year) {
        this.catalog = cat;
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    /**
     * Method creates a new doc and loads it to the catalog
     */
    @Override
    public void executeCommand() {
        Document newDoc = new Document(id, name, author, year);
        catalog.addDocument(newDoc);
    }
}
