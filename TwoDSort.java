class TwoDSort
{
  void sort(int [][]x)
  {
    int temp;
    for(int i=0; i<x.length; i++)
    {
      for(int j=0; j<x.length-1-i;j++)
       if(x[i][j]<x[i+1][j+1])
       {
         temp=x[i][j];
         x[i][j]=x[j+1][i+1];
         x[i+1][j+1]=temp;
       }
    }
   /*for(int z:x[][])
   {
     System.out.print(z);
   }*/
   int k;
   for(int l:x)
   {
     System.out.print(l+ " ");
   }
 }
 public static void main(String[] s)
 {
  TwoDSort o=new TwoDSort();
  o.sort(new int[][]{{12,46,34,2},{20,1,0,12}});
 } 
}