package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HtmlLoad implements GenericCommand{
    private Catalog catalog;
    private ArrayList<Document> documents = new ArrayList<>();

    public HtmlLoad(Catalog catalog){
        this.catalog=catalog;
        documents=catalog.getDocs();
    }

    /**
     * The method creates a html file and writes the catalogs' info
     */
    @Override
    public void executeCommand() {

        try {
            FileWriter fileWriter = new FileWriter("htmlReport.html");
            fileWriter.write("  <!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>My Catalog</title>\n" +
                    "</head>\n" +
                    "<body bgcolor=\"grey\"> \n"+"<h2>The catalog contains the following documents:</h2> \n " );
            for (Document doc : documents) {
                fileWriter.write("<p>"+"Document with id: " +Integer.toString(doc.getID()));
                fileWriter.write(", name: "+doc.getName()  );
                fileWriter.write(", written by: "+doc.getAuthor()  );
                fileWriter.write(" in "+Integer.toString(doc.getYear()) + "\n</p>");
            }
            fileWriter.write("</body>\n" +"</html>");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
