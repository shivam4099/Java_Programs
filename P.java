class P
{ 
  public static void main(String [] s)
  {
    int cap=65;
    int sm=97;
    int t1;
    for(int i=0; i<5; i++)
    {
      for(int j=0; j<5; j++)
      {
       if(i%2!=0)
       {t1=j+sm;      
       System.out.printf("%c",t1);
       }
       else
       {
       int t= cap+j;
        System.out.printf("%c",t);
        }
      }
    System.out.println();
    }
    
  }
}