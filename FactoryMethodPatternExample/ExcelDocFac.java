package FactoryMethodPatternExample;

public class ExcelDocFac extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}
