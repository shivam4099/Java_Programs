class A2zPattern
{
  public static void main(String [] s)
  {
    int k=65;
    while(k!=90)
    {
    for(int i=0; i<5; i++)
    {
     for(int j=0; j<5; j++)
     {
       System.out.printf(" "+"%c",k);
       k++;
     }
     
     System.out.println();
    }
   System.out.printf(" "+"%c",k);
   }
  }
}