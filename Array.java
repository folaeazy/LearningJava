// Array in Java.........

public class Array
{
    

    //printing an array

    public int singleArray()
    {
        int knownvalues[] = {2,4,5,7};
        int unknownvalues[] = new int[5];  //specifying size of the array//
        for(int x = 0; x < 4; x++)
        {
            System.out.println(knownvalues[x]);
        }
        return 0;
    }

    public int multiArray() // (row,col)
    {
        int nums[][] = new int[3][4];

        // inserting into 2D array using math class random value
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                nums[x][y] = (int)(Math.random() * 100);
            }
            
        }


        // printing 2D array
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                System.out.print(nums[x][y] + " ");
            }
            System.out.println();
        }
        return 0;
    }


    public static void main(String[] args)
    {
        Array objs = new Array();

        //objs.singleArray();
        //objs.multiArray();
        Student s1 = new Student(); // creating object of the class for each studnet 
        s1.rollNo = 1;
        s1.name = "John";
        s1.score = (byte) 10;


        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Ratmond";
        s2.score = (byte) 50;


        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Paul";
        s3.score = (byte) 40;
      

      //creating an array of the student objects

      Student students[] = new Student[3];
      students[0] = s1;
      students[1] = s2;
      students[2] = s3;

      s1.objectArray(students.length,students); // for normal for loop syntax
      s1.objectArray(students); // for enhanced for loop .
    }
   

}

// "object array" --class for student.
class Student 
{
    public int rollNo;
    public String name;
    public byte score;

    public void objectArray(int array, Student students[])
    {
       
        for (int i = 0; i < array ; i++)
        { 
            System.out.println("roll no : " + students[i].rollNo + " name : " + students[i].name + " score: " + students[i].score);
        }


       
    
    }

     //using enhanced loop or forEach loop syntax and method overloading
    public void objectArray(Student students[])
    {
        
        for (Student student : students)
        {
            System.out.println("roll no : " + student.rollNo + " name : " + student.name + " the score is : " + student.score);
        }

    }
    
}



