package FactoryMethodPatternExample;

public class WordDocFac extends DocumentFactory{
@Override
    public Document createDocument(){
    return new WordDocument();
}
}
