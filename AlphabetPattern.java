class AlphabetPattern
{
  public static void main(String [] s)
  {
   int a=64;
   for(int i=1; i<=5; i++)
   {
    for(int j=1; j<=i;j++)
    {
      int t=a+j;
      System.out.printf("%c",t);
    }
   System.out.println();
   }
  }
}