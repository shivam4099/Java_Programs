class TwoDMin
{
  void min(int [][]x)
  { 
    int min=x[0][0];
    for(int i=1;i<x.length; i++)
    {
      for(int j=1; j<x[i].length; j++)
       {
         if(x[i][j]<min)
         min=x[i][j];
       }
    }
   System.out.println("The smallest value is :" + min);
  }
  public static void main(String []s)
  {
   TwoDMin m=new TwoDMin();
   m.min(new int [][]{{12,3,4,4,60},{12,4,5,7}});
  }
}