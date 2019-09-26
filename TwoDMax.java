class TwoDMax
{
  void min(int [][]x)
  {
   int max=x[0][0];
   for(int i=1;i<x.length; i++)
   {
    for(int j=1;j<x[i].length; j++)
     {
      if(x[i][j]>max)
      max=x[i][j];
     }
   }
   System.out.print("The largest value is"+ max);
  }
  public static void  main(String [] s)
  {
   TwoDMax m=new TwoDMax();
   m.min(new int [][]{{1,34,33,21,1},{24,6,0,66,33}});
  }
}