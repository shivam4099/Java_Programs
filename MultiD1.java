class MultiD1
{
   void fun()
   {
     int z[]={1,1,2,3,2};
     for(int i=0; i<z.length; i++)
     {
       z[i]=new int [[z[i]]];
     }
     }
public static void main(String []s)
  {
    MultiD1 d=new MultiD1();
   d.fun();
  }
}