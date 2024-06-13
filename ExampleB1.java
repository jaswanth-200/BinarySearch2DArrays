import java.util.Arrays;
public class ExampleB1{
    public static void main(String args[])
    {
        int array[][]={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target=37;
        System.out.println(Arrays.toString(Search(array,target)));
    }
    static int[] Search(int[][] array,int target)
    {
        int r=0;
        int c=array.length-1;
        while(c<array.length && c>=0)
        {
            if(array[r][c]==target)
            {
                return new int[]{r,c};
            }
            else if(array[r][c]>target)
            {
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}