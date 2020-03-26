package com.company;


public class Main {

    /**
     *
     * It creates an empty Catalog, loads its info from a file and saves them into another file.
     * It uses a LoadCommand to add a new document to the existing Catalog.
     * It executes ListCommand, ViewCommand and HtmlLoad command. As a result, it creates a .html file (see the file/ the attached photo)
     *
     */
    public static void main(String[] args) {
        Catalog C1 = new Catalog(3);
        C1.loadCatalog();
        C1.saveCatalog();

        LoadCommand c1 = new LoadCommand(C1, 76, "Feeling the sun", "Kevin Philips", 1992);
        c1.executeCommand();
        ListCommand c2 = new ListCommand(C1);
        c2.executeCommand();
        ViewCommand c3 = new ViewCommand(C1);
        c3.executeCommand();

        HtmlLoad c4=new HtmlLoad(C1);
        c4.executeCommand();
    }
}
