package com.company;

public class ViewCommand implements GenericCommand {

    private Catalog catalog;

    public ViewCommand(Catalog catalog) {
        System.out.println("The detailed catalog's info:");
        this.catalog = catalog;
    }

    /**
     * Method prints all the information of the documents the catalog contains
     */
    @Override
    public void executeCommand() {
        catalog.print();
    }


}
