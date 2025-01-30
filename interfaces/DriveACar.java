package interfaces;



public class DriveACar implements Drive, Transmission
{
    public void start()
    {
        System.out.println("Starting a car");
    }

    public void stop()
    {
        System.out.println("Stopping.... a car");
    }

    public void manual()
    {
        System.out.println("it is a manual.... a car");
    }

     public void automatic()
    {
        System.out.println("it is a automatic transmission.... a car");
    }
}