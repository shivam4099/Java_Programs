class Max
{
  int max(int []x)
  {
   int max=x[0];
   for(int i=1;i<x.length; i++)
   {
     if(x[i]<max)
     {
      max=x[i];
     } 
   }
   System.out.print("The largest value is"+ max);
 return max;
  }
 public static void main(String []s)
 {
   Max m=new Max();
   m.max(new int []{10,2,1,3,5,7,99});

 }
}