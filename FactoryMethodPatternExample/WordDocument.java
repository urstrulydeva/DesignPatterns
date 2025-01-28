package FactoryMethodPatternExample;

public class WordDocument implements Document {
    @Override
    public void open(){
        System.out.println("Open the word document...");
    }
    @Override
    public void close(){
        System.out.println("Close the word document...");
    }
}
