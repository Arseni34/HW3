import javax.xml.stream.*;
import java.io.*;

public class StaxParser {
    public static void main(String[] args) {
        String fileName = "src/Sh.xml";

        String firstName = "";
        String lastName = "";
        String title = "";
        StringBuilder lines = new StringBuilder();

        try {
            XMLStreamReader xmlr = XMLInputFactory.newInstance().createXMLStreamReader(fileName, new FileInputStream(fileName));

                while (xmlr.hasNext()) {
                    xmlr.next();
                    if (xmlr.isStartElement()) {
                        System.out.println(xmlr.getLocalName());
                    } else if (xmlr.isEndElement()) {
                        System.out.println("/" + xmlr.getLocalName());
                    } else if (xmlr.hasText() && xmlr.getText().trim().length() > 0) {
                        System.out.println("   " + xmlr.getText());
                    }
                }
                xmlr = XMLInputFactory.newInstance().createXMLStreamReader(fileName, new FileInputStream(fileName));
            while (xmlr.hasNext()) {
                xmlr.next();
                if (xmlr.isStartElement()) {
                    String localName = xmlr.getLocalName();
                    switch (localName) {
                        case "firstName" -> firstName = xmlr.getElementText();
                        case "lastName" -> lastName = xmlr.getElementText();
                        case "title" -> title = xmlr.getElementText();
                        case "line" -> lines.append(xmlr.getElementText()).append("\n");
                    }
                }
            }

                String outputFileName = firstName + "_" + lastName + "_" + title + ".txt";
                writeToFile(outputFileName, lines.toString());
                System.out.println("Content from <line> tags was written to " + outputFileName);

        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        }
    }

    private static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
