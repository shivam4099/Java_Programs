class TriangleBsum
{
    void triangleBsum(int [][]x)
    {
      int temp=0;

/**********Printing Array Element***********/
      for(int i=0; i<x.length; i++)
        {
          for(int j=0; j<x.length; j++)
           {
            System.out.print(x[i][j]+" ");
           }
         System.out.println();
        }

/********Printing the B triangle************/

     System.out.println("Triangle B");
    
     for(int i=0; i<x.length; i++ )
       {
           for(int j=0; j<=i; j++)
             {
                System.out.print(x[i][j]+" ");
             }
       System.out.println();
       }


/**************Subm of triangle B**************/
       for(int i=0; i<x.length; i++)
         {
            for(int j=0; j<=i; j++)
               {
                  temp+=x[i][j];
               }
         }
      System.out.println("Triangle B sum :" + temp);

    }
    public static void main(String [] s)
    {
      TriangleBsum B=new TriangleBsum();
      B.triangleBsum(new int [][]{{1,2,3},{3,4,5},{6,7,8}});    //Passing the Annonymous Array 
    }
}