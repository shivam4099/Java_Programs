class MatrixAdd
{
  void matrixAdd(int [][]x,int [][]y)
  {
    System.out.println("-------1st Matrix ---------");
    for(int i=0; i<x.length; i++)
    {
      for(int j=0; j<x.length ;j++)
       {
         System.out.print(x[i][j]+" ");
       }
     System.out.println();
    
    }
    System.out.println("-------2nd Matrix ---------");
   //**********For 2nd Matrix***************
     for(int i=0; i<y.length; i++)
    {
      for(int j=0; j<y.length ;j++)
       {
         System.out.print(y[i][j]+" ");
       }
     System.out.println();
    }
  //************Matrix Addition**************
   
   int [][]a=new int[3][3];
   for(int i=0; i<3; i++)
   {
     for(int j=0; j<3; j++)
     {
       a[i][j]=x[i][j]+y[i][j];
     }
   }
   //************Showing 3rd Matrix*********
   System.out.println("#####Addition of Above 2 Matrix#####");
    for(int i=0; i<a.length; i++)
    {
      for(int j=0; j<a.length ;j++)
       {
         System.out.print(a[i][j]+" ");
       }
     System.out.println();
    }


  }
  public static void main(String []s)
  {
    MatrixAdd M=new MatrixAdd();
    M.matrixAdd(new int[][]{{1,2,3},{2,3,4},{1,2,3}},new int [][]{{2,3,4},{2,3,2},{2,5,1}});
  }
}