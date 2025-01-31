package leetcode;


public class Leetcode
{
    

    public int[] sumArray(int[] array,  int target)
    {
        int[] result = new int[2];
        for(int x = 0; x < array.length; x++ )
        {
            for(int y = 0; y < array.length; y++ )
            {
                if ((array[x] + array[y]) ==  target){
                    result[0] = y;
                    result[1] = x;
                    break;

                }
            }
        }
        return  result;
    }

}