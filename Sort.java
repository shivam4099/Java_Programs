class Sort
{
  void sort(int []x)
  {
    int temp;
    for(int i=0;i<x.length; i++)
    {
      for(int j=0; j<x.length-1-i; j++)
      {
        if(x[j]>x[j+1])
        {
         temp=x[j];
         x[j]=x[j+1];
         x[j+1]=temp;
        }
      }
    }
   for(int j:x)
   {
     System.out.print(j+ " ");
   }
  }
  public static void main(String [] t)
  {
   Sort s=new Sort();
   s.sort(new int []{12,20,17,20,5,3,2,9,-0,-1});
  }
}