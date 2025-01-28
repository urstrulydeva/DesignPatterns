package FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("Open the excel document...");
    }
    @Override
    public void close()
    {
        System.out.println("Close the excel document...");
    }
}
