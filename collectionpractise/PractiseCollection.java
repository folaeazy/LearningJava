import java.io.*;
import java.util.*;


public class PractiseCollection {

    public static ArrayList<String> printArray(ArrayList<String> arrList){
        for (String arr : arrList){
            System.out.println(arr);
        }
        return arrList;
    }

    public static void main(String  args[]){

 //---------------------List--------------//
        //ArrayList
        // ArrayList<String> intergerList = new ArrayList<String>();
        // intergerList.add("apple");
        // intergerList.add("grape");
        // intergerList.add("banana");
        // intergerList.add(2,"egg");
        // boolean empty = intergerList.isEmpty();
        // boolean confirm = intergerList.contains("apple");
        // ListIterator<String> iterators = intergerList.listIterator();


        // for (String a : intergerList)
        // {
        //     System.out.println(a);
        // }
        // System.out.println("Array list size is : " + intergerList.size() + 
        //         "\napple is there:  " + confirm +
        //         "\nis empty : " + empty +
        //         "\nHashcode: " + intergerList.hashCode() + 
        //         "\nList iterator: "+ iterators);

        // Collections.sort(intergerList);
        // System.out.println("Array sorted" + intergerList);

        // writing to file first

        // try {
        //     FileOutputStream fileOutputStream = new FileOutputStream("object.txt");
        //     ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //     objectOutputStream.writeObject(intergerList);
        //     objectOutputStream.close();
        //     System.out.println("done writing....");
        // } catch (Exception e) {
        //     System.out.println("Error writing " + e);
        // }
        // //reading objects from a serialized file file [deserialization]

        // try {

        //     FileInputStream file = new FileInputStream("object.txt");
        //     ObjectInputStream fileObject = new ObjectInputStream(file);// turns file  to object
        //     ArrayList fileArrayList = (ArrayList) fileObject.readObject();
        //     System.out.println("done reading file................");
        //     System.out.println(fileArrayList);
            
            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        //reading from a plaintext file into an object then to arrayList

        // ArrayList<String> fileArrayList = new ArrayList<String>();
        // try (BufferedReader bufferedReader = new BufferedReader(new FileReader("object.txt"))){
        //     String eachLine;
        //     while((eachLine = bufferedReader.readLine()) != null){
        //         String[] eachWord = eachLine.split(" "); //reading each word seperated with space
        //         for (String word : eachWord){

        //           fileArrayList.add(word);
        //         }
        //     }
        //     printArray(fileArrayList);

        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        

        //LinkedList

        LinkedList<String> list = new LinkedList<>();

        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // System.out.println(list);



//----------------------Set------------------//
        // HashSet-------// ignores  duplicate

        HashSet<Integer> sets = new HashSet<>();

        sets.add(1);
        sets.add(2);
        sets.add(1);
        sets.add(2);
        
        sets.clear();
        
        System.out.println("Sets: " + sets);

        // Tree Set




        
//-------------Queue------------------------//
        //  LinkList 
        // Priority Queue



//-----------Map-------------------//
        // HashMap
        // TreeMap        




    }

}
