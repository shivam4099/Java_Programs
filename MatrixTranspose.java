class MatrixTranspose
{
  void matrixTranspose(int [][]x)
  {
   for(int i=0; i<x.length; i++)
   {
     for(int j=0; j<x.length; j++)
     {
      System.out.print(x[i][j]+" ");
     }
   System.out.println();
   }
   int [][]a=new int[3][3];
   for(int i=0; i<3; i++)
   {
     for(int j=0; j<3; j++)
      {
       a[i][j]=x[j][i];
      }
   }
   System.out.println("After Tranpose");
   for(int i=0;i<3; i++)
   {
    for(int j=0; j<3; j++)
    {
      System.out.print(a[i][j]+" ");
    }
   System.out.println();
   }
  }
  public static void main(String []s)
  {
   MatrixTranspose m=new MatrixTranspose();
   m.matrixTranspose(new int [][]{{1,2,3},{4,5,6},{7,8,9}} );
  }
}
