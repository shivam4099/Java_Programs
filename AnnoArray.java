class AnnoArray
{  
   static void sum(int x[])
   {
     int total=0;
     for(int i:x) 
     {
     total+=i;
   
   }
   System.out.println(total);
}
  public static void main(String [] s)
  {
    AnnoArray.sum(new int[]{1,3,3,5,65} );
  }
 } 
