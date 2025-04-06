package abstracts;

public class Brand extends Vehicle
{
    
    public Brand(){
        System.out.println("this is brand constructor");
    }
    @Override
    public void electric()
    {
        System.out.println("Tesla Electric..");
    }

    public void gas()
    {
        System.out.println("Benz is Gas......");
    }
}