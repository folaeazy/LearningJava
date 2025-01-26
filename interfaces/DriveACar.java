package interfaces;



public class DriveACar implements Drive
{
    public void start()
    {
        System.out.println("Starting a car");
    }

    public void stop()
    {
        System.out.println("Stopping.... a car");
    }
}