//strings in java .......

public class StringsDemo
{
   

     public static void main(String[] args)
     {

        // string object 
        String name =  new String("Raymond");
         //or 
        String names = "Raymond";

        //String buffer
        //StringBuffer names = "my name";

        new AnonymousObject();// no reference in stack memory that makes it an anonymous object stored in heap memory
         // the show method can be accessed by the anonymous object directly
        new AnonymousObject().show();
     }

}


class AnonymousObject
{
   AnonymousObject()
   {
      System.out.println("anonymous object creating....");

   }

   void show()
   {
      System.out.println("anonymous is here....");
   }
}