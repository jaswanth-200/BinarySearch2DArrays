import java.util.Arrays;
public class ExampleB2{
    public static void main(String args[])
    {
        int array[][]={{ 1, 2, 3, 4},
                       { 5, 6, 7, 8},
                       { 9,10,11,12},
                       {13,14,15,16}};
        int target=17;
        System.out.println(Arrays.toString(Search(array,target)));
    }
    static int[] SearchArray(int[][] array,int row,int cstart,int cend,int target)
    { 
      while(cstart<=cend)
      {
       int cmid=cstart+(cend-cstart)/2;
       if(array[row][cmid]==target)
       {
        return new int[]{row,cmid};
       }
       if(array[row][cmid]<target)
       {
        cstart=cmid+1;
       }
       else 
       {
        cend=cmid-1;
       }
      }
      return new int[]{-1,-1};
    }
static int[] Search(int[][] array,int target)
{
    int row=array.length;
    int column=array[0].length;
    int cmid=column/2;
    if(row==1)
{
    return SearchArray(array,0,0,column-1,target);
}
int rowstart=0;
int rowend=row-1;
while(rowstart<rowend-1)
{
    int rowmid=rowstart+(rowend-rowstart)/2;
    if(array[rowmid][cmid]<target)
    {
       rowstart=rowmid;
    }
    else if(array[rowmid][cmid]>target)
    {
        rowend=rowmid;
    }
    else{
        return new int[]{rowmid,cmid};
    } 
}
if(array[rowstart][cmid]==target)
{
    return new int[]{rowstart,cmid};
}
if(array[rowstart+1][cmid]==target)
{
    return new int[]{rowstart+1,cmid};
}
if(target<=array[rowstart][cmid-1])
{
    return SearchArray(array,rowstart,0,cmid-1,target);
}
 if(target>=array[rowstart][cmid+1]&& target<=array[rowstart][column-1])
{
    return SearchArray(array,rowstart,cmid+1,column-1,target);
}
 if(target<=array[rowstart+1][cmid-1])
{
    return SearchArray(array,rowstart+1,0,cmid-1,target);
}
if(target>=array[rowstart+1][cmid-1])
{
    return SearchArray(array,rowstart+1,cmid+1,column-1,target);
}
return new int[]{-1,-1};
}
}



