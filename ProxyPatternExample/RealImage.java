package ProxyPatternExample;

public class RealImage implements Image{
    private String filename;
    public RealImage(String fileImage)
    {
        this.filename=filename;
        loadFromRemoteServer();
    }
    private void loadFromRemoteServer(){
        System.out.println("Loading "+filename+" from remote server...");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(filename+ " loaded.");
    }
    @Override
    public void display(){
        System.out.println("Displaying "+filename);
    }
}
