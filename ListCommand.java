package com.company;

public class ListCommand implements GenericCommand {

    private Catalog catalog;

    public ListCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    /**
     * Method lists the name of documents the catalog contains
     */
    @Override
    public void executeCommand() {
        System.out.println("The documents' list:");
        catalog.listDocs();
    }
}
