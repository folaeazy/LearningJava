//strings in java .......
public class StringsDemo extends AnonymousObject
{
   

   //   public static void main(String[] args)
   //   {

        // string object 
        String name =  new String("Raymond");
         //or 
        String names = "Raymond";

        //String buffer
        //StringBuffer names = "my name";

        //new AnonymousObject();// no reference in stack memory that makes it an anonymous object stored in heap memory
         // the show method can be accessed by the anonymous object directly
        //new AnonymousObject().show();
       


    // }

}


class AnonymousObject
{
   protected int num = 10;

   void show()
   {
      System.out.println("anonymous is here...."+ num);
   }
}


// ---acess modifier
//protected--- can be accessed only in the same package and subclass
//default---- only in the same file 
//private--- only in the same class
//public---everywhere