class BubbleSort
{
  void sort()
  {
    int []a={19,21,11,88,21,12};
    int temp;
    for(int i=0; i<a.length; i++)
     {
        for(int j=0; j<a.length-1; j++)
        {
          if(a[j]>a[j+1])
          {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }

        }
     }
     for(int x:a)
     {
     System.out.print(x+" ");  
     }
  }
   public static void main(String [] s)
   {
     BubbleSort b=new BubbleSort();
     b.sort();
   }
}