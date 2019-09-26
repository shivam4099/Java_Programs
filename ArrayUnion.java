class ArrayUnion
{  
  void union(int []x,int[]y)
  {
    int z_size=x.length+y.length;
    int[]z=new int[z_size];
    for(int i=0; i<x.length; i++)
    {
      z[i]=x[i];
    }
    for(int i=0; i<y.length; i++)
    {
      z[i+x.length]=y[i];
    }
    for(int i:z)
    {
      System.out.print(i+" ");
    }
  }
  public static void main(String []s)
  {
   ArrayUnion u =new ArrayUnion();
   u.union(new int[]{102,1,2,4,2},new int[]{12,4,6,3});  
  }
}