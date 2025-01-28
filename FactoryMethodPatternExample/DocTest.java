package FactoryMethodPatternExample;

public class DocTest {
    public static void main(String[] args) {
        DocumentFactory wordFac= new WordDocFac();
        Document wordDocument= wordFac.createDocument();
        wordDocument.open();
        wordDocument.close();
        DocumentFactory pdfFac= new PdfDocFac();
        Document pdfDocument= pdfFac.createDocument();
        pdfDocument.open();
        pdfDocument.close();
        DocumentFactory excelFac= new ExcelDocFac();
        Document excelDocument= excelFac.createDocument();
        excelDocument.open();
        excelDocument.close();
    }
}
