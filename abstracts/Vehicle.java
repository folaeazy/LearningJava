package abstracts;

abstract class Vehicle  //cannot create object of an abstract class
{
    abstract  void gas();
    abstract  void electric(); 

    public void startEngine()
    {
        System.out.println("starting engine..");
    }
}


