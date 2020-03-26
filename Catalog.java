package com.company;

import java.io.*;
import java.util.ArrayList;

public class Catalog {
    private ArrayList<Document> documents = new ArrayList<>();
    private int nrOfDocuments;
    private int maxCapacity;

    public Catalog(int capacity) {
        nrOfDocuments = 0;
        maxCapacity = capacity;
    }

    /**
     * @return the arrayList which contains the catalog's documents
     */
    public ArrayList<Document> getDocs() {
        return documents;
    }

    /**
     * @param doc the document we want to add to the catalog
     */
    public void addDocument(Document doc) {
        documents.add(doc);
        this.nrOfDocuments++;
    }

    /**
     * prints the catalog's documents
     */
    public void print() {
        for (Document d : documents) {
            d.print();
        }
    }

    /**
     * Method prints the name of the documents the catalog contains
     */
    public void listDocs() {
        for (Document d : documents)
            System.out.println(d.getName() + "; ");
    }

    /**
     * The method saves all the documents from the Catalog in a new file by writing all their information in the file
     * It uses a plain text representation of the catalog
     * It converts numbers to strings for year and ID variables
     */
    public void saveCatalog() {
        try {
            FileWriter fileWriter = new FileWriter("outFile.txt");
            for (Document doc : documents) {
                fileWriter.write(Integer.toString(doc.getID()) + '\n');
                fileWriter.write(doc.getName() + '\n');
                fileWriter.write(doc.getAuthor() + '\n');
                fileWriter.write(Integer.toString(doc.getYear()) + '\n');
            }

            fileWriter.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    /**
     * Method loads the catalog from existing file, by reading information used for creating a document and adding it to the catalog
     * Method uses a buffered reader
     * It converts strings to numbers (for year and ID variables)
     */
    public void loadCatalog() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("inFile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader =
                new BufferedReader(fileReader);

        for (int i = 1; i <= maxCapacity; i++)
            try {
                String stringId = bufferedReader.readLine();
                String name = bufferedReader.readLine();
                String author = bufferedReader.readLine();
                String stringYear = bufferedReader.readLine();
                int intId = Integer.parseInt(stringId);
                int intYear = Integer.parseInt(stringYear);
                Document newDoc = new Document(intId, name, author, intYear);
                documents.add(newDoc);
                this.nrOfDocuments++;
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


}
