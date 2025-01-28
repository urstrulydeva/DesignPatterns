package FactoryMethodPatternExample;

public class PdfDocFac extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
