package FactoryMethodPatternExample;

public class FactoryTest {

    public static void main(String[] args) {


        DocumentFactory factory;


        factory = new PdfFactory();

        Document doc = factory.createDocument();

        doc.create();


    }

}