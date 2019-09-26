class Shadowing
{   
   String s="Class Level Variable";
   void show()
   {
     String s="Local variable";
     System.out.println(s);
     
     System.out.println(this.s);
     
     System.out.println("Shadowing Example");
   }
   public static void main(String t[])
   {
     Shadowing s=new Shadowing();
     s.show(); 
     System.out.println(this);

   }
}