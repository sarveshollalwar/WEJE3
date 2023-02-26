 class B extends H
{
   void showb()
    {
     System.out.println("second line of command");
    }

     
	
}

class H
{
	
  public static void main(String[] args)
 {
    H ob1 = new H();
     ob1.showa();

    B ob2 = new B();
    ob2.showb();
    ob2.showa();
 }
    void showa()
	   {
	    System.out.println("1st line of command");
	   }
}
