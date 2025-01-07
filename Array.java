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
        objs.multiArray();
    
    }

}



