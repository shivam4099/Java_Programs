class BlankFinalVariable
{
  final int x;
  BlankFinalVariable(int x)
  {
    this.x=x;
  }
public static void main(String []s)
  {
    BlankFinalVariable b1= new BlankFinalVariable(102);
   System.out.println(b1.x);
   BlankFinalVariable b2= new BlankFinalVariable(103);
   //b2.x=12;
   System.out.println(b2.x);
  }
}