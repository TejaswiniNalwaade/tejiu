public class democlass
{
  public static void main(String args[])
 {
   int a=5;
   int b=6;

   int result=a+b;

   System.err.println(result);
   cal obj=new cal();
   obj.add();
    
 }  
}

class cal
{
  public int add()
  {
    System.out.println("hiiii");
    return 0;
    
  }
}
