class NumberPattern1
{
  public static void main(String [] s)
  { 
   int k=5;
   for(int i=1;i<=5; i++)
   {
    
     for(int j=1;j<=i; j++,k--)
     {
       System.out.print(k);
       
     }
   System.out.println();
   }
   
  }
}