class TriangleAsum
{
    void triangleAsum(int x[][])
    {
      int temp=0;

/**************Printing Array x**********/
      for(int i=0; i<x.length; i++)
      {
        for(int j=0; j<x.length; j++)
         {
           System.out.print(x[i][j]+" ");
         }
       System.out.println();
      }

/*************Showing Thriangle B Sum*********/

     System.out.println("Triangle A sum ");
   

    for(int i=0; i<x.length; i++)
       {
          for(int j=2; j>=i; j--)
            {
              temp=x[i][j]+temp;
             
            }
   System.out.println();
       }

      System.out.println(temp);
    
    }
    public static void main(String [] s)
    {
        TriangleAsum sum =new TriangleAsum();
        sum.triangleAsum(new int[][]{{1,1,1},{1,2,1},{1,2,1}});
    }
}