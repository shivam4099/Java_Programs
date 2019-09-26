class ArrayInterSection
{
 void interSection(int []x,int[]y)
 {
  int size=x.length + y.length;
  int []z=new int [size];
  int temp[]=new int [size];

  for(int i=0; i<x.length; i++)
  {
    for(int j=0; j<y.length-1; j++)
    {
      if(x[i]==y[j])
      {
         System.out.print(x[i] + " ");
      }
    }
  } 
  
 }
 public static void main(String []s)
 {
  ArrayInterSection i=new ArrayInterSection();
  i.interSection(new int[]{10,12,14,24},new int[]{10,14,11,1});

 }
}