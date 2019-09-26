class Min
{
  void min(int []x)
  {
   int min=x[0];
   for(int i=1;i<x.length; i++)
   {
     if(x[i]<min)
     min=x[i];
   }
   System.out.print("The smallest value is"+min);
  }
  public static void main(String []s)
  {
    Min m=new Min();
    m.min(new int []{1,3,5,0,8,6,5,6});
  }
}