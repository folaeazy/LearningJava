package abstracts;

abstract class Vehicle  //cannot create object of an abstract class
{
    abstract  void gas();
    abstract  void electric(); 

    Vehicle(){
        System.out.println("this is the constructor");
    }

    public void startEngine()
    {
        System.out.println("starting engine..");
    }
}


