class Factorial
{
  void factorial(int num)
  {
    int temp=1;
    for(int i=1; i<=5 ; i++)
    {
      temp=i*temp;
    }
   System.out.print("Factorial ="+temp);
  }
  public static void main(String []s)
  {
   Factorial f=new Factorial();
   f.factorial(5);
  }
}