# Java_Programs
Simple Java Program(Related to Array &amp; Pattern matching)
class P1
{
  public static void main(String []s)
  { int c=64;          
    for(int i=0;i<5;i++)
    {
      for(int j=1; j<=5; j++)
      {
       if(i%2==0)
       {
         System.out.print(j);
       }
       else
       {
        int t=c+j;
        System.out.printf("%c",t);
       }
      }
    System.out.println();
    }
  }
}
//Output of the Program
/*12345
  ABCDE
  12345
  ABCDE
  12345
*/
